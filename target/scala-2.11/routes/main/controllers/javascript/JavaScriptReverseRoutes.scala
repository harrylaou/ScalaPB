
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/harrylaou/workspace/ScalaPB/conf/routes
// @DATE:Wed Feb 17 16:55:44 CET 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:1
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:1
  class ReverseTest(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:2
    def test2: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Test.test2",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "test2"})
        }
      """
    )
  
    // @LINE:1
    def test: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Test.test",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "test"})
        }
      """
    )
  
  }


}