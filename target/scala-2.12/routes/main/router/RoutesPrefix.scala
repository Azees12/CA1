
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/play/h4/conf/routes
// @DATE:Mon Mar 12 02:43:39 GMT 2018


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
