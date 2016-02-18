
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/harrylaou/workspace/ScalaPB/conf/routes
// @DATE:Wed Feb 17 16:55:44 CET 2016

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseTest Test = new controllers.ReverseTest(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseTest Test = new controllers.javascript.ReverseTest(RoutesPrefix.byNamePrefix());
  }

}
