
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object login extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Login],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(form: Form[Login]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import play.i18n._


Seq[Any](format.raw/*1.21*/("""

"""),format.raw/*4.1*/("""
<html>
    <head>
        <title>"""),_display_(Seq[Any](/*7.17*/Messages/*7.25*/.get("signin"))),format.raw/*7.39*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*8.54*/routes/*8.60*/.Assets.at("stylesheets/main.css"))),format.raw/*8.94*/("""">
        <link rel="stylesheet" media="screen" href='"""),_display_(Seq[Any](/*9.54*/routes/*9.60*/.Assets.at("stylesheets/bars.css"))),format.raw/*9.94*/("""' >
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*10.59*/routes/*10.65*/.Assets.at("images/favicon.png"))),format.raw/*10.97*/("""">

  <script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
  <script src=""""),_display_(Seq[Any](/*13.17*/routes/*13.23*/.Assets.at("javascripts/jquery.js"))),format.raw/*13.58*/("""" type="text/javascript"></script>
  <script src=""""),_display_(Seq[Any](/*14.17*/routes/*14.23*/.Assets.at("javascripts/bootstrap.js"))),format.raw/*14.61*/("""" type="text/javascript"></script>
  <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*15.48*/routes/*15.54*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*15.93*/("""">
  <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*16.48*/routes/*16.54*/.Assets.at("stylesheets/navbar.css"))),format.raw/*16.90*/("""">
  </head>
    <body>
      <div id="wrap">

        <div class="navbar navbar-default navbar-fixed-top" role="navigation">
<div class="container">
  <div class="navbar-header">
    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
      <span class="sr-only">Toggle navigation</span>
      <span class="icon-bar"></span>
      <span class="icon-bar"></span>
      <span class="icon-bar"></span>
    </button>
    <a class="navbar-brand">ObservaTerra</a>
  </div>
  <div id="session" class="collapse navbar-collapse">
    <ul class="nav navbar-nav">
      <li><a href="/">"""),_display_(Seq[Any](/*34.24*/Messages/*34.32*/.get("back"))),format.raw/*34.44*/("""</a></li>
      """),_display_(Seq[Any](/*35.8*/if(session().get("id")==null)/*35.37*/{_display_(Seq[Any](format.raw/*35.38*/("""
     <li class="active"><a>"""),_display_(Seq[Any](/*36.29*/Messages/*36.37*/.get("Login"))),format.raw/*36.50*/("""</a>
     <li><a href="register">"""),_display_(Seq[Any](/*37.30*/Messages/*37.38*/.get("Registro"))),format.raw/*37.54*/("""</a>
     """)))}/*38.8*/else/*38.12*/{_display_(Seq[Any](format.raw/*38.13*/("""
       <p> """),_display_(Seq[Any](/*39.13*/Messages/*39.21*/.get("Welcome"))),format.raw/*39.36*/(""" """),_display_(Seq[Any](/*39.38*/session()/*39.47*/.get("id"))),format.raw/*39.57*/(""", """),_display_(Seq[Any](/*39.60*/Messages/*39.68*/.get("tugrupo"))),format.raw/*39.83*/(""" """),_display_(Seq[Any](/*39.85*/session()/*39.94*/.get("type"))),format.raw/*39.106*/("""</p>
        <li><a href="/logout">"""),_display_(Seq[Any](/*40.32*/Messages/*40.40*/.get("Salir"))),format.raw/*40.53*/("""</a></li>
     """)))})),format.raw/*41.7*/("""
    </ul>
    </div>
  </div><!--/.nav-collapse -->
</div>
<br/>

        """),_display_(Seq[Any](/*48.10*/helper/*48.16*/.form(routes.Login.authenticate)/*48.48*/ {_display_(Seq[Any](format.raw/*48.50*/("""
      <div class="page-header">
        <h1>"""),_display_(Seq[Any](/*50.14*/Messages/*50.22*/.get("signin"))),format.raw/*50.36*/("""</h1>
      </div>
   <p>
     <div class="form-group">
        <label for="username">"""),_display_(Seq[Any](/*54.32*/Messages/*54.40*/.get("username"))),format.raw/*54.56*/("""</label>
       <input type="text" name="username" value=""""),_display_(Seq[Any](/*55.51*/form("username")/*55.67*/.value)),format.raw/*55.73*/("""" id="username">
</div>
 </p>

   <p>
     <div class="form-group">
        <label for="password">"""),_display_(Seq[Any](/*61.32*/Messages/*61.40*/.get("password"))),format.raw/*61.56*/("""</label>
       <input type="password" name="password" value=""""),_display_(Seq[Any](/*62.55*/form("password")/*62.71*/.value)),format.raw/*62.77*/(""""id="password">
     </div>
 </p>
   <p>
       <button type="submit" class="btn btn-default">Login</button>
   </p>
   """),_display_(Seq[Any](/*68.5*/if(form.hasGlobalErrors)/*68.29*/ {_display_(Seq[Any](format.raw/*68.31*/("""
    <p class="error">
        """),_display_(Seq[Any](/*70.10*/form/*70.14*/.globalError.message)),format.raw/*70.34*/("""
    </p>
""")))})),format.raw/*72.2*/("""
""")))})),format.raw/*73.2*/("""
</div>
    </body>
</html>
"""))}
    }
    
    def render(form:Form[Login]): play.api.templates.HtmlFormat.Appendable = apply(form)
    
    def f:((Form[Login]) => play.api.templates.HtmlFormat.Appendable) = (form) => apply(form)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri May 09 19:57:20 CEST 2014
                    SOURCE: C:/Users/Blacky/Documents/GitHub/ObservaTerra11/app/views/login.scala.html
                    HASH: e2f790e586ec35339316c4691418af9e304c90fb
                    MATRIX: 779->1|912->20|942->45|1015->83|1031->91|1066->105|1164->168|1178->174|1233->208|1325->265|1339->271|1394->305|1493->368|1508->374|1562->406|1692->500|1707->506|1764->541|1852->593|1867->599|1927->637|2046->720|2061->726|2122->765|2209->816|2224->822|2282->858|2960->1500|2977->1508|3011->1520|3064->1538|3102->1567|3141->1568|3207->1598|3224->1606|3259->1619|3330->1654|3347->1662|3385->1678|3415->1691|3428->1695|3467->1696|3517->1710|3534->1718|3571->1733|3609->1735|3627->1744|3659->1754|3698->1757|3715->1765|3752->1780|3790->1782|3808->1791|3843->1803|3916->1840|3933->1848|3968->1861|4016->1878|4135->1961|4150->1967|4191->1999|4231->2001|4315->2049|4332->2057|4368->2071|4495->2162|4512->2170|4550->2186|4646->2246|4671->2262|4699->2268|4840->2373|4857->2381|4895->2397|4995->2461|5020->2477|5048->2483|5210->2610|5243->2634|5283->2636|5353->2670|5366->2674|5408->2694|5452->2707|5486->2710
                    LINES: 26->1|30->1|32->4|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|62->34|62->34|62->34|63->35|63->35|63->35|64->36|64->36|64->36|65->37|65->37|65->37|66->38|66->38|66->38|67->39|67->39|67->39|67->39|67->39|67->39|67->39|67->39|67->39|67->39|67->39|67->39|68->40|68->40|68->40|69->41|76->48|76->48|76->48|76->48|78->50|78->50|78->50|82->54|82->54|82->54|83->55|83->55|83->55|89->61|89->61|89->61|90->62|90->62|90->62|96->68|96->68|96->68|98->70|98->70|98->70|100->72|101->73
                    -- GENERATED --
                */
            