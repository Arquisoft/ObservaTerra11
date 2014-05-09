
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[List[Observation],List[Country],List[Indicator],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(observations: List[Observation], countries: List[Country], indicators: List[Indicator]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import play.i18n._


Seq[Any](format.raw/*1.90*/("""

"""),format.raw/*4.1*/("""

<html>
    <head>
        <title>ObservaTerra</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*9.54*/routes/*9.60*/.Assets.at("stylesheets/main.css"))),format.raw/*9.94*/("""">
  <link rel="stylesheet" media="screen" href='"""),_display_(Seq[Any](/*10.48*/routes/*10.54*/.Assets.at("stylesheets/bars.css"))),format.raw/*10.88*/("""' >
  <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*11.53*/routes/*11.59*/.Assets.at("images/favicon.png"))),format.raw/*11.91*/("""">

<script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
<script src=""""),_display_(Seq[Any](/*14.15*/routes/*14.21*/.Assets.at("javascripts/jquery.js"))),format.raw/*14.56*/("""" type="text/javascript"></script>
<script src=""""),_display_(Seq[Any](/*15.15*/routes/*15.21*/.Assets.at("javascripts/bootstrap.js"))),format.raw/*15.59*/("""" type="text/javascript"></script>
<link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*16.46*/routes/*16.52*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*16.91*/("""">
<link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*17.46*/routes/*17.52*/.Assets.at("stylesheets/navbar.css"))),format.raw/*17.88*/("""">

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
  <li class="active"><a href="/">"""),_display_(Seq[Any](/*36.35*/Messages/*36.43*/.get("back"))),format.raw/*36.55*/("""</a></li>
  """),_display_(Seq[Any](/*37.4*/if(session().get("id")==null)/*37.33*/{_display_(Seq[Any](format.raw/*37.34*/("""
 <li><a href="/login">"""),_display_(Seq[Any](/*38.24*/Messages/*38.32*/.get("Login"))),format.raw/*38.45*/("""</a>
 <li><a href="register">"""),_display_(Seq[Any](/*39.26*/Messages/*39.34*/.get("Registro"))),format.raw/*39.50*/("""</a>
 """)))}/*40.4*/else/*40.8*/{_display_(Seq[Any](format.raw/*40.9*/("""

   <li><a href="/logout">"""),_display_(Seq[Any](/*42.27*/Messages/*42.35*/.get("Salir"))),format.raw/*42.48*/("""</a></li>
 """)))})),format.raw/*43.3*/("""
</ul>
</div>
</div><!--/.nav-collapse -->
</div>
<br/>
    <div class="page-header">

        <h1>"""),_display_(Seq[Any](/*51.14*/Messages/*51.22*/.get("Welcome"))),format.raw/*51.37*/("""</h1>
     </div>

<h2>"""),_display_(Seq[Any](/*54.6*/Messages/*54.14*/.get("list.observations"))),format.raw/*54.39*/("""</h2>
<table class="table table-bordered">
<tr>
<th class="field-label col-md-3 active">"""),_display_(Seq[Any](/*57.42*/Messages/*57.50*/.get("Country"))),format.raw/*57.65*/("""</th>
<th class="field-label col-md-3 active">"""),_display_(Seq[Any](/*58.42*/Messages/*58.50*/.get("Indicator"))),format.raw/*58.67*/("""</th>
<th class="field-label col-md-3 active">"""),_display_(Seq[Any](/*59.42*/Messages/*59.50*/.get("Value"))),format.raw/*59.63*/("""</th>
"""),_display_(Seq[Any](/*60.2*/if(session().get("id")!=null)/*60.31*/ {_display_(Seq[Any](format.raw/*60.33*/("""
					<th>"""),_display_(Seq[Any](/*61.11*/Messages/*61.19*/.get("Exportar"))),format.raw/*61.35*/("""</th>

				""")))})),format.raw/*63.6*/("""

</tr>
"""),_display_(Seq[Any](/*66.2*/for(observation <- observations) yield /*66.34*/ {_display_(Seq[Any](format.raw/*66.36*/("""
	<tr>
	<td>"""),_display_(Seq[Any](/*68.7*/observation/*68.18*/.country.name)),format.raw/*68.31*/("""</td>
	<td>"""),_display_(Seq[Any](/*69.7*/observation/*69.18*/.indicator.name)),format.raw/*69.33*/("""</td>
	<td>"""),_display_(Seq[Any](/*70.7*/observation/*70.18*/.obsValue)),format.raw/*70.27*/("""</td>
	"""),_display_(Seq[Any](/*71.3*/if(session().get("id")!=null)/*71.32*/ {_display_(Seq[Any](format.raw/*71.34*/("""
					<td><a href="/api/observation/"""),_display_(Seq[Any](/*72.37*/observation/*72.48*/.country.code)),format.raw/*72.61*/("""/"""),_display_(Seq[Any](/*72.63*/observation/*72.74*/.indicator.code)),format.raw/*72.89*/("""">Exportar como Json</a></td>

				""")))})),format.raw/*74.6*/("""
	</tr>
""")))})),format.raw/*76.2*/("""
</table>


"""),_display_(Seq[Any](/*80.2*/if(session().get("id") != null)/*80.33*/{_display_(Seq[Any](format.raw/*80.34*/("""
<h2>"""),_display_(Seq[Any](/*81.6*/Messages/*81.14*/.get("Bar.chart"))),format.raw/*81.31*/("""</h2>
<ul>
"""),_display_(Seq[Any](/*83.2*/for(indicator <- indicators) yield /*83.30*/ {_display_(Seq[Any](format.raw/*83.32*/("""

 <li><a href=""""),_display_(Seq[Any](/*85.16*/routes/*85.22*/.Application.bars(indicator.code))),format.raw/*85.55*/("""">"""),_display_(Seq[Any](/*85.58*/indicator/*85.67*/.name)),format.raw/*85.72*/("""</a></li>

""")))})),format.raw/*87.2*/("""
</ul>
""")))})),format.raw/*89.2*/("""


			"""),_display_(Seq[Any](/*92.5*/if(session().get("id")!=null)/*92.34*/{_display_(Seq[Any](format.raw/*92.35*/("""
				"""),_display_(Seq[Any](/*93.6*/if(session().get("type").contains("business"))/*93.52*/ {_display_(Seq[Any](format.raw/*93.54*/("""
					<li><a href="addIndicator">"""),_display_(Seq[Any](/*94.34*/Messages/*94.42*/.get("agregar.indicador"))),format.raw/*94.67*/("""</a>
					<li><a href="addObservation">"""),_display_(Seq[Any](/*95.36*/Messages/*95.44*/.get("agregar.observacion"))),format.raw/*95.71*/("""</a>
	 			""")))})),format.raw/*96.7*/("""
 			""")))})),format.raw/*97.6*/("""

 			"""),_display_(Seq[Any](/*99.6*/if(session().get("id")!=null)/*99.35*/{_display_(Seq[Any](format.raw/*99.36*/("""
				"""),_display_(Seq[Any](/*100.6*/if(session().get("type").contains("collaborator"))/*100.56*/ {_display_(Seq[Any](format.raw/*100.58*/("""
					<li><a href="addObservation">"""),_display_(Seq[Any](/*101.36*/Messages/*101.44*/.get("agregar.observacion"))),format.raw/*101.71*/("""</a>
	 			""")))})),format.raw/*102.7*/("""
 			""")))})),format.raw/*103.6*/("""

	"""),_display_(Seq[Any](/*105.3*/if(session().get("id")!=null)/*105.32*/{_display_(Seq[Any](format.raw/*105.33*/("""
				"""),_display_(Seq[Any](/*106.6*/if(session().get("type").contains("admin"))/*106.49*/ {_display_(Seq[Any](format.raw/*106.51*/("""
    <footer>
    <nav>
    """),_display_(Seq[Any](/*109.6*/Messages/*109.14*/.get("Admin"))),format.raw/*109.27*/("""
    <ul>
    <li><a href=""""),_display_(Seq[Any](/*111.19*/routes/*111.25*/.Application.showCountries)),format.raw/*111.51*/("""">"""),_display_(Seq[Any](/*111.54*/Messages/*111.62*/.get("Paises"))),format.raw/*111.76*/("""</a>
	<li><a href=""""),_display_(Seq[Any](/*112.16*/routes/*112.22*/.Application.showIndicators)),format.raw/*112.49*/("""">"""),_display_(Seq[Any](/*112.52*/Messages/*112.60*/.get("Indicadores"))),format.raw/*112.79*/("""</a>
	<li><a href=""""),_display_(Seq[Any](/*113.16*/routes/*113.22*/.Application.showObservations)),format.raw/*113.51*/("""">"""),_display_(Seq[Any](/*113.54*/Messages/*113.62*/.get("Observaciones"))),format.raw/*113.83*/("""</a>
	</ul>
    </nav>
    </footer>
 """)))})),format.raw/*117.3*/("""
 """)))})),format.raw/*118.3*/("""
<div id="session">
     """),_display_(Seq[Any](/*120.7*/if(session().get("id")==null)/*120.36*/{_display_(Seq[Any](format.raw/*120.37*/("""
     	<p class="lead">"""),_display_(Seq[Any](/*121.24*/Messages/*121.32*/.get("navegando.anonimo"))),format.raw/*121.57*/("""</p>
		""")))}/*122.5*/else/*122.9*/{_display_(Seq[Any](format.raw/*122.10*/("""
		<br/>
			<p> """),_display_(Seq[Any](/*124.9*/Messages/*124.17*/.get("Welcome"))),format.raw/*124.32*/(""" """),_display_(Seq[Any](/*124.34*/session()/*124.43*/.get("id"))),format.raw/*124.53*/(""", """),_display_(Seq[Any](/*124.56*/Messages/*124.64*/.get("tugrupo"))),format.raw/*124.79*/(""" """),_display_(Seq[Any](/*124.81*/session()/*124.90*/.get("type"))),format.raw/*124.102*/("""</p>
		""")))})),format.raw/*125.4*/("""
	</div>

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
                    DATE: Fri May 09 19:54:02 CEST 2014
                    SOURCE: C:/Users/Blacky/Documents/GitHub/ObservaTerra11/app/views/index.scala.html
                    HASH: 7817051380f1344441a206cfe12ca6f424b9d885
                    MATRIX: 815->1|1017->89|1047->114|1196->228|1210->234|1265->268|1352->319|1367->325|1423->359|1516->416|1531->422|1585->454|1711->544|1726->550|1783->585|1869->635|1884->641|1944->679|2061->760|2076->766|2137->805|2222->854|2237->860|2295->896|2934->1499|2951->1507|2985->1519|3034->1533|3072->1562|3111->1563|3172->1588|3189->1596|3224->1609|3291->1640|3308->1648|3346->1664|3372->1673|3384->1677|3422->1678|3488->1708|3505->1716|3540->1729|3584->1742|3728->1850|3745->1858|3782->1873|3844->1900|3861->1908|3908->1933|4036->2025|4053->2033|4090->2048|4174->2096|4191->2104|4230->2121|4314->2169|4331->2177|4366->2190|4409->2198|4447->2227|4487->2229|4535->2241|4552->2249|4590->2265|4635->2279|4682->2291|4730->2323|4770->2325|4820->2340|4840->2351|4875->2364|4923->2377|4943->2388|4980->2403|5028->2416|5048->2427|5079->2436|5123->2445|5161->2474|5201->2476|5275->2514|5295->2525|5330->2538|5368->2540|5388->2551|5425->2566|5494->2604|5536->2615|5588->2632|5628->2663|5667->2664|5709->2671|5726->2679|5765->2696|5814->2710|5858->2738|5898->2740|5953->2759|5968->2765|6023->2798|6062->2801|6080->2810|6107->2815|6152->2829|6193->2839|6238->2849|6276->2878|6315->2879|6357->2886|6412->2932|6452->2934|6523->2969|6540->2977|6587->3002|6664->3043|6681->3051|6730->3078|6773->3090|6811->3097|6855->3106|6893->3135|6932->3136|6975->3143|7035->3193|7076->3195|7150->3232|7168->3240|7218->3267|7262->3279|7301->3286|7343->3292|7382->3321|7422->3322|7465->3329|7518->3372|7559->3374|7627->3406|7645->3414|7681->3427|7748->3457|7764->3463|7813->3489|7853->3492|7871->3500|7908->3514|7966->3535|7982->3541|8032->3568|8072->3571|8090->3579|8132->3598|8190->3619|8206->3625|8258->3654|8298->3657|8316->3665|8360->3686|8435->3729|8471->3733|8535->3761|8574->3790|8614->3791|8676->3816|8694->3824|8742->3849|8770->3859|8783->3863|8823->3864|8878->3883|8896->3891|8934->3906|8973->3908|8992->3917|9025->3927|9065->3930|9083->3938|9121->3953|9160->3955|9179->3964|9215->3976|9256->3985
                    LINES: 26->1|30->1|32->4|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|64->36|64->36|64->36|65->37|65->37|65->37|66->38|66->38|66->38|67->39|67->39|67->39|68->40|68->40|68->40|70->42|70->42|70->42|71->43|79->51|79->51|79->51|82->54|82->54|82->54|85->57|85->57|85->57|86->58|86->58|86->58|87->59|87->59|87->59|88->60|88->60|88->60|89->61|89->61|89->61|91->63|94->66|94->66|94->66|96->68|96->68|96->68|97->69|97->69|97->69|98->70|98->70|98->70|99->71|99->71|99->71|100->72|100->72|100->72|100->72|100->72|100->72|102->74|104->76|108->80|108->80|108->80|109->81|109->81|109->81|111->83|111->83|111->83|113->85|113->85|113->85|113->85|113->85|113->85|115->87|117->89|120->92|120->92|120->92|121->93|121->93|121->93|122->94|122->94|122->94|123->95|123->95|123->95|124->96|125->97|127->99|127->99|127->99|128->100|128->100|128->100|129->101|129->101|129->101|130->102|131->103|133->105|133->105|133->105|134->106|134->106|134->106|137->109|137->109|137->109|139->111|139->111|139->111|139->111|139->111|139->111|140->112|140->112|140->112|140->112|140->112|140->112|141->113|141->113|141->113|141->113|141->113|141->113|145->117|146->118|148->120|148->120|148->120|149->121|149->121|149->121|150->122|150->122|150->122|152->124|152->124|152->124|152->124|152->124|152->124|152->124|152->124|152->124|152->124|152->124|152->124|153->125
                    -- GENERATED --
                */
            