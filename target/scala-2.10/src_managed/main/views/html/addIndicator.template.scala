
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
object addIndicator extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Indicator],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(form: Form[Indicator]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import play.i18n._


Seq[Any](format.raw/*1.25*/("""

"""),format.raw/*4.1*/("""
<!DOCTYPE html>

<html>
    <head>
        <title>Anadir indicador</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*10.54*/routes/*10.60*/.Assets.at("stylesheets/main.css"))),format.raw/*10.94*/("""">
  <link rel="stylesheet" media="screen" href='"""),_display_(Seq[Any](/*11.48*/routes/*11.54*/.Assets.at("stylesheets/bars.css"))),format.raw/*11.88*/("""' >
  <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*12.53*/routes/*12.59*/.Assets.at("images/favicon.png"))),format.raw/*12.91*/("""">

<script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
<script src=""""),_display_(Seq[Any](/*15.15*/routes/*15.21*/.Assets.at("javascripts/jquery.js"))),format.raw/*15.56*/("""" type="text/javascript"></script>
<script src=""""),_display_(Seq[Any](/*16.15*/routes/*16.21*/.Assets.at("javascripts/bootstrap.js"))),format.raw/*16.59*/("""" type="text/javascript"></script>
<link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*17.46*/routes/*17.52*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*17.91*/("""">
<link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*18.46*/routes/*18.52*/.Assets.at("stylesheets/navbar.css"))),format.raw/*18.88*/("""">
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
       <li><a href="/">"""),_display_(Seq[Any](/*36.25*/Messages/*36.33*/.get("back"))),format.raw/*36.45*/("""</a></li>
       """),_display_(Seq[Any](/*37.9*/if(session().get("id")==null)/*37.38*/{_display_(Seq[Any](format.raw/*37.39*/("""
      <li class="active"><a>"""),_display_(Seq[Any](/*38.30*/Messages/*38.38*/.get("Login"))),format.raw/*38.51*/("""</a>
      <li><a href="register">"""),_display_(Seq[Any](/*39.31*/Messages/*39.39*/.get("Registro"))),format.raw/*39.55*/("""</a>
      """)))}/*40.9*/else/*40.13*/{_display_(Seq[Any](format.raw/*40.14*/("""
        <p> """),_display_(Seq[Any](/*41.14*/Messages/*41.22*/.get("Welcome"))),format.raw/*41.37*/(""" """),_display_(Seq[Any](/*41.39*/session()/*41.48*/.get("id"))),format.raw/*41.58*/(""", """),_display_(Seq[Any](/*41.61*/Messages/*41.69*/.get("tugrupo"))),format.raw/*41.84*/(""" """),_display_(Seq[Any](/*41.86*/session()/*41.95*/.get("type"))),format.raw/*41.107*/("""</p>
         <li><a href="/logout">"""),_display_(Seq[Any](/*42.33*/Messages/*42.41*/.get("Salir"))),format.raw/*42.54*/("""</a></li>
      """)))})),format.raw/*43.8*/("""
     </ul>
     </div>
     </div><!--/.nav-collapse -->
     </div>

     <div class="page-header">
     <h1>Anadir</h1>
     </div>

<h2>"""),_display_(Seq[Any](/*53.6*/{Messages.get("add.indicator")})),format.raw/*53.37*/("""</h2>

	"""),_display_(Seq[Any](/*55.3*/helper/*55.9*/.form(action = routes.Admin.newIndicator())/*55.52*/ {_display_(Seq[Any](format.raw/*55.54*/("""

	    """),_display_(Seq[Any](/*57.7*/helper/*57.13*/.inputText(form("code")))),format.raw/*57.37*/("""
	    """),_display_(Seq[Any](/*58.7*/helper/*58.13*/.inputText(form("name")))),format.raw/*58.37*/("""

        <input type="submit" class="btn btn-default" value=""""),_display_(Seq[Any](/*60.62*/{Messages.get("create")})),format.raw/*60.86*/("""">

    """)))})),format.raw/*62.6*/("""
  </div>
    </body>
</html>
"""))}
    }
    
    def render(form:Form[Indicator]): play.api.templates.HtmlFormat.Appendable = apply(form)
    
    def f:((Form[Indicator]) => play.api.templates.HtmlFormat.Appendable) = (form) => apply(form)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri May 09 19:52:40 CEST 2014
                    SOURCE: C:/Users/Blacky/Documents/GitHub/ObservaTerra11/app/views/addIndicator.scala.html
                    HASH: ef8e14747ccd19b36ff497b9d72f96fbb2a1cc04
                    MATRIX: 790->1|927->24|957->49|1128->184|1143->190|1199->224|1286->275|1301->281|1357->315|1450->372|1465->378|1519->410|1645->500|1660->506|1717->541|1803->591|1818->597|1878->635|1995->716|2010->722|2071->761|2156->810|2171->816|2229->852|2926->1513|2943->1521|2977->1533|3031->1552|3069->1581|3108->1582|3175->1613|3192->1621|3227->1634|3299->1670|3316->1678|3354->1694|3385->1708|3398->1712|3437->1713|3488->1728|3505->1736|3542->1751|3580->1753|3598->1762|3630->1772|3669->1775|3686->1783|3723->1798|3761->1800|3779->1809|3814->1821|3888->1859|3905->1867|3940->1880|3989->1898|4175->2049|4228->2080|4274->2091|4288->2097|4340->2140|4380->2142|4425->2152|4440->2158|4486->2182|4529->2190|4544->2196|4590->2220|4691->2285|4737->2309|4779->2320
                    LINES: 26->1|30->1|32->4|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|64->36|64->36|64->36|65->37|65->37|65->37|66->38|66->38|66->38|67->39|67->39|67->39|68->40|68->40|68->40|69->41|69->41|69->41|69->41|69->41|69->41|69->41|69->41|69->41|69->41|69->41|69->41|70->42|70->42|70->42|71->43|81->53|81->53|83->55|83->55|83->55|83->55|85->57|85->57|85->57|86->58|86->58|86->58|88->60|88->60|90->62
                    -- GENERATED --
                */
            