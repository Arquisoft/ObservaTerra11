
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
object bars extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Indicator,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(indicator: Indicator):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import play.i18n._


Seq[Any](format.raw/*1.24*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("ObservaTerra")/*5.22*/ {_display_(Seq[Any](format.raw/*5.24*/("""
<h2>"""),_display_(Seq[Any](/*6.6*/Messages/*6.14*/.get("Bar.chart"))),format.raw/*6.31*/(""" - """),_display_(Seq[Any](/*6.35*/indicator/*6.44*/.name)),format.raw/*6.49*/("""</h2>
<script src='"""),_display_(Seq[Any](/*7.15*/routes/*7.21*/.Assets.at("javascripts/processing.min.js"))),format.raw/*7.64*/("""' type="text/javascript"></script>
<script type="text/javascript">
// convenience function to get the id attribute of generated sketch html element
function getProcessingSketchId () """),format.raw/*10.35*/("""{"""),format.raw/*10.36*/(""" return 'sketch140407a'; """),format.raw/*10.61*/("""}"""),format.raw/*10.62*/("""
</script>
		<div id="content">

				<canvas id="sketch140407a" data-processing-sources='"""),_display_(Seq[Any](/*14.58*/routes/*14.64*/.Assets.at("javascripts/sketch_140407a.pde"))),format.raw/*14.108*/("""' 
						width="400" height="400">
					<!-- Note: you can put any alternative content here. -->
				</canvas>
			
				
				<canvas id="pieChart" data-processing-sources='"""),_display_(Seq[Any](/*20.53*/routes/*20.59*/.Assets.at("javascripts/pieChart.pde"))),format.raw/*20.97*/("""' 
						width="400" height="400">
					<p>Your browser does not support the canvas tag.</p>
					<!-- Note: you can put any alternative content here. -->
				</canvas>

	    		<ul><li><a href="/api/observation/indicator/"""),_display_(Seq[Any](/*26.53*/indicator/*26.62*/.code)),format.raw/*26.67*/("""">"""),_display_(Seq[Any](/*26.70*/Messages/*26.78*/.get("exportar.json"))),format.raw/*26.99*/("""</a></li>
	    		
				<li><a href="/api/xml/"""),_display_(Seq[Any](/*28.28*/indicator/*28.37*/.code)),format.raw/*28.42*/("""">"""),_display_(Seq[Any](/*28.45*/Messages/*28.53*/.get("exportar.xml"))),format.raw/*28.73*/("""</a></li>
				</ul>   			
	    		
		</div>
		

				
	<script type="application/javascript">
		 //aqu� se cargar�n los datos del JSON
		 var values;
		 //con esto obtenemos el JSON ya parseado y listo para usarse
		 $.ajax(
      	 """),format.raw/*40.9*/("""{"""),format.raw/*40.10*/(""" 
      	 type: "GET",
      	 url:"/api/observation/indicator/"+""""),_display_(Seq[Any](/*42.45*/indicator/*42.54*/.code)),format.raw/*42.59*/("""",
    	 dataType: 'json',
    	 async: false, //MUY IMPORTANTE!!(sin� en Firefox no funcionar�)
         success: function(data)"""),format.raw/*45.33*/("""{"""),format.raw/*45.34*/("""
      			values=data; 
      	 """),format.raw/*47.9*/("""}"""),format.raw/*47.10*/("""
	   """),format.raw/*48.5*/("""}"""),format.raw/*48.6*/(""");  
    </script>

"""),_display_(Seq[Any](/*51.2*/if(session().get("type") != "admin")/*51.38*/{_display_(Seq[Any](format.raw/*51.39*/("""
<div><a href="/">"""),_display_(Seq[Any](/*52.19*/Messages/*52.27*/.get("back"))),format.raw/*52.39*/("""</a></div>
""")))})),format.raw/*53.2*/("""
""")))})),format.raw/*54.2*/("""
"""))}
    }
    
    def render(indicator:Indicator): play.api.templates.HtmlFormat.Appendable = apply(indicator)
    
    def f:((Indicator) => play.api.templates.HtmlFormat.Appendable) = (indicator) => apply(indicator)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri May 09 19:24:06 CEST 2014
                    SOURCE: C:/Users/Blacky/Documents/GitHub/ObservaTerra11/app/views/bars.scala.html
                    HASH: d42ce7d9cc144dc9b68a9c79fe26567c5d986507
                    MATRIX: 776->1|912->23|942->48|979->51|1007->71|1046->73|1087->80|1103->88|1141->105|1180->109|1197->118|1223->123|1279->144|1293->150|1357->193|1570->378|1599->379|1652->404|1681->405|1811->499|1826->505|1893->549|2107->727|2122->733|2182->771|2446->999|2464->1008|2491->1013|2530->1016|2547->1024|2590->1045|2673->1092|2691->1101|2718->1106|2757->1109|2774->1117|2816->1137|3086->1380|3115->1381|3220->1450|3238->1459|3265->1464|3425->1596|3454->1597|3515->1631|3544->1632|3577->1638|3605->1639|3664->1663|3709->1699|3748->1700|3804->1720|3821->1728|3855->1740|3899->1753|3933->1756
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|34->6|34->6|34->6|34->6|34->6|34->6|35->7|35->7|35->7|38->10|38->10|38->10|38->10|42->14|42->14|42->14|48->20|48->20|48->20|54->26|54->26|54->26|54->26|54->26|54->26|56->28|56->28|56->28|56->28|56->28|56->28|68->40|68->40|70->42|70->42|70->42|73->45|73->45|75->47|75->47|76->48|76->48|79->51|79->51|79->51|80->52|80->52|80->52|81->53|82->54
                    -- GENERATED --
                */
            