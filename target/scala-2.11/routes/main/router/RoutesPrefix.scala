
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/harrylaou/workspace/ScalaPB/conf/routes
// @DATE:Wed Feb 17 16:55:44 CET 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
