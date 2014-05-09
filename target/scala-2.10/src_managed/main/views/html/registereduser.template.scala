
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
object registereduser extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[List[Observation],List[Country],List[Indicator],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(observations: List[Observation], countries: List[Country], indicators: List[Indicator]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import play.i18n._


Seq[Any](format.raw/*1.90*/("""

"""),format.raw/*4.1*/("""

<html>
    <head>
        <title>Aqui pondriamos por jemplo el nombre del usuario con arrroba</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*9.54*/routes/*9.60*/.Assets.at("stylesheets/main.css"))),format.raw/*9.94*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*10.54*/routes/*10.60*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*10.99*/("""">
        <link rel="stylesheet" media="screen" href='"""),_display_(Seq[Any](/*11.54*/routes/*11.60*/.Assets.at("stylesheets/bars.css"))),format.raw/*11.94*/("""' >
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*12.59*/routes/*12.65*/.Assets.at("images/favicon.png"))),format.raw/*12.97*/("""">
        <script src=""""),_display_(Seq[Any](/*13.23*/routes/*13.29*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*13.74*/("""" type="text/javascript"></script>
    </head>
    <body>
      <div id="wrap">
        div class="navbar navbar-default navbar-fixed-top" role="navigation">
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
          <li><a href="login">Logout sin implementar</a>
        </ul>
        </div>
        </div><!--/.nav-collapse -->
        </div>

        <div class="page-header">
        <h1>ObservaTerra</h1></a>
     </div>
<h1>"""),_display_(Seq[Any](/*39.6*/Messages/*39.14*/.get("Welcome"))),format.raw/*39.29*/("""</h1>
<h2>"""),_display_(Seq[Any](/*40.6*/Messages/*40.14*/.get("list.observations"))),format.raw/*40.39*/("""</h2>
<table class="table table-bordered">
<tr>
<th class="field-label col-md-3 active">>"""),_display_(Seq[Any](/*43.43*/Messages/*43.51*/.get("Country"))),format.raw/*43.66*/("""</th>
<th class="field-label col-md-3 active">>"""),_display_(Seq[Any](/*44.43*/Messages/*44.51*/.get("Indicator"))),format.raw/*44.68*/("""</th>
<th class="field-label col-md-3 active">>"""),_display_(Seq[Any](/*45.43*/Messages/*45.51*/.get("Value"))),format.raw/*45.64*/("""Value</th>
</tr>
"""),_display_(Seq[Any](/*47.2*/for(observation <- observations) yield /*47.34*/ {_display_(Seq[Any](format.raw/*47.36*/("""
	<tr>
	<td>"""),_display_(Seq[Any](/*49.7*/observation/*49.18*/.country.name)),format.raw/*49.31*/("""</td>
	<td>"""),_display_(Seq[Any](/*50.7*/observation/*50.18*/.indicator.name)),format.raw/*50.33*/("""</td>
	<td>"""),_display_(Seq[Any](/*51.7*/observation/*51.18*/.obsValue)),format.raw/*51.27*/("""</td>
	</tr>
""")))})),format.raw/*53.2*/("""
</table>

<h2>"""),_display_(Seq[Any](/*56.6*/Messages/*56.14*/.get("Bar.chart"))),format.raw/*56.31*/("""</h2>
<ul>
"""),_display_(Seq[Any](/*58.2*/for(indicator <- indicators) yield /*58.30*/ {_display_(Seq[Any](format.raw/*58.32*/("""

 <li><a href=""""),_display_(Seq[Any](/*60.16*/routes/*60.22*/.Application.bars(indicator.code))),format.raw/*60.55*/("""">"""),_display_(Seq[Any](/*60.58*/indicator/*60.67*/.name)),format.raw/*60.72*/("""</a></li>

""")))})),format.raw/*62.2*/("""
</ul>
</div>
    </body>
</html>
"""))}
    }
    
    def render(observations:List[Observation],countries:List[Country],indicators:List[Indicator]): play.api.templates.HtmlFormat.Appendable = apply(observations,countries,indicators)
    
    def f:((List[Observation],List[Country],List[Indicator]) => play.api.templates.HtmlFormat.Appendable) = (observations,countries,indicators) => apply(observations,countries,indicators)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri May 09 19:42:35 CEST 2014
                    SOURCE: C:/Users/Blacky/Documents/GitHub/ObservaTerra11/app/views/registereduser.scala.html
                    HASH: a9e232630c517645ab149ff9804b0515a9ff6687
                    MATRIX: 824->1|1026->89|1056->114|1253->276|1267->282|1322->316|1415->373|1430->379|1491->418|1584->475|1599->481|1655->515|1754->578|1769->584|1823->616|1885->642|1900->648|1967->693|2943->1634|2960->1642|2997->1657|3044->1669|3061->1677|3108->1702|3237->1795|3254->1803|3291->1818|3376->1867|3393->1875|3432->1892|3517->1941|3534->1949|3569->1962|3624->1982|3672->2014|3712->2016|3762->2031|3782->2042|3817->2055|3865->2068|3885->2079|3922->2094|3970->2107|3990->2118|4021->2127|4068->2143|4122->2162|4139->2170|4178->2187|4227->2201|4271->2229|4311->2231|4366->2250|4381->2256|4436->2289|4475->2292|4493->2301|4520->2306|4565->2320
                    LINES: 26->1|30->1|32->4|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|67->39|67->39|67->39|68->40|68->40|68->40|71->43|71->43|71->43|72->44|72->44|72->44|73->45|73->45|73->45|75->47|75->47|75->47|77->49|77->49|77->49|78->50|78->50|78->50|79->51|79->51|79->51|81->53|84->56|84->56|84->56|86->58|86->58|86->58|88->60|88->60|88->60|88->60|88->60|88->60|90->62
                    -- GENERATED --
                */
            