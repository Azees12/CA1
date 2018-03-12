
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
/*1.2*/import models.Department
/*2.2*/import models.Employee
/*3.2*/import models.users.User
/*4.2*/import models.Project

object updateProject extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Long,Form[models.Project],User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(id: Long, updateProjectForm: Form[models.Project], user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*8.2*/import helper._


Seq[Any](format.raw/*6.65*/("""

"""),format.raw/*9.1*/("""
"""),_display_(/*10.2*/main("Update Project",user)/*10.29*/{_display_(Seq[Any](format.raw/*10.30*/("""
    """),format.raw/*11.5*/("""<p class="lead">Add Members</p>

    """),_display_(/*13.6*/form(action=routes.HomeController.addProjectSubmit(), 'class -> "form-horizontal",'role ->"form")/*13.103*/ {_display_(Seq[Any](format.raw/*13.105*/("""

        """),_display_(/*15.10*/CSRF/*15.14*/.formField),format.raw/*15.24*/("""
        
        """),_display_(/*17.10*/inputText(updateProjectForm("name"), '_label ->"Name",'_showConstraints ->false, 'class -> "form-control")),format.raw/*17.116*/("""


        """),_display_(/*20.10*/for((value, name) <- Employee.options) yield /*20.48*/ {_display_(Seq[Any](format.raw/*20.50*/("""
            """),format.raw/*21.13*/("""<input type="checkbox" name="empSelect[]" value=""""),_display_(/*21.63*/value),format.raw/*21.68*/(""""
            """),_display_(/*22.14*/if(Employee.inEmployee(value.toLong,id))/*22.54*/{_display_(Seq[Any](format.raw/*22.55*/("""
                """),format.raw/*23.17*/("""checked
            """)))}),format.raw/*24.14*/("""
            """),format.raw/*25.13*/("""/>"""),_display_(/*25.16*/name),format.raw/*25.20*/("""<br>        
        """)))}),format.raw/*26.10*/("""

        """),format.raw/*28.9*/("""<div class="action">
            <input type="submit" value="Add Project" class="btn btn-primary">
            <a href=""""),_display_(/*30.23*/routes/*30.29*/.HomeController.ListEmployee(0)),format.raw/*30.60*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*34.6*/("""
   
""")))}))
      }
    }
  }

  def render(id:Long,updateProjectForm:Form[models.Project],user:User): play.twirl.api.HtmlFormat.Appendable = apply(id,updateProjectForm,user)

  def f:((Long,Form[models.Project],User) => play.twirl.api.HtmlFormat.Appendable) = (id,updateProjectForm,user) => apply(id,updateProjectForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 12 02:43:39 GMT 2018
                  SOURCE: /home/wdd/webapps/play/h4/app/views/updateProject.scala.html
                  HASH: 9ee452f04ed8a08d6e6517417e5316ea7fad0b36
                  MATRIX: 651->1|683->27|713->51|745->77|1103->101|1239->167|1284->164|1312->183|1340->185|1376->212|1415->213|1447->218|1511->256|1618->353|1659->355|1697->366|1710->370|1741->380|1787->399|1915->505|1954->517|2008->555|2048->557|2089->570|2166->620|2192->625|2234->640|2283->680|2322->681|2367->698|2419->719|2460->732|2490->735|2515->739|2568->761|2605->771|2753->892|2768->898|2820->929|2968->1047
                  LINES: 24->1|25->2|26->3|27->4|32->6|35->8|38->6|40->9|41->10|41->10|41->10|42->11|44->13|44->13|44->13|46->15|46->15|46->15|48->17|48->17|51->20|51->20|51->20|52->21|52->21|52->21|53->22|53->22|53->22|54->23|55->24|56->25|56->25|56->25|57->26|59->28|61->30|61->30|61->30|65->34
                  -- GENERATED --
              */
          