
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

object addProject extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.Project],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(ProjectForm: Form[models.Project],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import models.Department
/*3.2*/import models.Employee
/*4.2*/import models.users.User
/*5.2*/import models.Project
/*7.2*/import helper._


Seq[Any](format.raw/*1.61*/("""
"""),format.raw/*6.1*/("""
"""),_display_(/*8.2*/main("Add Project",user)/*8.26*/{_display_(Seq[Any](format.raw/*8.27*/("""
    """),format.raw/*9.5*/("""<p class="lead">Add a Project</p>

    """),_display_(/*11.6*/form(action=routes.HomeController.addProjectSubmit(), 'class -> "form-horizontal",'role ->"form")/*11.103*/ {_display_(Seq[Any](format.raw/*11.105*/("""

        """),_display_(/*13.10*/CSRF/*13.14*/.formField),format.raw/*13.24*/("""
        """),_display_(/*14.10*/inputText(ProjectForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*14.74*/("""
        """),_display_(/*15.10*/inputText(ProjectForm("name"), '_label -> "Name",'_showConstraints ->false, 'class -> "form-control")),format.raw/*15.111*/("""



        """),_display_(/*19.10*/for((value, name) <- Employee.options) yield /*19.48*/ {_display_(Seq[Any](format.raw/*19.50*/("""
            """),format.raw/*20.13*/("""<input type="checkbox" name="empSelect[]" value=""""),_display_(/*20.63*/value),format.raw/*20.68*/(""""
        
            
            />"""),_display_(/*23.16*/name),format.raw/*23.20*/("""<br>        
        """)))}),format.raw/*24.10*/("""

        """),format.raw/*26.9*/("""<div class="action">
            <input type="submit" value="Add Project" class="btn btn-primary">
            <a href=""""),_display_(/*28.23*/routes/*28.29*/.HomeController.ListEmployee(0)),format.raw/*28.60*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    
    """)))}),format.raw/*33.6*/("""
""")))}),format.raw/*34.2*/("""
    



















"""))
      }
    }
  }

  def render(ProjectForm:Form[models.Project],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(ProjectForm,user)

  def f:((Form[models.Project],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (ProjectForm,user) => apply(ProjectForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 12 03:39:58 GMT 2018
                  SOURCE: /home/wdd/webapps/play/h4/app/views/addProject.scala.html
                  HASH: 977b229863b81e95042f1c9b1b885a75ca95c187
                  MATRIX: 985->1|1117->62|1149->88|1179->112|1211->138|1240->162|1285->60|1312->160|1339->179|1371->203|1409->204|1440->209|1506->249|1613->346|1654->348|1692->359|1705->363|1736->373|1773->383|1858->447|1895->457|2018->558|2058->571|2112->609|2152->611|2193->624|2270->674|2296->679|2362->718|2387->722|2440->744|2477->754|2625->875|2640->881|2692->912|2845->1035|2877->1037
                  LINES: 28->1|31->2|32->3|33->4|34->5|35->7|38->1|39->6|40->8|40->8|40->8|41->9|43->11|43->11|43->11|45->13|45->13|45->13|46->14|46->14|47->15|47->15|51->19|51->19|51->19|52->20|52->20|52->20|55->23|55->23|56->24|58->26|60->28|60->28|60->28|65->33|66->34
                  -- GENERATED --
              */
          