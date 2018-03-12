
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

object addEmployee extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.Employee],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(EmployeeForm: Form[models.Employee],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import models.Department
/*3.2*/import models.Employee
/*4.2*/import models.users.User
/*5.2*/import models.Project
/*8.2*/import helper._


Seq[Any](format.raw/*1.63*/("""
"""),format.raw/*6.1*/("""

"""),_display_(/*9.2*/main("Add Employee",user)/*9.27*/{_display_(Seq[Any](format.raw/*9.28*/("""
    """),format.raw/*10.5*/("""<p class="lead">Add a Employee</p>
    
    """),_display_(/*12.6*/form(action=routes.HomeController.addEmployeeSubmit(), 'class -> "form-horizontal",'role ->"form", 'enctype -> "multipart/form-data")/*12.139*/ {_display_(Seq[Any](format.raw/*12.141*/("""
    
    """),_display_(/*14.6*/CSRF/*14.10*/.formField),format.raw/*14.20*/("""
    """),_display_(/*15.6*/inputText(EmployeeForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*15.71*/("""
    """),_display_(/*16.6*/inputText(EmployeeForm("email"), '_label -> "Email",'_showConstraints ->false, 'class -> "form-control")),format.raw/*16.110*/("""
    """),_display_(/*17.6*/inputText(EmployeeForm("name"), '_label -> "Name",'_showConstraints ->false, 'class -> "form-control")),format.raw/*17.108*/("""
    
    """),_display_(/*19.6*/select(
      EmployeeForm("department.id"),
      options(Department.options),
      '_label -> "Select Department",'_default -> " Select One ",
      '_showConstraints ->false, 'class -> "form-control"
    )),format.raw/*24.6*/("""

"""),format.raw/*26.1*/("""<label>Image</label>
<input class ="btn-sm btn-default" type="file" name="upload">
<br><br>

<br>
    <br>
  


    <div class="action">
        <input type="submit" value="Add Employee" class="btn btn-primary">
        <a href=""""),_display_(/*37.19*/routes/*37.25*/.HomeController.ListEmployee(0)),format.raw/*37.56*/("""">
            <button type="button" class="btn btn-warning">Cancel</button>
        </a>
    </div>
""")))}),format.raw/*41.2*/("""
""")))}),format.raw/*42.2*/("""
"""))
      }
    }
  }

  def render(EmployeeForm:Form[models.Employee],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(EmployeeForm,user)

  def f:((Form[models.Employee],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (EmployeeForm,user) => apply(EmployeeForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 12 03:09:38 GMT 2018
                  SOURCE: /home/wdd/webapps/play/h4/app/views/addEmployee.scala.html
                  HASH: ce207b6092b7713c46ff6c618ba12bc7468ef82c
                  MATRIX: 987->1|1121->64|1153->90|1183->114|1215->140|1244->165|1289->62|1316->162|1344->182|1377->207|1415->208|1447->213|1518->258|1661->391|1702->393|1739->404|1752->408|1783->418|1815->424|1901->489|1933->495|2059->599|2091->605|2215->707|2252->718|2481->927|2510->929|2767->1159|2782->1165|2834->1196|2966->1298|2998->1300
                  LINES: 28->1|31->2|32->3|33->4|34->5|35->8|38->1|39->6|41->9|41->9|41->9|42->10|44->12|44->12|44->12|46->14|46->14|46->14|47->15|47->15|48->16|48->16|49->17|49->17|51->19|56->24|58->26|69->37|69->37|69->37|73->41|74->42
                  -- GENERATED --
              */
          