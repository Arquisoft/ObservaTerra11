// @SOURCE:C:/Users/Blacky/Documents/GitHub/ObservaTerra11/conf/routes
// @HASH:7f1dff4f3d55644cc0250e4fcf486871d88135f4
// @DATE:Fri May 09 18:11:05 CEST 2014


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:5
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:6
private[this] lazy val controllers_Application_showCountries1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("country"))))
        

// @LINE:7
private[this] lazy val controllers_Application_showIndicators2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("indicator"))))
        

// @LINE:8
private[this] lazy val controllers_Application_showObservations3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("observation"))))
        

// @LINE:9
private[this] lazy val controllers_Application_bars4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("bars/"),DynamicPart("indicator", """[^/]+""",true))))
        

// @LINE:11
private[this] lazy val controllers_API_toXML5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/xml/"),DynamicPart("indicator", """[^/]+""",true))))
        

// @LINE:14
private[this] lazy val controllers_Admin_newCountry6 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("country"))))
        

// @LINE:15
private[this] lazy val controllers_Admin_deleteCountry7 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("country/delete/"),DynamicPart("code", """[^/]+""",true))))
        

// @LINE:16
private[this] lazy val controllers_Admin_newIndicator8 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("indicator"))))
        

// @LINE:17
private[this] lazy val controllers_Admin_deleteIndicator9 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("indicator/delete/"),DynamicPart("code", """[^/]+""",true))))
        

// @LINE:19
private[this] lazy val controllers_API_collaborator10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/col"))))
        

// @LINE:20
private[this] lazy val controllers_Admin_newObservation11 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("observation"))))
        

// @LINE:21
private[this] lazy val controllers_Admin_deleteObservation12 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("observation/delete/"),DynamicPart("code", """[^/]+""",true))))
        

// @LINE:23
private[this] lazy val controllers_Login_login13 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:24
private[this] lazy val controllers_Login_authenticate14 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:26
private[this] lazy val controllers_Application_addIndicator15 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("addIndicator"))))
        

// @LINE:28
private[this] lazy val controllers_Application_addObservation16 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("addObservation"))))
        

// @LINE:31
private[this] lazy val controllers_Application_logout17 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
        

// @LINE:32
private[this] lazy val controllers_Application_logout18 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
        

// @LINE:34
private[this] lazy val controllers_Register_register19 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("register"))))
        

// @LINE:35
private[this] lazy val controllers_Register_isValid20 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("register"))))
        

// @LINE:36
private[this] lazy val controllers_Register_userRegister21 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("register"))))
        

// @LINE:37
private[this] lazy val controllers_Register_businessRegister22 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("register"))))
        

// @LINE:38
private[this] lazy val controllers_Register_collaboratorRegister23 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("register"))))
        

// @LINE:43
private[this] lazy val controllers_API_countries24 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/country"))))
        

// @LINE:44
private[this] lazy val controllers_API_country25 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/country/"),DynamicPart("code", """[^/]+""",true))))
        

// @LINE:45
private[this] lazy val controllers_API_updateCountry26 = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/country/"),DynamicPart("code", """[^/]+""",true))))
        

// @LINE:46
private[this] lazy val controllers_API_addCountry27 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/country"))))
        

// @LINE:47
private[this] lazy val controllers_API_delCountry28 = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/country/"),DynamicPart("code", """[^/]+""",true))))
        

// @LINE:49
private[this] lazy val controllers_API_observations29 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/observation"))))
        

// @LINE:50
private[this] lazy val controllers_API_observationsByIndicator30 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/observation/indicator/"),DynamicPart("indicator", """[^/]+""",true))))
        

// @LINE:51
private[this] lazy val controllers_API_observationsByCountry31 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/observation/country/"),DynamicPart("country", """[^/]+""",true))))
        

// @LINE:54
private[this] lazy val controllers_API_observationsByIndicatorAndCountry32 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/observation/"),DynamicPart("country", """[^/]+""",true),StaticPart("/"),DynamicPart("indicator", """[^/]+""",true))))
        

// @LINE:58
private[this] lazy val controllers_API_addObservation33 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/observation/"),DynamicPart("country", """[^/]+""",true),StaticPart("/"),DynamicPart("indicator", """[^/]+""",true))))
        

// @LINE:59
private[this] lazy val controllers_API_delObservation34 = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/observation/"),DynamicPart("country", """[^/]+""",true),StaticPart("/"),DynamicPart("indicator", """[^/]+""",true))))
        

// @LINE:61
private[this] lazy val controllers_API_uploadExcel35 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/excel/upload"))))
        

// @LINE:64
private[this] lazy val controllers_API_countriesHATEOAS36 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api2/country"))))
        

// @LINE:65
private[this] lazy val controllers_API_countryHATEOAS37 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api2/country/"),DynamicPart("code", """[^/]+""",true))))
        

// @LINE:66
private[this] lazy val controllers_API_updateCountry38 = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api2/country/"),DynamicPart("code", """[^/]+""",true))))
        

// @LINE:67
private[this] lazy val controllers_API_addCountry39 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api2/country"))))
        

// @LINE:68
private[this] lazy val controllers_API_delCountry40 = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api2/country/"),DynamicPart("code", """[^/]+""",true))))
        

// @LINE:72
private[this] lazy val controllers_Assets_at41 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        

// @LINE:75
private[this] lazy val controllers_Pruebas_proxy42 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("proxy"))))
        

// @LINE:76
private[this] lazy val controllers_Pruebas_ajax43 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("ajax"))))
        

// @LINE:77
private[this] lazy val controllers_Pruebas_parallel44 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("parallel"))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """country""","""controllers.Application.showCountries()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """indicator""","""controllers.Application.showIndicators()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """observation""","""controllers.Application.showObservations()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """bars/$indicator<[^/]+>""","""controllers.Application.bars(indicator:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/xml/$indicator<[^/]+>""","""controllers.API.toXML(indicator:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """country""","""controllers.Admin.newCountry()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """country/delete/$code<[^/]+>""","""controllers.Admin.deleteCountry(code:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """indicator""","""controllers.Admin.newIndicator()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """indicator/delete/$code<[^/]+>""","""controllers.Admin.deleteIndicator(code:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/col""","""controllers.API.collaborator()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """observation""","""controllers.Admin.newObservation()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """observation/delete/$code<[^/]+>""","""controllers.Admin.deleteObservation(code:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Login.login()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Login.authenticate()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """addIndicator""","""controllers.Application.addIndicator()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """addObservation""","""controllers.Application.addObservation()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.Application.logout()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.Application.logout()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """register""","""controllers.Register.register()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """register""","""controllers.Register.isValid()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """register""","""controllers.Register.userRegister()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """register""","""controllers.Register.businessRegister()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """register""","""controllers.Register.collaboratorRegister()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/country""","""controllers.API.countries()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/country/$code<[^/]+>""","""controllers.API.country(code:String)"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/country/$code<[^/]+>""","""controllers.API.updateCountry(code:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/country""","""controllers.API.addCountry()"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/country/$code<[^/]+>""","""controllers.API.delCountry(code:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/observation""","""controllers.API.observations()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/observation/indicator/$indicator<[^/]+>""","""controllers.API.observationsByIndicator(indicator:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/observation/country/$country<[^/]+>""","""controllers.API.observationsByCountry(country:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/observation/$country<[^/]+>/$indicator<[^/]+>""","""controllers.API.observationsByIndicatorAndCountry(country:String, indicator:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/observation/$country<[^/]+>/$indicator<[^/]+>""","""controllers.API.addObservation(country:String, indicator:String)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/observation/$country<[^/]+>/$indicator<[^/]+>""","""controllers.API.delObservation(country:String, indicator:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/excel/upload""","""controllers.API.uploadExcel()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api2/country""","""controllers.API.countriesHATEOAS()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api2/country/$code<[^/]+>""","""controllers.API.countryHATEOAS(code:String)"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api2/country/$code<[^/]+>""","""controllers.API.updateCountry(code:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api2/country""","""controllers.API.addCountry()"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api2/country/$code<[^/]+>""","""controllers.API.delCountry(code:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """proxy""","""controllers.Pruebas.proxy(url:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """ajax""","""controllers.Pruebas.ajax()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """parallel""","""controllers.Pruebas.parallel()""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:5
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """""", Routes.prefix + """"""))
   }
}
        

// @LINE:6
case controllers_Application_showCountries1(params) => {
   call { 
        invokeHandler(controllers.Application.showCountries(), HandlerDef(this, "controllers.Application", "showCountries", Nil,"GET", """""", Routes.prefix + """country"""))
   }
}
        

// @LINE:7
case controllers_Application_showIndicators2(params) => {
   call { 
        invokeHandler(controllers.Application.showIndicators(), HandlerDef(this, "controllers.Application", "showIndicators", Nil,"GET", """""", Routes.prefix + """indicator"""))
   }
}
        

// @LINE:8
case controllers_Application_showObservations3(params) => {
   call { 
        invokeHandler(controllers.Application.showObservations(), HandlerDef(this, "controllers.Application", "showObservations", Nil,"GET", """""", Routes.prefix + """observation"""))
   }
}
        

// @LINE:9
case controllers_Application_bars4(params) => {
   call(params.fromPath[String]("indicator", None)) { (indicator) =>
        invokeHandler(controllers.Application.bars(indicator), HandlerDef(this, "controllers.Application", "bars", Seq(classOf[String]),"GET", """""", Routes.prefix + """bars/$indicator<[^/]+>"""))
   }
}
        

// @LINE:11
case controllers_API_toXML5(params) => {
   call(params.fromPath[String]("indicator", None)) { (indicator) =>
        invokeHandler(controllers.API.toXML(indicator), HandlerDef(this, "controllers.API", "toXML", Seq(classOf[String]),"GET", """""", Routes.prefix + """api/xml/$indicator<[^/]+>"""))
   }
}
        

// @LINE:14
case controllers_Admin_newCountry6(params) => {
   call { 
        invokeHandler(controllers.Admin.newCountry(), HandlerDef(this, "controllers.Admin", "newCountry", Nil,"POST", """""", Routes.prefix + """country"""))
   }
}
        

// @LINE:15
case controllers_Admin_deleteCountry7(params) => {
   call(params.fromPath[String]("code", None)) { (code) =>
        invokeHandler(controllers.Admin.deleteCountry(code), HandlerDef(this, "controllers.Admin", "deleteCountry", Seq(classOf[String]),"POST", """""", Routes.prefix + """country/delete/$code<[^/]+>"""))
   }
}
        

// @LINE:16
case controllers_Admin_newIndicator8(params) => {
   call { 
        invokeHandler(controllers.Admin.newIndicator(), HandlerDef(this, "controllers.Admin", "newIndicator", Nil,"POST", """""", Routes.prefix + """indicator"""))
   }
}
        

// @LINE:17
case controllers_Admin_deleteIndicator9(params) => {
   call(params.fromPath[String]("code", None)) { (code) =>
        invokeHandler(controllers.Admin.deleteIndicator(code), HandlerDef(this, "controllers.Admin", "deleteIndicator", Seq(classOf[String]),"POST", """""", Routes.prefix + """indicator/delete/$code<[^/]+>"""))
   }
}
        

// @LINE:19
case controllers_API_collaborator10(params) => {
   call { 
        invokeHandler(controllers.API.collaborator(), HandlerDef(this, "controllers.API", "collaborator", Nil,"GET", """""", Routes.prefix + """api/col"""))
   }
}
        

// @LINE:20
case controllers_Admin_newObservation11(params) => {
   call { 
        invokeHandler(controllers.Admin.newObservation(), HandlerDef(this, "controllers.Admin", "newObservation", Nil,"POST", """""", Routes.prefix + """observation"""))
   }
}
        

// @LINE:21
case controllers_Admin_deleteObservation12(params) => {
   call(params.fromPath[Long]("code", None)) { (code) =>
        invokeHandler(controllers.Admin.deleteObservation(code), HandlerDef(this, "controllers.Admin", "deleteObservation", Seq(classOf[Long]),"POST", """""", Routes.prefix + """observation/delete/$code<[^/]+>"""))
   }
}
        

// @LINE:23
case controllers_Login_login13(params) => {
   call { 
        invokeHandler(controllers.Login.login(), HandlerDef(this, "controllers.Login", "login", Nil,"GET", """""", Routes.prefix + """login"""))
   }
}
        

// @LINE:24
case controllers_Login_authenticate14(params) => {
   call { 
        invokeHandler(controllers.Login.authenticate(), HandlerDef(this, "controllers.Login", "authenticate", Nil,"POST", """""", Routes.prefix + """login"""))
   }
}
        

// @LINE:26
case controllers_Application_addIndicator15(params) => {
   call { 
        invokeHandler(controllers.Application.addIndicator(), HandlerDef(this, "controllers.Application", "addIndicator", Nil,"GET", """""", Routes.prefix + """addIndicator"""))
   }
}
        

// @LINE:28
case controllers_Application_addObservation16(params) => {
   call { 
        invokeHandler(controllers.Application.addObservation(), HandlerDef(this, "controllers.Application", "addObservation", Nil,"GET", """""", Routes.prefix + """addObservation"""))
   }
}
        

// @LINE:31
case controllers_Application_logout17(params) => {
   call { 
        invokeHandler(controllers.Application.logout(), HandlerDef(this, "controllers.Application", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
   }
}
        

// @LINE:32
case controllers_Application_logout18(params) => {
   call { 
        invokeHandler(controllers.Application.logout(), HandlerDef(this, "controllers.Application", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
   }
}
        

// @LINE:34
case controllers_Register_register19(params) => {
   call { 
        invokeHandler(controllers.Register.register(), HandlerDef(this, "controllers.Register", "register", Nil,"GET", """""", Routes.prefix + """register"""))
   }
}
        

// @LINE:35
case controllers_Register_isValid20(params) => {
   call { 
        invokeHandler(controllers.Register.isValid(), HandlerDef(this, "controllers.Register", "isValid", Nil,"POST", """""", Routes.prefix + """register"""))
   }
}
        

// @LINE:36
case controllers_Register_userRegister21(params) => {
   call { 
        invokeHandler(controllers.Register.userRegister(), HandlerDef(this, "controllers.Register", "userRegister", Nil,"POST", """""", Routes.prefix + """register"""))
   }
}
        

// @LINE:37
case controllers_Register_businessRegister22(params) => {
   call { 
        invokeHandler(controllers.Register.businessRegister(), HandlerDef(this, "controllers.Register", "businessRegister", Nil,"POST", """""", Routes.prefix + """register"""))
   }
}
        

// @LINE:38
case controllers_Register_collaboratorRegister23(params) => {
   call { 
        invokeHandler(controllers.Register.collaboratorRegister(), HandlerDef(this, "controllers.Register", "collaboratorRegister", Nil,"POST", """""", Routes.prefix + """register"""))
   }
}
        

// @LINE:43
case controllers_API_countries24(params) => {
   call { 
        invokeHandler(controllers.API.countries(), HandlerDef(this, "controllers.API", "countries", Nil,"GET", """""", Routes.prefix + """api/country"""))
   }
}
        

// @LINE:44
case controllers_API_country25(params) => {
   call(params.fromPath[String]("code", None)) { (code) =>
        invokeHandler(controllers.API.country(code), HandlerDef(this, "controllers.API", "country", Seq(classOf[String]),"GET", """""", Routes.prefix + """api/country/$code<[^/]+>"""))
   }
}
        

// @LINE:45
case controllers_API_updateCountry26(params) => {
   call(params.fromPath[String]("code", None)) { (code) =>
        invokeHandler(controllers.API.updateCountry(code), HandlerDef(this, "controllers.API", "updateCountry", Seq(classOf[String]),"PUT", """""", Routes.prefix + """api/country/$code<[^/]+>"""))
   }
}
        

// @LINE:46
case controllers_API_addCountry27(params) => {
   call { 
        invokeHandler(controllers.API.addCountry(), HandlerDef(this, "controllers.API", "addCountry", Nil,"POST", """""", Routes.prefix + """api/country"""))
   }
}
        

// @LINE:47
case controllers_API_delCountry28(params) => {
   call(params.fromPath[String]("code", None)) { (code) =>
        invokeHandler(controllers.API.delCountry(code), HandlerDef(this, "controllers.API", "delCountry", Seq(classOf[String]),"DELETE", """""", Routes.prefix + """api/country/$code<[^/]+>"""))
   }
}
        

// @LINE:49
case controllers_API_observations29(params) => {
   call { 
        invokeHandler(controllers.API.observations(), HandlerDef(this, "controllers.API", "observations", Nil,"GET", """""", Routes.prefix + """api/observation"""))
   }
}
        

// @LINE:50
case controllers_API_observationsByIndicator30(params) => {
   call(params.fromPath[String]("indicator", None)) { (indicator) =>
        invokeHandler(controllers.API.observationsByIndicator(indicator), HandlerDef(this, "controllers.API", "observationsByIndicator", Seq(classOf[String]),"GET", """""", Routes.prefix + """api/observation/indicator/$indicator<[^/]+>"""))
   }
}
        

// @LINE:51
case controllers_API_observationsByCountry31(params) => {
   call(params.fromPath[String]("country", None)) { (country) =>
        invokeHandler(controllers.API.observationsByCountry(country), HandlerDef(this, "controllers.API", "observationsByCountry", Seq(classOf[String]),"GET", """""", Routes.prefix + """api/observation/country/$country<[^/]+>"""))
   }
}
        

// @LINE:54
case controllers_API_observationsByIndicatorAndCountry32(params) => {
   call(params.fromPath[String]("country", None), params.fromPath[String]("indicator", None)) { (country, indicator) =>
        invokeHandler(controllers.API.observationsByIndicatorAndCountry(country, indicator), HandlerDef(this, "controllers.API", "observationsByIndicatorAndCountry", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """api/observation/$country<[^/]+>/$indicator<[^/]+>"""))
   }
}
        

// @LINE:58
case controllers_API_addObservation33(params) => {
   call(params.fromPath[String]("country", None), params.fromPath[String]("indicator", None)) { (country, indicator) =>
        invokeHandler(controllers.API.addObservation(country, indicator), HandlerDef(this, "controllers.API", "addObservation", Seq(classOf[String], classOf[String]),"POST", """""", Routes.prefix + """api/observation/$country<[^/]+>/$indicator<[^/]+>"""))
   }
}
        

// @LINE:59
case controllers_API_delObservation34(params) => {
   call(params.fromPath[String]("country", None), params.fromPath[String]("indicator", None)) { (country, indicator) =>
        invokeHandler(controllers.API.delObservation(country, indicator), HandlerDef(this, "controllers.API", "delObservation", Seq(classOf[String], classOf[String]),"DELETE", """""", Routes.prefix + """api/observation/$country<[^/]+>/$indicator<[^/]+>"""))
   }
}
        

// @LINE:61
case controllers_API_uploadExcel35(params) => {
   call { 
        invokeHandler(controllers.API.uploadExcel(), HandlerDef(this, "controllers.API", "uploadExcel", Nil,"POST", """""", Routes.prefix + """api/excel/upload"""))
   }
}
        

// @LINE:64
case controllers_API_countriesHATEOAS36(params) => {
   call { 
        invokeHandler(controllers.API.countriesHATEOAS(), HandlerDef(this, "controllers.API", "countriesHATEOAS", Nil,"GET", """ API2 showing the concept of HATEOAS""", Routes.prefix + """api2/country"""))
   }
}
        

// @LINE:65
case controllers_API_countryHATEOAS37(params) => {
   call(params.fromPath[String]("code", None)) { (code) =>
        invokeHandler(controllers.API.countryHATEOAS(code), HandlerDef(this, "controllers.API", "countryHATEOAS", Seq(classOf[String]),"GET", """""", Routes.prefix + """api2/country/$code<[^/]+>"""))
   }
}
        

// @LINE:66
case controllers_API_updateCountry38(params) => {
   call(params.fromPath[String]("code", None)) { (code) =>
        invokeHandler(controllers.API.updateCountry(code), HandlerDef(this, "controllers.API", "updateCountry", Seq(classOf[String]),"PUT", """""", Routes.prefix + """api2/country/$code<[^/]+>"""))
   }
}
        

// @LINE:67
case controllers_API_addCountry39(params) => {
   call { 
        invokeHandler(controllers.API.addCountry(), HandlerDef(this, "controllers.API", "addCountry", Nil,"POST", """""", Routes.prefix + """api2/country"""))
   }
}
        

// @LINE:68
case controllers_API_delCountry40(params) => {
   call(params.fromPath[String]("code", None)) { (code) =>
        invokeHandler(controllers.API.delCountry(code), HandlerDef(this, "controllers.API", "delCountry", Seq(classOf[String]),"DELETE", """""", Routes.prefix + """api2/country/$code<[^/]+>"""))
   }
}
        

// @LINE:72
case controllers_Assets_at41(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        

// @LINE:75
case controllers_Pruebas_proxy42(params) => {
   call(params.fromQuery[String]("url", None)) { (url) =>
        invokeHandler(controllers.Pruebas.proxy(url), HandlerDef(this, "controllers.Pruebas", "proxy", Seq(classOf[String]),"GET", """ Ejemplos """, Routes.prefix + """proxy"""))
   }
}
        

// @LINE:76
case controllers_Pruebas_ajax43(params) => {
   call { 
        invokeHandler(controllers.Pruebas.ajax(), HandlerDef(this, "controllers.Pruebas", "ajax", Nil,"GET", """""", Routes.prefix + """ajax"""))
   }
}
        

// @LINE:77
case controllers_Pruebas_parallel44(params) => {
   call { 
        invokeHandler(controllers.Pruebas.parallel(), HandlerDef(this, "controllers.Pruebas", "parallel", Nil,"GET", """""", Routes.prefix + """parallel"""))
   }
}
        
}

}
     