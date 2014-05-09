
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
object indicator extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[Indicator],Form[Indicator],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(indicators: List[Indicator], form: Form[Indicator]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import play.i18n._


Seq[Any](format.raw/*1.54*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main(Messages.get("list.indicators"))/*5.39*/ {_display_(Seq[Any](format.raw/*5.41*/("""

<div class="page-header">
<h1>"""),_display_(Seq[Any](/*8.6*/Messages/*8.14*/.get("indicators"))),format.raw/*8.32*/("""</h1>
</div>
<table class="table table-bordered">
"""),_display_(Seq[Any](/*11.2*/for(ind <- indicators) yield /*11.24*/ {_display_(Seq[Any](format.raw/*11.26*/("""
  <tr><td>"""),_display_(Seq[Any](/*12.12*/ind/*12.15*/.name)),format.raw/*12.20*/("""</td>
      <td>
      <td>"""),_display_(Seq[Any](/*14.12*/helper/*14.18*/.form(routes.Admin.deleteCountry(ind.code))/*14.61*/ {_display_(Seq[Any](format.raw/*14.63*/("""
               <input type="image"
                      src=""""),_display_(Seq[Any](/*16.29*/{routes.Assets.at("images/delete.gif")})),format.raw/*16.68*/(""""
                      alt='"""),_display_(Seq[Any](/*17.29*/{Messages.get("delete.indicator")})),format.raw/*17.63*/("""'>
         """)))})),format.raw/*18.11*/("""
      </td>
  </tr>

""")))})),format.raw/*22.2*/("""
</table>

<h2>"""),_display_(Seq[Any](/*25.6*/{Messages.get("add.indicator")})),format.raw/*25.37*/("""</h2>

	"""),_display_(Seq[Any](/*27.3*/helper/*27.9*/.form(action = routes.Admin.newIndicator())/*27.52*/ {_display_(Seq[Any](format.raw/*27.54*/("""

	    """),_display_(Seq[Any](/*29.7*/helper/*29.13*/.inputText(form("code")))),format.raw/*29.37*/("""
	    """),_display_(Seq[Any](/*30.7*/helper/*30.13*/.inputText(form("name")))),format.raw/*30.37*/("""

        <input type="submit" class="btn btn-default" value=""""),_display_(Seq[Any](/*32.62*/{Messages.get("create")})),format.raw/*32.86*/("""">

    """)))})),format.raw/*34.6*/("""

""")))})),format.raw/*36.2*/("""
"""))}
    }
    
    def render(indicators:List[Indicator],form:Form[Indicator]): play.api.templates.HtmlFormat.Appendable = apply(indicators,form)
    
    def f:((List[Indicator],Form[Indicator]) => play.api.templates.HtmlFormat.Appendable) = (indicators,form) => apply(indicators,form)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri May 09 19:42:35 CEST 2014
                    SOURCE: C:/Users/Blacky/Documents/GitHub/ObservaTerra11/app/views/indicator.scala.html
                    HASH: b6d2637abb58ab95826cd86fea3da0f663201b85
                    MATRIX: 803->1|969->53|999->78|1036->81|1081->118|1120->120|1190->156|1206->164|1245->182|1334->236|1372->258|1412->260|1461->273|1473->276|1500->281|1566->311|1581->317|1633->360|1673->362|1775->428|1836->467|1903->498|1959->532|2005->546|2063->573|2117->592|2170->623|2216->634|2230->640|2282->683|2322->685|2367->695|2382->701|2428->725|2471->733|2486->739|2532->763|2633->828|2679->852|2721->863|2757->868
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|36->8|36->8|36->8|39->11|39->11|39->11|40->12|40->12|40->12|42->14|42->14|42->14|42->14|44->16|44->16|45->17|45->17|46->18|50->22|53->25|53->25|55->27|55->27|55->27|55->27|57->29|57->29|57->29|58->30|58->30|58->30|60->32|60->32|62->34|64->36
                    -- GENERATED --
                */
            