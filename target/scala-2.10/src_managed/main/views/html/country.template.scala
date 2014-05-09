
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
object country extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[Country],Form[Country],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(countries: List[Country], countryForm: Form[Country]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import play.i18n._

import helper._


Seq[Any](format.raw/*1.56*/("""

"""),format.raw/*5.1*/("""
"""),_display_(Seq[Any](/*6.2*/main(Messages.get("list.countries"))/*6.38*/ {_display_(Seq[Any](format.raw/*6.40*/("""
<div class="page-header">
<h1>"""),_display_(Seq[Any](/*8.6*/Messages/*8.14*/.get("countries"))),format.raw/*8.31*/("""</h1>
</div>
<table class="table table-bordered">
"""),_display_(Seq[Any](/*11.2*/for(country <- countries) yield /*11.27*/ {_display_(Seq[Any](format.raw/*11.29*/("""
  <tr><td>"""),_display_(Seq[Any](/*12.12*/country/*12.19*/.name)),format.raw/*12.24*/("""</td>
      <td>
      <td>"""),_display_(Seq[Any](/*14.12*/helper/*14.18*/.form(routes.Admin.deleteCountry(country.code))/*14.65*/ {_display_(Seq[Any](format.raw/*14.67*/("""
               <input type="image"
                      src=""""),_display_(Seq[Any](/*16.29*/{routes.Assets.at("images/delete.gif")})),format.raw/*16.68*/(""""
                      alt='"""),_display_(Seq[Any](/*17.29*/{Messages.get("delete.country")})),format.raw/*17.61*/("""'>
         """)))})),format.raw/*18.11*/("""
      </td>
  </tr>

""")))})),format.raw/*22.2*/("""
</table>

<h2>"""),_display_(Seq[Any](/*25.6*/{Messages.get("add.country")})),format.raw/*25.35*/("""</h2>

	"""),_display_(Seq[Any](/*27.3*/form(action = routes.Admin.newCountry())/*27.43*/ {_display_(Seq[Any](format.raw/*27.45*/("""

        """),_display_(Seq[Any](/*29.10*/inputText(countryForm("code")))),format.raw/*29.40*/("""
        """),_display_(Seq[Any](/*30.10*/inputText(countryForm("name")))),format.raw/*30.40*/("""

        <input type="submit" class="btn btn-default" value=""""),_display_(Seq[Any](/*32.62*/{Messages.get("create")})),format.raw/*32.86*/("""">

    """)))})),format.raw/*34.6*/("""

""")))})),format.raw/*36.2*/("""
"""))}
    }
    
    def render(countries:List[Country],countryForm:Form[Country]): play.api.templates.HtmlFormat.Appendable = apply(countries,countryForm)
    
    def f:((List[Country],Form[Country]) => play.api.templates.HtmlFormat.Appendable) = (countries,countryForm) => apply(countries,countryForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri May 09 19:42:35 CEST 2014
                    SOURCE: C:/Users/Blacky/Documents/GitHub/ObservaTerra11/app/views/country.scala.html
                    HASH: 766969fb18d73605354672cbd1c1783ecece916c
                    MATRIX: 797->1|983->55|1013->98|1050->101|1094->137|1133->139|1201->173|1217->181|1255->198|1344->252|1385->277|1425->279|1474->292|1490->299|1517->304|1583->334|1598->340|1654->387|1694->389|1796->455|1857->494|1924->525|1978->557|2024->571|2082->598|2136->617|2187->646|2233->657|2282->697|2322->699|2371->712|2423->742|2470->753|2522->783|2623->848|2669->872|2711->883|2747->888
                    LINES: 26->1|32->1|34->5|35->6|35->6|35->6|37->8|37->8|37->8|40->11|40->11|40->11|41->12|41->12|41->12|43->14|43->14|43->14|43->14|45->16|45->16|46->17|46->17|47->18|51->22|54->25|54->25|56->27|56->27|56->27|58->29|58->29|59->30|59->30|61->32|61->32|63->34|65->36
                    -- GENERATED --
                */
            