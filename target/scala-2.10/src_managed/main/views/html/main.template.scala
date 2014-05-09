
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
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import play.i18n._


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*4.1*/("""
<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(Seq[Any](/*9.17*/title)),format.raw/*9.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*10.54*/routes/*10.60*/.Assets.at("stylesheets/main.css"))),format.raw/*10.94*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*11.54*/routes/*11.60*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*11.99*/("""">
        <link rel="stylesheet" media="screen" href='"""),_display_(Seq[Any](/*12.54*/routes/*12.60*/.Assets.at("stylesheets/bars.css"))),format.raw/*12.94*/("""' >
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*13.59*/routes/*13.65*/.Assets.at("images/favicon.png"))),format.raw/*13.97*/("""">
  <script src=""""),_display_(Seq[Any](/*14.17*/routes/*14.23*/.Assets.at("javascripts/bootstrap.js"))),format.raw/*14.61*/("""" type="text/javascript"></script>
  <script src=""""),_display_(Seq[Any](/*15.17*/routes/*15.23*/.Assets.at("javascripts/jquery.js"))),format.raw/*15.58*/("""" type="text/javascript"></script>
  <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*16.48*/routes/*16.54*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*16.93*/("""">
  <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*17.48*/routes/*17.54*/.Assets.at("stylesheets/navbar.css"))),format.raw/*17.90*/("""">

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
       <li><a href="/">"""),_display_(Seq[Any](/*35.25*/Messages/*35.33*/.get("back"))),format.raw/*35.45*/("""</a></li>
       """),_display_(Seq[Any](/*36.9*/if(session().get("id")==null)/*36.38*/{_display_(Seq[Any](format.raw/*36.39*/("""
      <li><a>"""),_display_(Seq[Any](/*37.15*/Messages/*37.23*/.get("Login"))),format.raw/*37.36*/("""</a>
      <li><a href="register">"""),_display_(Seq[Any](/*38.31*/Messages/*38.39*/.get("Registro"))),format.raw/*38.55*/("""</a>
      """)))}/*39.9*/else/*39.13*/{_display_(Seq[Any](format.raw/*39.14*/("""
        <li><a href="/logout">"""),_display_(Seq[Any](/*40.32*/Messages/*40.40*/.get("Salir"))),format.raw/*40.53*/("""</a></li>
      """)))})),format.raw/*41.8*/("""
     </ul>
     </div>
   </div><!--/.nav-collapse -->
 </div>
     <div class="container">
     <h1>"""),_display_(Seq[Any](/*47.11*/title)),format.raw/*47.16*/("""</h1>

     """),_display_(Seq[Any](/*49.7*/content)),format.raw/*49.14*/("""

"""),_display_(Seq[Any](/*51.2*/if(session().get("id") != null)/*51.33*/ {_display_(Seq[Any](format.raw/*51.35*/("""
"""),_display_(Seq[Any](/*52.2*/if(session().get("type").equals("admin"))/*52.43*/{_display_(Seq[Any](format.raw/*52.44*/("""
    <footer>
    <nav>
    """),_display_(Seq[Any](/*55.6*/Messages/*55.14*/.get("Admin"))),format.raw/*55.27*/("""
    <ul>


    <li><a href=""""),_display_(Seq[Any](/*59.19*/routes/*59.25*/.Application.showCountries)),format.raw/*59.51*/("""">Countries</a>
	<li><a href=""""),_display_(Seq[Any](/*60.16*/routes/*60.22*/.Application.showIndicators)),format.raw/*60.49*/("""">Indicators</a>
	<li><a href=""""),_display_(Seq[Any](/*61.16*/routes/*61.22*/.Application.showObservations)),format.raw/*61.51*/("""">Observations</a>
	</ul>
    </nav>
    </footer>
    """)))})),format.raw/*65.6*/("""
    """)))})),format.raw/*66.6*/("""
  </div>
  <div id="session">
     """),_display_(Seq[Any](/*69.7*/if(session().get("id")==null)/*69.36*/{_display_(Seq[Any](format.raw/*69.37*/("""
     	<p class="lead">"""),_display_(Seq[Any](/*70.24*/Messages/*70.32*/.get("navegando.anonimo"))),format.raw/*70.57*/("""</p>
		""")))}/*71.5*/else/*71.9*/{_display_(Seq[Any](format.raw/*71.10*/("""
		<br/>
			<p> """),_display_(Seq[Any](/*73.9*/Messages/*73.17*/.get("Welcome"))),format.raw/*73.32*/(""" """),_display_(Seq[Any](/*73.34*/session()/*73.43*/.get("id"))),format.raw/*73.53*/(""", """),_display_(Seq[Any](/*73.56*/Messages/*73.64*/.get("tugrupo"))),format.raw/*73.79*/(""" """),_display_(Seq[Any](/*73.81*/session()/*73.90*/.get("type"))),format.raw/*73.102*/("""</p>
		""")))})),format.raw/*74.4*/("""
	</div>
  </div>
    </body>
</html>
"""))}
    }
    
    def render(title:String,content:Html): play.api.templates.HtmlFormat.Appendable = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri May 09 19:55:59 CEST 2014
                    SOURCE: C:/Users/Blacky/Documents/GitHub/ObservaTerra11/app/views/main.scala.html
                    HASH: abf99adc436a10bcd19773a57b1d2d7ad46cc34d
                    MATRIX: 778->1|922->31|952->56|1044->113|1070->118|1169->181|1184->187|1240->221|1333->278|1348->284|1409->323|1502->380|1517->386|1573->420|1672->483|1687->489|1741->521|1797->541|1812->547|1872->585|1960->637|1975->643|2032->678|2151->761|2166->767|2227->806|2314->857|2329->863|2387->899|3074->1550|3091->1558|3125->1570|3179->1589|3217->1618|3256->1619|3308->1635|3325->1643|3360->1656|3432->1692|3449->1700|3487->1716|3518->1730|3531->1734|3570->1735|3639->1768|3656->1776|3691->1789|3740->1807|3885->1916|3912->1921|3962->1936|3991->1943|4031->1948|4071->1979|4111->1981|4149->1984|4199->2025|4238->2026|4305->2058|4322->2066|4357->2079|4427->2113|4442->2119|4490->2145|4558->2177|4573->2183|4622->2210|4691->2243|4706->2249|4757->2278|4848->2338|4886->2345|4961->2385|4999->2414|5038->2415|5099->2440|5116->2448|5163->2473|5190->2483|5202->2487|5241->2488|5295->2507|5312->2515|5349->2530|5387->2532|5405->2541|5437->2551|5476->2554|5493->2562|5530->2577|5568->2579|5586->2588|5621->2600|5661->2609
                    LINES: 26->1|30->1|32->4|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|63->35|63->35|63->35|64->36|64->36|64->36|65->37|65->37|65->37|66->38|66->38|66->38|67->39|67->39|67->39|68->40|68->40|68->40|69->41|75->47|75->47|77->49|77->49|79->51|79->51|79->51|80->52|80->52|80->52|83->55|83->55|83->55|87->59|87->59|87->59|88->60|88->60|88->60|89->61|89->61|89->61|93->65|94->66|97->69|97->69|97->69|98->70|98->70|98->70|99->71|99->71|99->71|101->73|101->73|101->73|101->73|101->73|101->73|101->73|101->73|101->73|101->73|101->73|101->73|102->74
                    -- GENERATED --
                */
            