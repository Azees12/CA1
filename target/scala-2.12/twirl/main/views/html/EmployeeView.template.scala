
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._
/*1.2*/import models.Employee
/*2.2*/import models.users.User

object EmployeeView extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Employee,User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(p: Employee,user: User,env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.52*/("""


"""),_display_(/*7.2*/main("Employee", user)/*7.24*/ {_display_(Seq[Any](format.raw/*7.26*/("""

    """),format.raw/*9.5*/("""<div class="jumbotron text-center">
        <h1>"""),_display_(/*10.14*/p/*10.15*/.getName),format.raw/*10.23*/("""</h1>
        <h3>"""),_display_(/*11.14*/p/*11.15*/.getDepartment.getDepartment()),format.raw/*11.45*/("""</h3> 
    </div>
    """),_display_(/*13.6*/if(env.resource("public/images/productImages/" + p.getId + ".jpg").isDefined)/*13.83*/ {_display_(Seq[Any](format.raw/*13.85*/("""
        """),format.raw/*14.9*/("""<img src="/assets/images/EmployeePic/"""),_display_(/*14.47*/(p.getId + ".jpg")),format.raw/*14.65*/(""""/><
    """)))}/*15.7*/else/*15.12*/{_display_(Seq[Any](format.raw/*15.13*/("""
        """),format.raw/*16.9*/("""<a>no image added</a>
    """)))}),format.raw/*17.6*/("""

    """),format.raw/*19.5*/("""<h2>Projects</h2>
    
        <ul class="list-group">
           """),_display_(/*22.13*/for(p <-p.getProjects) yield /*22.35*/{_display_(Seq[Any](format.raw/*22.36*/(""" 
         
                """),format.raw/*24.17*/("""<li class="list-group-item">"""),_display_(/*24.46*/p/*24.47*/.getname),format.raw/*24.55*/("""</li>
            
         
        """)))}),format.raw/*27.10*/("""
        """),format.raw/*28.9*/("""</ul>
    

""")))}),format.raw/*31.2*/("""
"""))
      }
    }
  }

  def render(p:Employee,user:User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(p,user,env)

  def f:((Employee,User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (p,user,env) => apply(p,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 12 03:55:36 GMT 2018
                  SOURCE: /home/wdd/webapps/play/h4/app/views/EmployeeView.scala.html
                  HASH: 7d923c6ed62e4705ca7b46731ae7b1daa66d4d5f
                  MATRIX: 651->1|681->25|1045->52|1190->102|1219->106|1249->128|1288->130|1320->136|1396->185|1406->186|1435->194|1481->213|1491->214|1542->244|1591->267|1677->344|1717->346|1753->355|1818->393|1857->411|1885->422|1898->427|1937->428|1973->437|2030->464|2063->470|2157->537|2195->559|2234->560|2290->588|2346->617|2356->618|2385->626|2454->664|2490->673|2533->686
                  LINES: 24->1|25->2|30->4|35->4|38->7|38->7|38->7|40->9|41->10|41->10|41->10|42->11|42->11|42->11|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|47->16|48->17|50->19|53->22|53->22|53->22|55->24|55->24|55->24|55->24|58->27|59->28|62->31
                  -- GENERATED --
              */
          