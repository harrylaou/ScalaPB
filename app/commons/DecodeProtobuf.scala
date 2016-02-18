package commons

import com.trueaccord.scalapb.GeneratedMessage
import play.api.mvc._

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

trait DecodeProtobuf[P <: GeneratedMessage, A] extends Action[A]
object DecodeProtobuf {
  def base64decode(code: String) = new sun.misc.BASE64Decoder().decodeBuffer(code)
  def apply[P <: GeneratedMessage, A](bodyParser: BodyParser[A], proto: Class[P])
                                     (block: P => Request[A] => Result) = new DecodeProtobuf[P, A] {
    def parser = bodyParser
    def apply(req: Request[A]): Future[Result] = Future{
      req.body.asInstanceOf[AnyContent].asRaw.flatMap { raw =>
        raw.asBytes().map { bytes =>
          try {
            val parseFrom = proto.getMethod("parseFrom", classOf[Array[Byte]])
            val message: P = parseFrom.invoke(proto, bytes).asInstanceOf[P]
            block(message)(req)
          }catch{
            case e:NoSuchMethodException => Results.BadRequest
          }
        }
      }
    }.map {_.getOrElse { Results.InternalServerError }}
  }
  def apply[P <: GeneratedMessage](proto: Class[P])(block: P => Request[AnyContent] => Result): Action[AnyContent] = {
    DecodeProtobuf(BodyParsers.parse.anyContent, proto)(block)
  }
}
