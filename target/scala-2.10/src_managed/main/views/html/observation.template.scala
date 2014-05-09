
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
object observation extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[List[Observation],List[Country],List[Indicator],Form[Observation],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(observations: List[Observation],
  countries: List[Country],
  indicators: List[Indicator],
  form: Form[Observation]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import play.i18n._

import helper.twitterBootstrap._


Seq[Any](format.raw/*4.27*/("""

"""),format.raw/*8.1*/("""
"""),_display_(Seq[Any](/*9.2*/main(Messages.get("list.observations"))/*9.41*/ {_display_(Seq[Any](format.raw/*9.43*/("""
  <div id="wrap">
<div class="page-header">
<h1>"""),_display_(Seq[Any](/*12.6*/Messages/*12.14*/.get("observations"))),format.raw/*12.34*/("""</h1>
</div>

<tableclass="table table-bordered">
<tr>
<th class="field-label col-md-3 active">>Id</th>
<th class="field-label col-md-3 active">>Country</th>
<th class="field-label col-md-3 active">>Indicator</th>
<th class="field-label col-md-3 active">>Value</th>
<th class="field-label col-md-3 active">>Remove</th>
</tr>
"""),_display_(Seq[Any](/*23.2*/for(obs <- observations) yield /*23.26*/ {_display_(Seq[Any](format.raw/*23.28*/("""
  <tr>
  <td>"""),_display_(Seq[Any](/*25.8*/obs/*25.11*/.id)),format.raw/*25.14*/("""</td>
  <td>"""),_display_(Seq[Any](/*26.8*/obs/*26.11*/.country.name)),format.raw/*26.24*/("""</td>
  <td>"""),_display_(Seq[Any](/*27.8*/obs/*27.11*/.indicator.name)),format.raw/*27.26*/("""</td>
  <td>"""),_display_(Seq[Any](/*28.8*/obs/*28.11*/.obsValue)),format.raw/*28.20*/("""</td>
  <td>"""),_display_(Seq[Any](/*29.8*/helper/*29.14*/.form(routes.Admin.deleteObservation(obs.id))/*29.59*/ {_display_(Seq[Any](format.raw/*29.61*/("""
               <input type="image"
                      src=""""),_display_(Seq[Any](/*31.29*/{routes.Assets.at("images/delete.gif")})),format.raw/*31.68*/(""""
                      alt='"""),_display_(Seq[Any](/*32.29*/{Messages.get("delete.observation")})),format.raw/*32.65*/("""'>
         """)))})),format.raw/*33.11*/("""
   </td>
  </tr>

""")))})),format.raw/*37.2*/("""
</table>
<p class="lead">
<h2>"""),_display_(Seq[Any](/*40.6*/{Messages.get("add.observation")})),format.raw/*40.39*/("""</h2></p>

	"""),_display_(Seq[Any](/*42.3*/helper/*42.9*/.form(action = routes.Admin.newObservation())/*42.54*/ {_display_(Seq[Any](format.raw/*42.56*/("""

        """),_display_(Seq[Any](/*44.10*/helper/*44.16*/.inputText(form("value")))),format.raw/*44.41*/("""

         <select name="countryId">
         """),_display_(Seq[Any](/*47.11*/for( country <- countries) yield /*47.37*/ {_display_(Seq[Any](format.raw/*47.39*/("""
         	<option value=""""),_display_(Seq[Any](/*48.27*/country/*48.34*/.code)),format.raw/*48.39*/("""">"""),_display_(Seq[Any](/*48.42*/country/*48.49*/.name)),format.raw/*48.54*/("""</option>
         """)))})),format.raw/*49.11*/("""
        </select>

        <select name="indicatorId">
         """),_display_(Seq[Any](/*53.11*/for( indicator <- indicators) yield /*53.40*/ {_display_(Seq[Any](format.raw/*53.42*/("""
         	<option value=""""),_display_(Seq[Any](/*54.27*/indicator/*54.36*/.code)),format.raw/*54.41*/("""">"""),_display_(Seq[Any](/*54.44*/indicator/*54.53*/.name)),format.raw/*54.58*/("""</option>
         """)))})),format.raw/*55.11*/("""
        </select>

        <input type="submit" class="btn btn-default" value=""""),_display_(Seq[Any](/*58.62*/{Messages.get("create")})),format.raw/*58.86*/("""">

    """)))})),format.raw/*60.6*/("""

<p class = "lead"><h2>"""),_display_(Seq[Any](/*62.24*/Messages/*62.32*/.get("upload.excel.file"))),format.raw/*62.57*/("""</h2></p>

"""),_display_(Seq[Any](/*64.2*/helper/*64.8*/.form(action = routes.API.uploadExcel,
	  'enctype -> "multipart/form-data")/*65.38*/ {_display_(Seq[Any](format.raw/*65.40*/("""

    <input type="file" name="excel">

    <p>
        <input type="submit"  class="btn btn-default">
    </p>

""")))})),format.raw/*73.2*/("""

""")))})),format.raw/*75.2*/("""
</div>
"""))}
    }
    
    def render(observations:List[Observation],countries:List[Country],indicators:List[Indicator],form:Form[Observation]): play.api.templates.HtmlFormat.Appendable = apply(observations,countries,indicators,form)
    
    def f:((List[Observation],List[Country],List[Indicator],Form[Observation]) => play.api.templates.HtmlFormat.Appendable) = (observations,countries,indicators,form) => apply(observations,countries,indicators,form)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri May 09 19:54:02 CEST 2014
                    SOURCE: C:/Users/Blacky/Documents/GitHub/ObservaTerra11/app/views/observation.scala.html
                    HASH: ec01e3fe7215019d6533c1312a7fe906a4064e15
                    MATRIX: 839->1|1110->123|1140->183|1177->186|1224->225|1263->227|1351->280|1368->288|1410->308|1782->645|1822->669|1862->671|1914->688|1926->691|1951->694|2000->708|2012->711|2047->724|2096->738|2108->741|2145->756|2194->770|2206->773|2237->782|2286->796|2301->802|2355->847|2395->849|2497->915|2558->954|2625->985|2683->1021|2729->1035|2784->1059|2854->1094|2909->1127|2959->1142|2973->1148|3027->1193|3067->1195|3116->1208|3131->1214|3178->1239|3264->1289|3306->1315|3346->1317|3410->1345|3426->1352|3453->1357|3492->1360|3508->1367|3535->1372|3588->1393|3694->1463|3739->1492|3779->1494|3843->1522|3861->1531|3888->1536|3927->1539|3945->1548|3972->1553|4025->1574|4145->1658|4191->1682|4233->1693|4296->1720|4313->1728|4360->1753|4409->1767|4423->1773|4509->1850|4549->1852|4702->1974|4738->1979
                    LINES: 26->1|35->4|37->8|38->9|38->9|38->9|41->12|41->12|41->12|52->23|52->23|52->23|54->25|54->25|54->25|55->26|55->26|55->26|56->27|56->27|56->27|57->28|57->28|57->28|58->29|58->29|58->29|58->29|60->31|60->31|61->32|61->32|62->33|66->37|69->40|69->40|71->42|71->42|71->42|71->42|73->44|73->44|73->44|76->47|76->47|76->47|77->48|77->48|77->48|77->48|77->48|77->48|78->49|82->53|82->53|82->53|83->54|83->54|83->54|83->54|83->54|83->54|84->55|87->58|87->58|89->60|91->62|91->62|91->62|93->64|93->64|94->65|94->65|102->73|104->75
                    -- GENERATED --
                */
            