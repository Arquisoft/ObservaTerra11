// @SOURCE:C:/Users/Blacky/Documents/GitHub/ObservaTerra11/conf/routes
// @HASH:7f1dff4f3d55644cc0250e4fcf486871d88135f4
// @DATE:Fri May 09 18:11:05 CEST 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:77
// @LINE:76
// @LINE:75
// @LINE:72
// @LINE:68
// @LINE:67
// @LINE:66
// @LINE:65
// @LINE:64
// @LINE:61
// @LINE:59
// @LINE:58
// @LINE:54
// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:32
// @LINE:31
// @LINE:28
// @LINE:26
// @LINE:24
// @LINE:23
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:11
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
// @LINE:5
package controllers {

// @LINE:72
class ReverseAssets {
    

// @LINE:72
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:21
// @LINE:20
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
class ReverseAdmin {
    

// @LINE:16
def newIndicator(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "indicator")
}
                                                

// @LINE:21
def deleteObservation(code:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "observation/delete/" + implicitly[PathBindable[Long]].unbind("code", code))
}
                                                

// @LINE:15
def deleteCountry(code:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "country/delete/" + implicitly[PathBindable[String]].unbind("code", dynamicString(code)))
}
                                                

// @LINE:14
def newCountry(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "country")
}
                                                

// @LINE:20
def newObservation(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "observation")
}
                                                

// @LINE:17
def deleteIndicator(code:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "indicator/delete/" + implicitly[PathBindable[String]].unbind("code", dynamicString(code)))
}
                                                
    
}
                          

// @LINE:77
// @LINE:76
// @LINE:75
class ReversePruebas {
    

// @LINE:75
def proxy(url:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "proxy" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("url", url)))))
}
                                                

// @LINE:76
def ajax(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "ajax")
}
                                                

// @LINE:77
def parallel(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "parallel")
}
                                                
    
}
                          

// @LINE:24
// @LINE:23
class ReverseLogin {
    

// @LINE:24
def authenticate(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "login")
}
                                                

// @LINE:23
def login(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                                                
    
}
                          

// @LINE:32
// @LINE:31
// @LINE:28
// @LINE:26
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
// @LINE:5
class ReverseApplication {
    

// @LINE:7
def showIndicators(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "indicator")
}
                                                

// @LINE:28
def addObservation(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "addObservation")
}
                                                

// @LINE:8
def showObservations(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "observation")
}
                                                

// @LINE:6
def showCountries(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "country")
}
                                                

// @LINE:32
// @LINE:31
def logout(): Call = {
   () match {
// @LINE:31
case () if true => Call("GET", _prefix + { _defaultPrefix } + "logout")
                                                        
// @LINE:32
case () if true => Call("GET", _prefix + { _defaultPrefix } + "logout")
                                                        
   }
}
                                                

// @LINE:9
def bars(indicator:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "bars/" + implicitly[PathBindable[String]].unbind("indicator", dynamicString(indicator)))
}
                                                

// @LINE:26
def addIndicator(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "addIndicator")
}
                                                

// @LINE:5
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          

// @LINE:68
// @LINE:67
// @LINE:66
// @LINE:65
// @LINE:64
// @LINE:61
// @LINE:59
// @LINE:58
// @LINE:54
// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:19
// @LINE:11
class ReverseAPI {
    

// @LINE:49
def observations(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "api/observation")
}
                                                

// @LINE:44
def country(code:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "api/country/" + implicitly[PathBindable[String]].unbind("code", dynamicString(code)))
}
                                                

// @LINE:59
def delObservation(country:String, indicator:String): Call = {
   Call("DELETE", _prefix + { _defaultPrefix } + "api/observation/" + implicitly[PathBindable[String]].unbind("country", dynamicString(country)) + "/" + implicitly[PathBindable[String]].unbind("indicator", dynamicString(indicator)))
}
                                                

// @LINE:11
def toXML(indicator:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "api/xml/" + implicitly[PathBindable[String]].unbind("indicator", dynamicString(indicator)))
}
                                                

// @LINE:19
def collaborator(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "api/col")
}
                                                

// @LINE:68
// @LINE:47
def delCountry(code:String): Call = {
   (code: @unchecked) match {
// @LINE:47
case (code) if true => Call("DELETE", _prefix + { _defaultPrefix } + "api/country/" + implicitly[PathBindable[String]].unbind("code", dynamicString(code)))
                                                        
// @LINE:68
case (code) if true => Call("DELETE", _prefix + { _defaultPrefix } + "api2/country/" + implicitly[PathBindable[String]].unbind("code", dynamicString(code)))
                                                        
   }
}
                                                

// @LINE:54
def observationsByIndicatorAndCountry(country:String, indicator:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "api/observation/" + implicitly[PathBindable[String]].unbind("country", dynamicString(country)) + "/" + implicitly[PathBindable[String]].unbind("indicator", dynamicString(indicator)))
}
                                                

// @LINE:51
def observationsByCountry(country:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "api/observation/country/" + implicitly[PathBindable[String]].unbind("country", dynamicString(country)))
}
                                                

// @LINE:61
def uploadExcel(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "api/excel/upload")
}
                                                

// @LINE:43
def countries(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "api/country")
}
                                                

// @LINE:64
def countriesHATEOAS(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "api2/country")
}
                                                

// @LINE:67
// @LINE:46
def addCountry(): Call = {
   () match {
// @LINE:46
case () if true => Call("POST", _prefix + { _defaultPrefix } + "api/country")
                                                        
// @LINE:67
case () if true => Call("POST", _prefix + { _defaultPrefix } + "api2/country")
                                                        
   }
}
                                                

// @LINE:66
// @LINE:45
def updateCountry(code:String): Call = {
   (code: @unchecked) match {
// @LINE:45
case (code) if true => Call("PUT", _prefix + { _defaultPrefix } + "api/country/" + implicitly[PathBindable[String]].unbind("code", dynamicString(code)))
                                                        
// @LINE:66
case (code) if true => Call("PUT", _prefix + { _defaultPrefix } + "api2/country/" + implicitly[PathBindable[String]].unbind("code", dynamicString(code)))
                                                        
   }
}
                                                

// @LINE:58
def addObservation(country:String, indicator:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "api/observation/" + implicitly[PathBindable[String]].unbind("country", dynamicString(country)) + "/" + implicitly[PathBindable[String]].unbind("indicator", dynamicString(indicator)))
}
                                                

// @LINE:65
def countryHATEOAS(code:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "api2/country/" + implicitly[PathBindable[String]].unbind("code", dynamicString(code)))
}
                                                

// @LINE:50
def observationsByIndicator(indicator:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "api/observation/indicator/" + implicitly[PathBindable[String]].unbind("indicator", dynamicString(indicator)))
}
                                                
    
}
                          

// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
class ReverseRegister {
    

// @LINE:38
def collaboratorRegister(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "register")
}
                                                

// @LINE:36
def userRegister(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "register")
}
                                                

// @LINE:34
def register(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "register")
}
                                                

// @LINE:35
def isValid(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "register")
}
                                                

// @LINE:37
def businessRegister(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "register")
}
                                                
    
}
                          
}
                  


// @LINE:77
// @LINE:76
// @LINE:75
// @LINE:72
// @LINE:68
// @LINE:67
// @LINE:66
// @LINE:65
// @LINE:64
// @LINE:61
// @LINE:59
// @LINE:58
// @LINE:54
// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:32
// @LINE:31
// @LINE:28
// @LINE:26
// @LINE:24
// @LINE:23
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:11
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
// @LINE:5
package controllers.javascript {

// @LINE:72
class ReverseAssets {
    

// @LINE:72
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:21
// @LINE:20
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
class ReverseAdmin {
    

// @LINE:16
def newIndicator : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Admin.newIndicator",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "indicator"})
      }
   """
)
                        

// @LINE:21
def deleteObservation : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Admin.deleteObservation",
   """
      function(code) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "observation/delete/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("code", code)})
      }
   """
)
                        

// @LINE:15
def deleteCountry : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Admin.deleteCountry",
   """
      function(code) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "country/delete/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("code", encodeURIComponent(code))})
      }
   """
)
                        

// @LINE:14
def newCountry : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Admin.newCountry",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "country"})
      }
   """
)
                        

// @LINE:20
def newObservation : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Admin.newObservation",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "observation"})
      }
   """
)
                        

// @LINE:17
def deleteIndicator : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Admin.deleteIndicator",
   """
      function(code) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "indicator/delete/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("code", encodeURIComponent(code))})
      }
   """
)
                        
    
}
              

// @LINE:77
// @LINE:76
// @LINE:75
class ReversePruebas {
    

// @LINE:75
def proxy : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Pruebas.proxy",
   """
      function(url) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "proxy" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("url", url)])})
      }
   """
)
                        

// @LINE:76
def ajax : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Pruebas.ajax",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ajax"})
      }
   """
)
                        

// @LINE:77
def parallel : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Pruebas.parallel",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "parallel"})
      }
   """
)
                        
    
}
              

// @LINE:24
// @LINE:23
class ReverseLogin {
    

// @LINE:24
def authenticate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Login.authenticate",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

// @LINE:23
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Login.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        
    
}
              

// @LINE:32
// @LINE:31
// @LINE:28
// @LINE:26
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
// @LINE:5
class ReverseApplication {
    

// @LINE:7
def showIndicators : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.showIndicators",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "indicator"})
      }
   """
)
                        

// @LINE:28
def addObservation : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.addObservation",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addObservation"})
      }
   """
)
                        

// @LINE:8
def showObservations : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.showObservations",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "observation"})
      }
   """
)
                        

// @LINE:6
def showCountries : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.showCountries",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "country"})
      }
   """
)
                        

// @LINE:32
// @LINE:31
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.logout",
   """
      function() {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
      }
   """
)
                        

// @LINE:9
def bars : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.bars",
   """
      function(indicator) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bars/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("indicator", encodeURIComponent(indicator))})
      }
   """
)
                        

// @LINE:26
def addIndicator : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.addIndicator",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addIndicator"})
      }
   """
)
                        

// @LINE:5
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              

// @LINE:68
// @LINE:67
// @LINE:66
// @LINE:65
// @LINE:64
// @LINE:61
// @LINE:59
// @LINE:58
// @LINE:54
// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:19
// @LINE:11
class ReverseAPI {
    

// @LINE:49
def observations : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.API.observations",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/observation"})
      }
   """
)
                        

// @LINE:44
def country : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.API.country",
   """
      function(code) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/country/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("code", encodeURIComponent(code))})
      }
   """
)
                        

// @LINE:59
def delObservation : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.API.delObservation",
   """
      function(country,indicator) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "api/observation/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("country", encodeURIComponent(country)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("indicator", encodeURIComponent(indicator))})
      }
   """
)
                        

// @LINE:11
def toXML : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.API.toXML",
   """
      function(indicator) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/xml/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("indicator", encodeURIComponent(indicator))})
      }
   """
)
                        

// @LINE:19
def collaborator : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.API.collaborator",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/col"})
      }
   """
)
                        

// @LINE:68
// @LINE:47
def delCountry : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.API.delCountry",
   """
      function(code) {
      if (true) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "api/country/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("code", encodeURIComponent(code))})
      }
      if (true) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "api2/country/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("code", encodeURIComponent(code))})
      }
      }
   """
)
                        

// @LINE:54
def observationsByIndicatorAndCountry : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.API.observationsByIndicatorAndCountry",
   """
      function(country,indicator) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/observation/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("country", encodeURIComponent(country)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("indicator", encodeURIComponent(indicator))})
      }
   """
)
                        

// @LINE:51
def observationsByCountry : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.API.observationsByCountry",
   """
      function(country) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/observation/country/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("country", encodeURIComponent(country))})
      }
   """
)
                        

// @LINE:61
def uploadExcel : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.API.uploadExcel",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/excel/upload"})
      }
   """
)
                        

// @LINE:43
def countries : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.API.countries",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/country"})
      }
   """
)
                        

// @LINE:64
def countriesHATEOAS : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.API.countriesHATEOAS",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api2/country"})
      }
   """
)
                        

// @LINE:67
// @LINE:46
def addCountry : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.API.addCountry",
   """
      function() {
      if (true) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/country"})
      }
      if (true) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api2/country"})
      }
      }
   """
)
                        

// @LINE:66
// @LINE:45
def updateCountry : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.API.updateCountry",
   """
      function(code) {
      if (true) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "api/country/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("code", encodeURIComponent(code))})
      }
      if (true) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "api2/country/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("code", encodeURIComponent(code))})
      }
      }
   """
)
                        

// @LINE:58
def addObservation : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.API.addObservation",
   """
      function(country,indicator) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/observation/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("country", encodeURIComponent(country)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("indicator", encodeURIComponent(indicator))})
      }
   """
)
                        

// @LINE:65
def countryHATEOAS : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.API.countryHATEOAS",
   """
      function(code) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api2/country/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("code", encodeURIComponent(code))})
      }
   """
)
                        

// @LINE:50
def observationsByIndicator : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.API.observationsByIndicator",
   """
      function(indicator) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/observation/indicator/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("indicator", encodeURIComponent(indicator))})
      }
   """
)
                        
    
}
              

// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
class ReverseRegister {
    

// @LINE:38
def collaboratorRegister : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Register.collaboratorRegister",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "register"})
      }
   """
)
                        

// @LINE:36
def userRegister : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Register.userRegister",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "register"})
      }
   """
)
                        

// @LINE:34
def register : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Register.register",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "register"})
      }
   """
)
                        

// @LINE:35
def isValid : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Register.isValid",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "register"})
      }
   """
)
                        

// @LINE:37
def businessRegister : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Register.businessRegister",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "register"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:77
// @LINE:76
// @LINE:75
// @LINE:72
// @LINE:68
// @LINE:67
// @LINE:66
// @LINE:65
// @LINE:64
// @LINE:61
// @LINE:59
// @LINE:58
// @LINE:54
// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:32
// @LINE:31
// @LINE:28
// @LINE:26
// @LINE:24
// @LINE:23
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:11
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
// @LINE:5
package controllers.ref {


// @LINE:72
class ReverseAssets {
    

// @LINE:72
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:21
// @LINE:20
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
class ReverseAdmin {
    

// @LINE:16
def newIndicator(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Admin.newIndicator(), HandlerDef(this, "controllers.Admin", "newIndicator", Seq(), "POST", """""", _prefix + """indicator""")
)
                      

// @LINE:21
def deleteObservation(code:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Admin.deleteObservation(code), HandlerDef(this, "controllers.Admin", "deleteObservation", Seq(classOf[Long]), "POST", """""", _prefix + """observation/delete/$code<[^/]+>""")
)
                      

// @LINE:15
def deleteCountry(code:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Admin.deleteCountry(code), HandlerDef(this, "controllers.Admin", "deleteCountry", Seq(classOf[String]), "POST", """""", _prefix + """country/delete/$code<[^/]+>""")
)
                      

// @LINE:14
def newCountry(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Admin.newCountry(), HandlerDef(this, "controllers.Admin", "newCountry", Seq(), "POST", """""", _prefix + """country""")
)
                      

// @LINE:20
def newObservation(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Admin.newObservation(), HandlerDef(this, "controllers.Admin", "newObservation", Seq(), "POST", """""", _prefix + """observation""")
)
                      

// @LINE:17
def deleteIndicator(code:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Admin.deleteIndicator(code), HandlerDef(this, "controllers.Admin", "deleteIndicator", Seq(classOf[String]), "POST", """""", _prefix + """indicator/delete/$code<[^/]+>""")
)
                      
    
}
                          

// @LINE:77
// @LINE:76
// @LINE:75
class ReversePruebas {
    

// @LINE:75
def proxy(url:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Pruebas.proxy(url), HandlerDef(this, "controllers.Pruebas", "proxy", Seq(classOf[String]), "GET", """ Ejemplos """, _prefix + """proxy""")
)
                      

// @LINE:76
def ajax(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Pruebas.ajax(), HandlerDef(this, "controllers.Pruebas", "ajax", Seq(), "GET", """""", _prefix + """ajax""")
)
                      

// @LINE:77
def parallel(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Pruebas.parallel(), HandlerDef(this, "controllers.Pruebas", "parallel", Seq(), "GET", """""", _prefix + """parallel""")
)
                      
    
}
                          

// @LINE:24
// @LINE:23
class ReverseLogin {
    

// @LINE:24
def authenticate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Login.authenticate(), HandlerDef(this, "controllers.Login", "authenticate", Seq(), "POST", """""", _prefix + """login""")
)
                      

// @LINE:23
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Login.login(), HandlerDef(this, "controllers.Login", "login", Seq(), "GET", """""", _prefix + """login""")
)
                      
    
}
                          

// @LINE:32
// @LINE:31
// @LINE:28
// @LINE:26
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
// @LINE:5
class ReverseApplication {
    

// @LINE:7
def showIndicators(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.showIndicators(), HandlerDef(this, "controllers.Application", "showIndicators", Seq(), "GET", """""", _prefix + """indicator""")
)
                      

// @LINE:28
def addObservation(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.addObservation(), HandlerDef(this, "controllers.Application", "addObservation", Seq(), "GET", """""", _prefix + """addObservation""")
)
                      

// @LINE:8
def showObservations(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.showObservations(), HandlerDef(this, "controllers.Application", "showObservations", Seq(), "GET", """""", _prefix + """observation""")
)
                      

// @LINE:6
def showCountries(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.showCountries(), HandlerDef(this, "controllers.Application", "showCountries", Seq(), "GET", """""", _prefix + """country""")
)
                      

// @LINE:31
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.logout(), HandlerDef(this, "controllers.Application", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      

// @LINE:9
def bars(indicator:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.bars(indicator), HandlerDef(this, "controllers.Application", "bars", Seq(classOf[String]), "GET", """""", _prefix + """bars/$indicator<[^/]+>""")
)
                      

// @LINE:26
def addIndicator(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.addIndicator(), HandlerDef(this, "controllers.Application", "addIndicator", Seq(), "GET", """""", _prefix + """addIndicator""")
)
                      

// @LINE:5
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """""", _prefix + """""")
)
                      
    
}
                          

// @LINE:68
// @LINE:67
// @LINE:66
// @LINE:65
// @LINE:64
// @LINE:61
// @LINE:59
// @LINE:58
// @LINE:54
// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:19
// @LINE:11
class ReverseAPI {
    

// @LINE:49
def observations(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.API.observations(), HandlerDef(this, "controllers.API", "observations", Seq(), "GET", """""", _prefix + """api/observation""")
)
                      

// @LINE:44
def country(code:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.API.country(code), HandlerDef(this, "controllers.API", "country", Seq(classOf[String]), "GET", """""", _prefix + """api/country/$code<[^/]+>""")
)
                      

// @LINE:59
def delObservation(country:String, indicator:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.API.delObservation(country, indicator), HandlerDef(this, "controllers.API", "delObservation", Seq(classOf[String], classOf[String]), "DELETE", """""", _prefix + """api/observation/$country<[^/]+>/$indicator<[^/]+>""")
)
                      

// @LINE:11
def toXML(indicator:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.API.toXML(indicator), HandlerDef(this, "controllers.API", "toXML", Seq(classOf[String]), "GET", """""", _prefix + """api/xml/$indicator<[^/]+>""")
)
                      

// @LINE:19
def collaborator(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.API.collaborator(), HandlerDef(this, "controllers.API", "collaborator", Seq(), "GET", """""", _prefix + """api/col""")
)
                      

// @LINE:47
def delCountry(code:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.API.delCountry(code), HandlerDef(this, "controllers.API", "delCountry", Seq(classOf[String]), "DELETE", """""", _prefix + """api/country/$code<[^/]+>""")
)
                      

// @LINE:54
def observationsByIndicatorAndCountry(country:String, indicator:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.API.observationsByIndicatorAndCountry(country, indicator), HandlerDef(this, "controllers.API", "observationsByIndicatorAndCountry", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """api/observation/$country<[^/]+>/$indicator<[^/]+>""")
)
                      

// @LINE:51
def observationsByCountry(country:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.API.observationsByCountry(country), HandlerDef(this, "controllers.API", "observationsByCountry", Seq(classOf[String]), "GET", """""", _prefix + """api/observation/country/$country<[^/]+>""")
)
                      

// @LINE:61
def uploadExcel(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.API.uploadExcel(), HandlerDef(this, "controllers.API", "uploadExcel", Seq(), "POST", """""", _prefix + """api/excel/upload""")
)
                      

// @LINE:43
def countries(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.API.countries(), HandlerDef(this, "controllers.API", "countries", Seq(), "GET", """""", _prefix + """api/country""")
)
                      

// @LINE:64
def countriesHATEOAS(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.API.countriesHATEOAS(), HandlerDef(this, "controllers.API", "countriesHATEOAS", Seq(), "GET", """ API2 showing the concept of HATEOAS""", _prefix + """api2/country""")
)
                      

// @LINE:46
def addCountry(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.API.addCountry(), HandlerDef(this, "controllers.API", "addCountry", Seq(), "POST", """""", _prefix + """api/country""")
)
                      

// @LINE:45
def updateCountry(code:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.API.updateCountry(code), HandlerDef(this, "controllers.API", "updateCountry", Seq(classOf[String]), "PUT", """""", _prefix + """api/country/$code<[^/]+>""")
)
                      

// @LINE:58
def addObservation(country:String, indicator:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.API.addObservation(country, indicator), HandlerDef(this, "controllers.API", "addObservation", Seq(classOf[String], classOf[String]), "POST", """""", _prefix + """api/observation/$country<[^/]+>/$indicator<[^/]+>""")
)
                      

// @LINE:65
def countryHATEOAS(code:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.API.countryHATEOAS(code), HandlerDef(this, "controllers.API", "countryHATEOAS", Seq(classOf[String]), "GET", """""", _prefix + """api2/country/$code<[^/]+>""")
)
                      

// @LINE:50
def observationsByIndicator(indicator:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.API.observationsByIndicator(indicator), HandlerDef(this, "controllers.API", "observationsByIndicator", Seq(classOf[String]), "GET", """""", _prefix + """api/observation/indicator/$indicator<[^/]+>""")
)
                      
    
}
                          

// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
class ReverseRegister {
    

// @LINE:38
def collaboratorRegister(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Register.collaboratorRegister(), HandlerDef(this, "controllers.Register", "collaboratorRegister", Seq(), "POST", """""", _prefix + """register""")
)
                      

// @LINE:36
def userRegister(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Register.userRegister(), HandlerDef(this, "controllers.Register", "userRegister", Seq(), "POST", """""", _prefix + """register""")
)
                      

// @LINE:34
def register(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Register.register(), HandlerDef(this, "controllers.Register", "register", Seq(), "GET", """""", _prefix + """register""")
)
                      

// @LINE:35
def isValid(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Register.isValid(), HandlerDef(this, "controllers.Register", "isValid", Seq(), "POST", """""", _prefix + """register""")
)
                      

// @LINE:37
def businessRegister(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Register.businessRegister(), HandlerDef(this, "controllers.Register", "businessRegister", Seq(), "POST", """""", _prefix + """register""")
)
                      
    
}
                          
}
        
    