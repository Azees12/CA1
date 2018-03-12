
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
/*2.2*/import models.Department
/*3.2*/import models.users.User
/*4.2*/import models.Project

object updateEmployee extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Long,Form[Employee],User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(id: Long, updateEmployeeForm: Form[Employee], user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*9.2*/import helper._


Seq[Any](format.raw/*6.60*/("""


"""),_display_(/*10.2*/main("Update Employee", user)/*10.31*/ {_display_(Seq[Any](format.raw/*10.33*/("""

	"""),format.raw/*12.2*/("""<h3>Update Employee</h3>

	"""),_display_(/*14.3*/form(action = routes.HomeController.updateEmployeeSubmit(id), 'class -> "form-horizontal", 'role->"form", 'enctype -> "multipart/form-data")/*14.143*/ {_display_(Seq[Any](format.raw/*14.145*/("""
		
		"""),_display_(/*16.4*/CSRF/*16.8*/.formField),format.raw/*16.18*/("""
		
		"""),_display_(/*18.4*/inputText(updateEmployeeForm("email"), '_label -> "Email",'_showConstraints ->false, 'class -> "form-control")),format.raw/*18.114*/("""
        """),_display_(/*19.10*/inputText(updateEmployeeForm("name"), '_label -> "Name",'_showConstraints ->false, 'class -> "form-control")),format.raw/*19.118*/("""
        
        """),_display_(/*21.10*/select(
            updateEmployeeForm("department.id"),
            options(Department.options),
            '_label -> "Select Department",'_default -> " Select One ",
            '_showConstraints ->true, 'class -> "form-control"
          )),format.raw/*26.12*/("""

		"""),format.raw/*28.3*/("""<label>Image</label>
    <input class="btn-sm btn-default" type="file" name="upload">
	
		<br><br>


    <div class="action">
    <input type="submit" value="Add Employee" class="btn btn-primary">
    <a href=""""),_display_(/*36.15*/routes/*36.21*/.HomeController.ListEmployee(0)),format.raw/*36.52*/("""">
        <button type="button" class="btn btn-warning">Cancel</button>
    </a>
</div>>
	""")))}),format.raw/*40.3*/(""" 

""")))}),format.raw/*42.2*/(""" 


"""))
      }
    }
  }

  def render(id:Long,updateEmployeeForm:Form[Employee],user:User): play.twirl.api.HtmlFormat.Appendable = apply(id,updateEmployeeForm,user)

  def f:((Long,Form[Employee],User) => play.twirl.api.HtmlFormat.Appendable) = (id,updateEmployeeForm,user) => apply(id,updateEmployeeForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 12 03:08:24 GMT 2018
                  SOURCE: /home/wdd/webapps/play/h4/app/views/updateEmployee.scala.html
                  HASH: b257da04e38a5f124690bcdc880a6ff28fd94877
                  MATRIX: 651->1|681->25|713->51|745->77|1098->101|1229->163|1274->159|1304->180|1342->209|1382->211|1412->214|1466->242|1616->382|1657->384|1690->391|1702->395|1733->405|1766->412|1898->522|1935->532|2065->640|2111->659|2376->903|2407->907|2645->1118|2660->1124|2712->1155|2834->1247|2868->1251
                  LINES: 24->1|25->2|26->3|27->4|32->6|35->9|38->6|41->10|41->10|41->10|43->12|45->14|45->14|45->14|47->16|47->16|47->16|49->18|49->18|50->19|50->19|52->21|57->26|59->28|67->36|67->36|67->36|71->40|73->42
                  -- GENERATED --
              */
          