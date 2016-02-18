package controllers

import commons.{DecodeProtobuf, CommonController}
import oto.Person
import play.api.mvc.Action
import play.api.libs.ws.{WS, WSResponse}
import play.api.Play.current
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

/**
  *
  */
object  Test extends CommonController{


  def test = Action {
//    implicit request =>

      val protobuf: Person = Person(Some("harry"),Some(1),Some("harry.laoulakos@gmail.com"))
      Ok(protobuf)
  }


  def test2 = Action.async {
    implicit request =>
  val a: Future[Person] =   WS.url("http://localhost:9000/test").get().map(_.bodyAsBytes).map(Person.parseFrom(_))
//    Person.parseFrom()

      a.map(p=>Ok(s"${p.name} ${p.id} ${p.email} ${p.serializedSize}"))
  }


//  def test3 = DecodeProtobuf(classOf[Person]) {
//    stack :Person =>
//    Action {
//     Ok(stack)
//    }
//  }

}
