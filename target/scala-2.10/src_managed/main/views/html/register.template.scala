
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
object register extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[Form[Register.TypeRegister],Form[Register.UserRegister],Form[Register.BusinessRegister],Form[Register.CollaboratorRegister],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*2.2*/(typeForm: Form[Register.TypeRegister], form: Form[Register.UserRegister], businessForm: Form[Register.BusinessRegister], collaboratorForm: Form[Register.CollaboratorRegister]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import play.i18n._


Seq[Any](format.raw/*2.178*/("""

"""),format.raw/*5.1*/("""
<html>
    <head>
        <title>"""),_display_(Seq[Any](/*8.17*/Messages/*8.25*/.get("Registro"))),format.raw/*8.41*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*9.54*/routes/*9.60*/.Assets.at("stylesheets/main.css"))),format.raw/*9.94*/("""">
        <link rel="stylesheet" media="screen" href='"""),_display_(Seq[Any](/*10.54*/routes/*10.60*/.Assets.at("stylesheets/bars.css"))),format.raw/*10.94*/("""' >
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*11.59*/routes/*11.65*/.Assets.at("images/favicon.png"))),format.raw/*11.97*/("""">

  <script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
  <script src=""""),_display_(Seq[Any](/*14.17*/routes/*14.23*/.Assets.at("javascripts/jquery.js"))),format.raw/*14.58*/("""" type="text/javascript"></script>
  <script src=""""),_display_(Seq[Any](/*15.17*/routes/*15.23*/.Assets.at("javascripts/bootstrap.js"))),format.raw/*15.61*/("""" type="text/javascript"></script>
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
          <li><a href="/">"""),_display_(Seq[Any](/*34.28*/Messages/*34.36*/.get("back"))),format.raw/*34.48*/("""</a></li>
          """),_display_(Seq[Any](/*35.12*/if(session().get("id")==null)/*35.41*/{_display_(Seq[Any](format.raw/*35.42*/("""
         <li><a href="/login">"""),_display_(Seq[Any](/*36.32*/Messages/*36.40*/.get("Login"))),format.raw/*36.53*/("""</a>
         <li class="active"><a>"""),_display_(Seq[Any](/*37.33*/Messages/*37.41*/.get("Registro"))),format.raw/*37.57*/("""</a>
         """)))}/*38.12*/else/*38.16*/{_display_(Seq[Any](format.raw/*38.17*/("""
            <li><a href="/logout">"""),_display_(Seq[Any](/*39.36*/Messages/*39.44*/.get("Salir"))),format.raw/*39.57*/("""</a></li>
         """)))})),format.raw/*40.11*/("""
        </ul>
        </div>
      </div><!--/.nav-collapse -->
    </div>

    <div id="session">
    <br/>

        """),_display_(Seq[Any](/*49.10*/helper/*49.16*/.form(routes.Register.isValid())/*49.48*/ {_display_(Seq[Any](format.raw/*49.50*/("""
      <div class="page-header">
      <h1>"""),_display_(Seq[Any](/*51.12*/Messages/*51.20*/.get("register"))),format.raw/*51.36*/("""</h1>
      </div>



         <div class="form-group">
                <label for="type">"""),_display_(Seq[Any](/*57.36*/Messages/*57.44*/.get("type"))),format.raw/*57.56*/("""</label>
                <select name="type" value=""""),_display_(Seq[Any](/*58.45*/typeForm("type")/*58.61*/.value)),format.raw/*58.67*/("""" id="type">
                        <option value="empty"></option>
                        <option value="user">"""),_display_(Seq[Any](/*60.47*/Messages/*60.55*/.get("typeUser"))),format.raw/*60.71*/("""</option>
                        <option value="collaborator">"""),_display_(Seq[Any](/*61.55*/Messages/*61.63*/.get("typeCollaborator"))),format.raw/*61.87*/("""</option>
                        <option value="business">"""),_display_(Seq[Any](/*62.51*/Messages/*62.59*/.get("typeBusiness"))),format.raw/*62.79*/("""</option>
                </select>
        </div>

         <div class="form-group">
                <button type="submit" class="btn btn-default">"""),_display_(Seq[Any](/*67.64*/Messages/*67.72*/.get("selectRegister"))),format.raw/*67.94*/("""</button>
        </div>

        """),_display_(Seq[Any](/*70.10*/if(typeForm.hasGlobalErrors)/*70.38*/ {_display_(Seq[Any](format.raw/*70.40*/("""
        <p class="error">
            """),_display_(Seq[Any](/*72.14*/typeForm/*72.22*/.globalError.message)),format.raw/*72.42*/("""
                </p>
                """)))})),format.raw/*74.18*/("""
""")))})),format.raw/*75.2*/("""

"""),_display_(Seq[Any](/*77.2*/if(session().get("typeRegister")=="user")/*77.43*/{_display_(Seq[Any](format.raw/*77.44*/("""
        """),_display_(Seq[Any](/*78.10*/helper/*78.16*/.form(routes.Register.userRegister())/*78.53*/ {_display_(Seq[Any](format.raw/*78.55*/("""

        <div>
                <label for="lusername">"""),_display_(Seq[Any](/*81.41*/Messages/*81.49*/.get("username"))),format.raw/*81.65*/("""</label>
                <input type="text" name="username" value=""""),_display_(Seq[Any](/*82.60*/form("username")/*82.76*/.value)),format.raw/*82.82*/("""" id="username">
        </div>
        <div>
                <label for="lpassword">"""),_display_(Seq[Any](/*85.41*/Messages/*85.49*/.get("password"))),format.raw/*85.65*/("""</label>
                <input type="password" name="password" value=""""),_display_(Seq[Any](/*86.64*/form("password")/*86.80*/.value)),format.raw/*86.86*/(""""id="password">
        </div>
        <div>
                <label for="lname">"""),_display_(Seq[Any](/*89.37*/Messages/*89.45*/.get("name"))),format.raw/*89.57*/("""</label>
                <input type="text" name="name" value=""""),_display_(Seq[Any](/*90.56*/form("name")/*90.68*/.value)),format.raw/*90.74*/("""" id="name">
        </div>
        <div>
                <label for="email">"""),_display_(Seq[Any](/*93.37*/Messages/*93.45*/.get("email"))),format.raw/*93.58*/("""</label>
                <input type="email" name="email" value=""""),_display_(Seq[Any](/*94.58*/form("email")/*94.71*/.value)),format.raw/*94.77*/(""""id="email">
        </div>

   <div>
       <button type="submit">"""),_display_(Seq[Any](/*98.31*/Messages/*98.39*/.get("register"))),format.raw/*98.55*/("""</button>
   </div>

        """),_display_(Seq[Any](/*101.10*/if(form.hasGlobalErrors)/*101.34*/ {_display_(Seq[Any](format.raw/*101.36*/("""
                <p class="error">
                """),_display_(Seq[Any](/*103.18*/form/*103.22*/.globalError.message)),format.raw/*103.42*/("""
        </p>
                """)))})),format.raw/*105.18*/("""
        """)))})),format.raw/*106.10*/("""
""")))})),format.raw/*107.2*/("""

"""),_display_(Seq[Any](/*109.2*/if(session().get("typeRegister")=="collaborator")/*109.51*/{_display_(Seq[Any](format.raw/*109.52*/("""
        """),_display_(Seq[Any](/*110.10*/helper/*110.16*/.form(routes.Register.collaboratorRegister())/*110.61*/ {_display_(Seq[Any](format.raw/*110.63*/("""

        <div>
                <label for="lusername">"""),_display_(Seq[Any](/*113.41*/Messages/*113.49*/.get("username"))),format.raw/*113.65*/("""</label>
                <input type="text" name="username" value=""""),_display_(Seq[Any](/*114.60*/collaboratorForm("username")/*114.88*/.value)),format.raw/*114.94*/("""" id="username">
        </div>
        <div>
                <label for="lpassword">"""),_display_(Seq[Any](/*117.41*/Messages/*117.49*/.get("password"))),format.raw/*117.65*/("""</label>
                <input type="password" name="password" value=""""),_display_(Seq[Any](/*118.64*/collaboratorForm("password")/*118.92*/.value)),format.raw/*118.98*/(""""id="password">
        </div>
        <div>
                <label for="lname">"""),_display_(Seq[Any](/*121.37*/Messages/*121.45*/.get("name"))),format.raw/*121.57*/("""</label>
                <input type="text" name="name" value=""""),_display_(Seq[Any](/*122.56*/collaboratorForm("name")/*122.80*/.value)),format.raw/*122.86*/("""" id="name">
        </div>
        <div>
                <label for="email">"""),_display_(Seq[Any](/*125.37*/Messages/*125.45*/.get("email"))),format.raw/*125.58*/("""</label>
                <input type="email" name="email" value=""""),_display_(Seq[Any](/*126.58*/collaboratorForm("email")/*126.83*/.value)),format.raw/*126.89*/(""""id="email">
        </div>
        <div>
                <label for="phone">"""),_display_(Seq[Any](/*129.37*/Messages/*129.45*/.get("phone"))),format.raw/*129.58*/("""</label>
                <input type="number" name="phone" value=""""),_display_(Seq[Any](/*130.59*/collaboratorForm("phone")/*130.84*/.value)),format.raw/*130.90*/(""""id="phone">
        </div>
        <div>
                <label for="laddress">"""),_display_(Seq[Any](/*133.40*/Messages/*133.48*/.get("address"))),format.raw/*133.63*/("""</label>
                <input type="text" name="address" value=""""),_display_(Seq[Any](/*134.59*/collaboratorForm("address")/*134.86*/.value)),format.raw/*134.92*/(""""id="address">
        </div>
   <div>
                <label for="organization">"""),_display_(Seq[Any](/*137.44*/Messages/*137.52*/.get("organization"))),format.raw/*137.72*/("""</label>
                <input type="text" name="organization" value=""""),_display_(Seq[Any](/*138.64*/collaboratorForm("organization")/*138.96*/.value)),format.raw/*138.102*/(""""id="organization">
        </div>
        <div>
                <label for="specialization">"""),_display_(Seq[Any](/*141.46*/Messages/*141.54*/.get("specialization"))),format.raw/*141.76*/("""</label>
                <input type="text" name="specialization" value=""""),_display_(Seq[Any](/*142.66*/collaboratorForm("specialization")/*142.100*/.value)),format.raw/*142.106*/(""""id="specialization">
        </div>

   <div>
       <button type="submit">"""),_display_(Seq[Any](/*146.31*/Messages/*146.39*/.get("register"))),format.raw/*146.55*/("""</button>
   </div>

        """),_display_(Seq[Any](/*149.10*/if(collaboratorForm.hasGlobalErrors)/*149.46*/ {_display_(Seq[Any](format.raw/*149.48*/("""
                <p class="error">
                """),_display_(Seq[Any](/*151.18*/collaboratorForm/*151.34*/.globalError.message)),format.raw/*151.54*/("""
        </p>
                """)))})),format.raw/*153.18*/("""
        """)))})),format.raw/*154.10*/("""
""")))})),format.raw/*155.2*/("""

"""),_display_(Seq[Any](/*157.2*/if(session().get("typeRegister")=="business")/*157.47*/{_display_(Seq[Any](format.raw/*157.48*/("""
        """),_display_(Seq[Any](/*158.10*/helper/*158.16*/.form(routes.Register.businessRegister())/*158.57*/ {_display_(Seq[Any](format.raw/*158.59*/("""

        <div>
                <label for="lusername">"""),_display_(Seq[Any](/*161.41*/Messages/*161.49*/.get("username"))),format.raw/*161.65*/("""</label>
                <input type="text" name="username" value=""""),_display_(Seq[Any](/*162.60*/businessForm("username")/*162.84*/.value)),format.raw/*162.90*/("""" id="username">
        </div>
        <div>
                <label for="lpassword">"""),_display_(Seq[Any](/*165.41*/Messages/*165.49*/.get("password"))),format.raw/*165.65*/("""</label>
                <input type="password" name="password" value=""""),_display_(Seq[Any](/*166.64*/businessForm("password")/*166.88*/.value)),format.raw/*166.94*/(""""id="password">
        </div>
        <div>
                <label for="lname">"""),_display_(Seq[Any](/*169.37*/Messages/*169.45*/.get("name"))),format.raw/*169.57*/("""</label>
                <input type="text" name="name" value=""""),_display_(Seq[Any](/*170.56*/businessForm("name")/*170.76*/.value)),format.raw/*170.82*/("""" id="name">
        </div>
        <div>
                <label for="email">"""),_display_(Seq[Any](/*173.37*/Messages/*173.45*/.get("email"))),format.raw/*173.58*/("""</label>
                <input type="email" name="email" value=""""),_display_(Seq[Any](/*174.58*/businessForm("email")/*174.79*/.value)),format.raw/*174.85*/(""""id="email">
        </div>
        <div>
                <label for="phone">"""),_display_(Seq[Any](/*177.37*/Messages/*177.45*/.get("phone"))),format.raw/*177.58*/("""</label>
                <input type="number" name="phone" value=""""),_display_(Seq[Any](/*178.59*/businessForm("phone")/*178.80*/.value)),format.raw/*178.86*/(""""id="phone">
        </div>
        <div>
                <label for="laddress">"""),_display_(Seq[Any](/*181.40*/Messages/*181.48*/.get("address"))),format.raw/*181.63*/("""</label>
                <input type="text" name="address" value=""""),_display_(Seq[Any](/*182.59*/businessForm("address")/*182.82*/.value)),format.raw/*182.88*/(""""id="address">
        </div>
   <div>
                <label for="description">"""),_display_(Seq[Any](/*185.43*/Messages/*185.51*/.get("description"))),format.raw/*185.70*/("""</label>
                <input type="text" name="description" value=""""),_display_(Seq[Any](/*186.63*/businessForm("description")/*186.90*/.value)),format.raw/*186.96*/(""""id="description">
        </div>
        <div>
                <label for="webSite">"""),_display_(Seq[Any](/*189.39*/Messages/*189.47*/.get("webSite"))),format.raw/*189.62*/("""</label>
                <input type="text" name="webSite" value=""""),_display_(Seq[Any](/*190.59*/businessForm("webSite")/*190.82*/.value)),format.raw/*190.88*/(""""id="webSite">
        </div>
        <div>
                <label for="nif">"""),_display_(Seq[Any](/*193.35*/Messages/*193.43*/.get("nif"))),format.raw/*193.54*/("""</label>
                <input type="text" name="nif" value=""""),_display_(Seq[Any](/*194.55*/businessForm("nif")/*194.74*/.value)),format.raw/*194.80*/(""""id="nif">
        </div>

   <div>
       <button type="submit">"""),_display_(Seq[Any](/*198.31*/Messages/*198.39*/.get("register"))),format.raw/*198.55*/("""</button>
   </div>

        """),_display_(Seq[Any](/*201.10*/if(businessForm.hasGlobalErrors)/*201.42*/ {_display_(Seq[Any](format.raw/*201.44*/("""
                <p class="error">
                """),_display_(Seq[Any](/*203.18*/businessForm/*203.30*/.globalError.message)),format.raw/*203.50*/("""
        </p>
                """)))})),format.raw/*205.18*/("""
        """)))})),format.raw/*206.10*/("""
""")))})),format.raw/*207.2*/("""
</div>
</div>
    </body>
</html>
"""))}
    }
    
    def render(typeForm:Form[Register.TypeRegister],form:Form[Register.UserRegister],businessForm:Form[Register.BusinessRegister],collaboratorForm:Form[Register.CollaboratorRegister]): play.api.templates.HtmlFormat.Appendable = apply(typeForm,form,businessForm,collaboratorForm)
    
    def f:((Form[Register.TypeRegister],Form[Register.UserRegister],Form[Register.BusinessRegister],Form[Register.CollaboratorRegister]) => play.api.templates.HtmlFormat.Appendable) = (typeForm,form,businessForm,collaboratorForm) => apply(typeForm,form,businessForm,collaboratorForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri May 09 19:57:21 CEST 2014
                    SOURCE: C:/Users/Blacky/Documents/GitHub/ObservaTerra11/app/views/register.scala.html
                    HASH: 5525b1b1081c47dfb80b3db65255abe89ba44ef9
                    MATRIX: 894->3|1185->179|1215->204|1288->242|1304->250|1341->266|1439->329|1453->335|1508->369|1601->426|1616->432|1672->466|1771->529|1786->535|1840->567|1970->661|1985->667|2042->702|2130->754|2145->760|2205->798|2324->881|2339->887|2400->926|2487->977|2502->983|2560->1019|3290->1713|3307->1721|3341->1733|3399->1755|3437->1784|3476->1785|3545->1818|3562->1826|3597->1839|3671->1877|3688->1885|3726->1901|3761->1918|3774->1922|3813->1923|3886->1960|3903->1968|3938->1981|3991->2002|4156->2131|4171->2137|4212->2169|4252->2171|4334->2217|4351->2225|4389->2241|4522->2338|4539->2346|4573->2358|4663->2412|4688->2428|4716->2434|4869->2551|4886->2559|4924->2575|5025->2640|5042->2648|5088->2672|5185->2733|5202->2741|5244->2761|5434->2915|5451->2923|5495->2945|5569->2983|5606->3011|5646->3013|5724->3055|5741->3063|5783->3083|5856->3124|5890->3127|5930->3132|5980->3173|6019->3174|6066->3185|6081->3191|6127->3228|6167->3230|6262->3289|6279->3297|6317->3313|6422->3382|6447->3398|6475->3404|6600->3493|6617->3501|6655->3517|6764->3590|6789->3606|6817->3612|6937->3696|6954->3704|6988->3716|7089->3781|7110->3793|7138->3799|7255->3880|7272->3888|7307->3901|7410->3968|7432->3981|7460->3987|7568->4059|7585->4067|7623->4083|7693->4116|7727->4140|7768->4142|7859->4196|7873->4200|7916->4220|7982->4253|8026->4264|8061->4267|8102->4272|8161->4321|8201->4322|8249->4333|8265->4339|8320->4384|8361->4386|8457->4445|8475->4453|8514->4469|8620->4538|8658->4566|8687->4572|8813->4661|8831->4669|8870->4685|8980->4758|9018->4786|9047->4792|9168->4876|9186->4884|9221->4896|9323->4961|9357->4985|9386->4991|9504->5072|9522->5080|9558->5093|9662->5160|9697->5185|9726->5191|9844->5272|9862->5280|9898->5293|10003->5361|10038->5386|10067->5392|10188->5476|10206->5484|10244->5499|10349->5567|10386->5594|10415->5600|10537->5685|10555->5693|10598->5713|10708->5786|10750->5818|10780->5824|10914->5921|10932->5929|10977->5951|11089->6026|11134->6060|11164->6066|11282->6147|11300->6155|11339->6171|11409->6204|11455->6240|11496->6242|11587->6296|11613->6312|11656->6332|11722->6365|11766->6376|11801->6379|11842->6384|11897->6429|11937->6430|11985->6441|12001->6447|12052->6488|12093->6490|12189->6549|12207->6557|12246->6573|12352->6642|12386->6666|12415->6672|12541->6761|12559->6769|12598->6785|12708->6858|12742->6882|12771->6888|12892->6972|12910->6980|12945->6992|13047->7057|13077->7077|13106->7083|13224->7164|13242->7172|13278->7185|13382->7252|13413->7273|13442->7279|13560->7360|13578->7368|13614->7381|13719->7449|13750->7470|13779->7476|13900->7560|13918->7568|13956->7583|14061->7651|14094->7674|14123->7680|14244->7764|14262->7772|14304->7791|14413->7863|14450->7890|14479->7896|14605->7985|14623->7993|14661->8008|14766->8076|14799->8099|14828->8105|14946->8186|14964->8194|14998->8205|15099->8269|15128->8288|15157->8294|15264->8364|15282->8372|15321->8388|15391->8421|15433->8453|15474->8455|15565->8509|15587->8521|15630->8541|15696->8574|15740->8585|15775->8588
                    LINES: 26->2|30->2|32->5|35->8|35->8|35->8|36->9|36->9|36->9|37->10|37->10|37->10|38->11|38->11|38->11|41->14|41->14|41->14|42->15|42->15|42->15|43->16|43->16|43->16|44->17|44->17|44->17|61->34|61->34|61->34|62->35|62->35|62->35|63->36|63->36|63->36|64->37|64->37|64->37|65->38|65->38|65->38|66->39|66->39|66->39|67->40|76->49|76->49|76->49|76->49|78->51|78->51|78->51|84->57|84->57|84->57|85->58|85->58|85->58|87->60|87->60|87->60|88->61|88->61|88->61|89->62|89->62|89->62|94->67|94->67|94->67|97->70|97->70|97->70|99->72|99->72|99->72|101->74|102->75|104->77|104->77|104->77|105->78|105->78|105->78|105->78|108->81|108->81|108->81|109->82|109->82|109->82|112->85|112->85|112->85|113->86|113->86|113->86|116->89|116->89|116->89|117->90|117->90|117->90|120->93|120->93|120->93|121->94|121->94|121->94|125->98|125->98|125->98|128->101|128->101|128->101|130->103|130->103|130->103|132->105|133->106|134->107|136->109|136->109|136->109|137->110|137->110|137->110|137->110|140->113|140->113|140->113|141->114|141->114|141->114|144->117|144->117|144->117|145->118|145->118|145->118|148->121|148->121|148->121|149->122|149->122|149->122|152->125|152->125|152->125|153->126|153->126|153->126|156->129|156->129|156->129|157->130|157->130|157->130|160->133|160->133|160->133|161->134|161->134|161->134|164->137|164->137|164->137|165->138|165->138|165->138|168->141|168->141|168->141|169->142|169->142|169->142|173->146|173->146|173->146|176->149|176->149|176->149|178->151|178->151|178->151|180->153|181->154|182->155|184->157|184->157|184->157|185->158|185->158|185->158|185->158|188->161|188->161|188->161|189->162|189->162|189->162|192->165|192->165|192->165|193->166|193->166|193->166|196->169|196->169|196->169|197->170|197->170|197->170|200->173|200->173|200->173|201->174|201->174|201->174|204->177|204->177|204->177|205->178|205->178|205->178|208->181|208->181|208->181|209->182|209->182|209->182|212->185|212->185|212->185|213->186|213->186|213->186|216->189|216->189|216->189|217->190|217->190|217->190|220->193|220->193|220->193|221->194|221->194|221->194|225->198|225->198|225->198|228->201|228->201|228->201|230->203|230->203|230->203|232->205|233->206|234->207
                    -- GENERATED --
                */
            