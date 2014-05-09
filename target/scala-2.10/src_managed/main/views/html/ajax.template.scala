
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
object ajax extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/():play.api.templates.HtmlFormat.Appendable = {
        _display_ {import play.i18n._


Seq[Any](format.raw/*1.4*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("ObservaTerra with Ajax")/*5.32*/ {_display_(Seq[Any](format.raw/*5.34*/("""

<script type="text/javascript">

$(document).ready(function()"""),format.raw/*9.29*/("""{"""),format.raw/*9.30*/("""
  $("button").click(function()"""),format.raw/*10.31*/("""{"""),format.raw/*10.32*/("""
    $.ajax(
       """),format.raw/*12.8*/("""{"""),format.raw/*12.9*/(""" url:"/api/country",
    	 dataType: 'json',
         success: function(data)"""),format.raw/*14.33*/("""{"""),format.raw/*14.34*/("""
      	 		$('#divToFill').html(' ');
      	 		$('#divToFill').append('<ul>');
      			for (var i in data) """),format.raw/*17.30*/("""{"""),format.raw/*17.31*/("""
        			$('#divToFill').append('<li>Country: ' + data[i].name);
      			"""),format.raw/*19.10*/("""}"""),format.raw/*19.11*/("""
      	 		$('#divToFill').append('</ul>');
      	 """),format.raw/*21.9*/("""}"""),format.raw/*21.10*/("""
	   """),format.raw/*22.5*/("""}"""),format.raw/*22.6*/(""");
  """),format.raw/*23.3*/("""}"""),format.raw/*23.4*/(""");
"""),format.raw/*24.1*/("""}"""),format.raw/*24.2*/(""");

</script>
</head>
<body>

<div id="divToFill">
 ...
</div>
<button>"""),_display_(Seq[Any](/*33.10*/Messages/*33.18*/.get("list.countries"))),format.raw/*33.40*/("""</button>
""")))})),format.raw/*34.2*/("""

"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri May 09 18:11:05 CEST 2014
                    SOURCE: C:/Users/Blacky/Documents/GitHub/ObservaTerra11/app/views/ajax.scala.html
                    HASH: dec694e35b748bb3e4dd5a6253651b011a358283
                    MATRIX: 766->1|881->3|911->28|948->31|986->61|1025->63|1119->130|1147->131|1207->163|1236->164|1285->186|1313->187|1420->266|1449->267|1589->379|1618->380|1725->459|1754->460|1835->514|1864->515|1897->521|1925->522|1958->528|1986->529|2017->533|2045->534|2162->615|2179->623|2223->645|2266->657
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|37->9|37->9|38->10|38->10|40->12|40->12|42->14|42->14|45->17|45->17|47->19|47->19|49->21|49->21|50->22|50->22|51->23|51->23|52->24|52->24|61->33|61->33|61->33|62->34
                    -- GENERATED --
                */
            