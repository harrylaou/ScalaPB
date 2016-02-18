package commons
import com.trueaccord.scalapb.GeneratedMessage
import oto.Person

import com.google.protobuf.Message
import play.api.http.{Writeable, ContentTypeOf}
import play.api.mvc.Controller
import scala.concurrent.ExecutionContext.Implicits.global
/**
  *
  */
trait  CommonController extends Controller{
//  implicit def contentTypeOf_Protobuf: ContentTypeOf[Message] = {
//    ContentTypeOf[Message](Some("application/x-protobuf"))
//  }
//  implicit def writeableOf_Protobuf: Writeable[Message] = {
//    Writeable[Message]((message:Message) => message.toByteArray)
//  }


  implicit def contentTypeOf_Protobuf: ContentTypeOf[GeneratedMessage] = {
    ContentTypeOf[GeneratedMessage](Some("application/x-protobuf"))
  }
  implicit def writeableOf_Protobuf: Writeable[GeneratedMessage] = {
    Writeable[GeneratedMessage]((message:GeneratedMessage) => message.toByteArray)
  }


//  implicit val contentTypeOfPerson: ContentTypeOf[Person] = {
//    ContentTypeOf[Person](Some("application/x-protobuf"))
//  }
//
//  implicit def writeableOfPerson: Writeable[Person] = {
//    Writeable[Person]((person:Person) => person.companion.toByteArray(person))(contentTypeOfPerson,global)
//  }
}
