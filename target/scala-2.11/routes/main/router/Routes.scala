
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/harrylaou/workspace/ScalaPB/conf/routes
// @DATE:Wed Feb 17 16:55:44 CET 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

object Routes extends Routes

class Routes extends GeneratedRouter {

  import ReverseRouteContext.empty

  override val errorHandler: play.api.http.HttpErrorHandler = play.api.http.LazyHttpErrorHandler

  private var _prefix = "/"

  def withPrefix(prefix: String): Routes = {
    _prefix = prefix
    router.RoutesPrefix.setPrefix(prefix)
    
    this
  }

  def prefix: String = _prefix

  lazy val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation: Seq[(String, String, String)] = List(
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """test""", """controllers.Test.test"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """test2""", """controllers.Test.test2"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:1
  private[this] lazy val controllers_Test_test0_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("test")))
  )
  private[this] lazy val controllers_Test_test0_invoker = createInvoker(
    controllers.Test.test,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Test",
      "test",
      Nil,
      "GET",
      """""",
      this.prefix + """test"""
    )
  )

  // @LINE:2
  private[this] lazy val controllers_Test_test21_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("test2")))
  )
  private[this] lazy val controllers_Test_test21_invoker = createInvoker(
    controllers.Test.test2,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Test",
      "test2",
      Nil,
      "GET",
      """""",
      this.prefix + """test2"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:1
    case controllers_Test_test0_route(params) =>
      call { 
        controllers_Test_test0_invoker.call(controllers.Test.test)
      }
  
    // @LINE:2
    case controllers_Test_test21_route(params) =>
      call { 
        controllers_Test_test21_invoker.call(controllers.Test.test2)
      }
  }
}