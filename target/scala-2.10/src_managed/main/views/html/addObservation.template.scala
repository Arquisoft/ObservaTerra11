
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
object addObservation extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[List[Observation],List[Country],List[Indicator],Form[Observation],play.api.templates.HtmlFormat.Appendable] {

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

<div class="page-header">
<h1>"""),_display_(Seq[Any](/*12.6*/Messages/*12.14*/.get("observations"))),format.raw/*12.34*/("""</h1>
</div>

<table class="table table-bordered">
<tr>
<th class="field-label col-md-3 active">Id</th>
<th class="field-label col-md-3 active">Country</th>
<th class="field-label col-md-3 active">Indicator</th>
<th class="field-label col-md-3 active">Value</th>
</tr>
"""),_display_(Seq[Any](/*22.2*/for(obs <- observations) yield /*22.26*/ {_display_(Seq[Any](format.raw/*22.28*/("""
  <tr>
  <td>"""),_display_(Seq[Any](/*24.8*/obs/*24.11*/.id)),format.raw/*24.14*/("""</td>
  <td>"""),_display_(Seq[Any](/*25.8*/obs/*25.11*/.country.name)),format.raw/*25.24*/("""</td>
  <td>"""),_display_(Seq[Any](/*26.8*/obs/*26.11*/.indicator.name)),format.raw/*26.26*/("""</td>
  <td>"""),_display_(Seq[Any](/*27.8*/obs/*27.11*/.obsValue)),format.raw/*27.20*/("""</td>

  </tr>

""")))})),format.raw/*31.2*/("""
</table>

<h2>"""),_display_(Seq[Any](/*34.6*/{Messages.get("add.observation")})),format.raw/*34.39*/("""</h2>

	"""),_display_(Seq[Any](/*36.3*/helper/*36.9*/.form(action = routes.Admin.newObservation())/*36.54*/ {_display_(Seq[Any](format.raw/*36.56*/("""

        """),_display_(Seq[Any](/*38.10*/helper/*38.16*/.inputText(form("value")))),format.raw/*38.41*/("""

         <select name="countryId">
         """),_display_(Seq[Any](/*41.11*/for( country <- countries) yield /*41.37*/ {_display_(Seq[Any](format.raw/*41.39*/("""
         	<option value=""""),_display_(Seq[Any](/*42.27*/country/*42.34*/.code)),format.raw/*42.39*/("""">"""),_display_(Seq[Any](/*42.42*/country/*42.49*/.name)),format.raw/*42.54*/("""</option>
         """)))})),format.raw/*43.11*/("""
        </select>

        <select name="indicatorId">
         """),_display_(Seq[Any](/*47.11*/for( indicator <- indicators) yield /*47.40*/ {_display_(Seq[Any](format.raw/*47.42*/("""
         	<option value=""""),_display_(Seq[Any](/*48.27*/indicator/*48.36*/.code)),format.raw/*48.41*/("""">"""),_display_(Seq[Any](/*48.44*/indicator/*48.53*/.name)),format.raw/*48.58*/("""</option>
         """)))})),format.raw/*49.11*/("""
        </select>

        <input type="submit" class="btn btn-default" value=""""),_display_(Seq[Any](/*52.62*/{Messages.get("create")})),format.raw/*52.86*/("""">

    """)))})),format.raw/*54.6*/("""

<h2>"""),_display_(Seq[Any](/*56.6*/Messages/*56.14*/.get("upload.excel.file"))),format.raw/*56.39*/("""</h2>

"""),_display_(Seq[Any](/*58.2*/helper/*58.8*/.form(action = routes.API.uploadExcel,
	  'enctype -> "multipart/form-data")/*59.38*/ {_display_(Seq[Any](format.raw/*59.40*/("""

    <input type="file" name="excel">

    <p>
        <input type="submit" class="btn btn-default">
    </p>

""")))})),format.raw/*67.2*/("""
""")))})),format.raw/*68.2*/("""
"""))}
    }
    
    def render(observations:List[Observation],countries:List[Country],indicators:List[Indicator],form:Form[Observation]): play.api.templates.HtmlFormat.Appendable = apply(observations,countries,indicators,form)
    
    def f:((List[Observation],List[Country],List[Indicator],Form[Observation]) => play.api.templates.HtmlFormat.Appendable) = (observations,countries,indicators,form) => apply(observations,countries,indicators,form)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri May 09 19:42:35 CEST 2014
                    SOURCE: C:/Users/Blacky/Documents/GitHub/ObservaTerra11/app/views/addObservation.scala.html
                    HASH: de2dc4a949f06c9c1bfc39ef2b2ee7d6e78ee065
                    MATRIX: 842->1|1113->123|1143->183|1180->186|1227->225|1266->227|1337->263|1354->271|1396->291|1711->571|1751->595|1791->597|1843->614|1855->617|1880->620|1929->634|1941->637|1976->650|2025->664|2037->667|2074->682|2123->696|2135->699|2166->708|2218->729|2272->748|2327->781|2373->792|2387->798|2441->843|2481->845|2530->858|2545->864|2592->889|2678->939|2720->965|2760->967|2824->995|2840->1002|2867->1007|2906->1010|2922->1017|2949->1022|3002->1043|3108->1113|3153->1142|3193->1144|3257->1172|3275->1181|3302->1186|3341->1189|3359->1198|3386->1203|3439->1224|3559->1308|3605->1332|3647->1343|3691->1352|3708->1360|3755->1385|3800->1395|3814->1401|3900->1478|3940->1480|4092->1601|4126->1604
                    LINES: 26->1|35->4|37->8|38->9|38->9|38->9|41->12|41->12|41->12|51->22|51->22|51->22|53->24|53->24|53->24|54->25|54->25|54->25|55->26|55->26|55->26|56->27|56->27|56->27|60->31|63->34|63->34|65->36|65->36|65->36|65->36|67->38|67->38|67->38|70->41|70->41|70->41|71->42|71->42|71->42|71->42|71->42|71->42|72->43|76->47|76->47|76->47|77->48|77->48|77->48|77->48|77->48|77->48|78->49|81->52|81->52|83->54|85->56|85->56|85->56|87->58|87->58|88->59|88->59|96->67|97->68
                    -- GENERATED --
                */
            