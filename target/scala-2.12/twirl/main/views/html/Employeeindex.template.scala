
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

object Employeeindex extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[List[models.Employee],models.users.User,List[models.Department],play.api.Environment,List[models.Project],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(employees: List[models.Employee],user: models.users.User,departments: List[models.Department], env: play.api.Environment, projects: List[models.Project]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.156*/("""

"""),_display_(/*3.2*/main("Employee index", user)/*3.30*/{_display_(Seq[Any](format.raw/*3.31*/("""


    """),format.raw/*6.5*/("""<div class ="col-sm-10">
        <table class ="table table-bordered table-hover table-condensed">
            <thead>
                <tr>
                    <th>Photo</th>
                    <th>Name</th>
                    <th>Department</th>
                    <th>Email</th>

                </tr>
            </thead>
            <tbody> 
     """),_display_(/*18.7*/for(p<-employees) yield /*18.24*/{_display_(Seq[Any](format.raw/*18.25*/("""
     """),format.raw/*19.6*/("""<tr>
        
            """),_display_(/*21.14*/if(env.resource("public/images/EmployeePic/thumbnails"+ p.getId + ".jpg").isDefined)/*21.98*/{_display_(Seq[Any](format.raw/*21.99*/("""
                """),format.raw/*22.17*/("""<td> <a href=""""),_display_(/*22.32*/routes/*22.38*/.HomeController.EmployeeView(p.getId())),format.raw/*22.77*/(""""><img src "/assets/images/EmployeePic/thumbnails/"""),_display_(/*22.128*/(p.getId +".jpg")),format.raw/*22.145*/(""""/>  </a></td>
            """)))}/*23.15*/else/*23.19*/{_display_(Seq[Any](format.raw/*23.20*/("""
                """),format.raw/*24.17*/("""<td><a href=""""),_display_(/*24.31*/routes/*24.37*/.HomeController.EmployeeView(p.getId())),format.raw/*24.76*/("""">No Photo Available</a></td>
            """)))}),format.raw/*25.14*/("""
        """),format.raw/*26.9*/("""<td>"""),_display_(/*26.14*/p/*26.15*/.getName),format.raw/*26.23*/("""</td>
        <td>"""),_display_(/*27.14*/p/*27.15*/.getDepartment.getDepartment),format.raw/*27.43*/("""</td>
        <td>"""),_display_(/*28.14*/p/*28.15*/.getEmail),format.raw/*28.24*/("""</td> 
        </tr>


""")))}),format.raw/*32.2*/("""
""")))}))
      }
    }
  }

  def render(employees:List[models.Employee],user:models.users.User,departments:List[models.Department],env:play.api.Environment,projects:List[models.Project]): play.twirl.api.HtmlFormat.Appendable = apply(employees,user,departments,env,projects)

  def f:((List[models.Employee],models.users.User,List[models.Department],play.api.Environment,List[models.Project]) => play.twirl.api.HtmlFormat.Appendable) = (employees,user,departments,env,projects) => apply(employees,user,departments,env,projects)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 12 02:43:39 GMT 2018
                  SOURCE: /home/wdd/webapps/play/h4/app/views/Employeeindex.scala.html
                  HASH: 670f4fa780e34e135ce500127526d22b8167ffb9
                  MATRIX: 1055->1|1305->155|1333->158|1369->186|1407->187|1440->194|1821->549|1854->566|1893->567|1926->573|1980->600|2073->684|2112->685|2157->702|2199->717|2214->723|2274->762|2353->813|2392->830|2439->859|2452->863|2491->864|2536->881|2577->895|2592->901|2652->940|2726->983|2762->992|2794->997|2804->998|2833->1006|2879->1025|2889->1026|2938->1054|2984->1073|2994->1074|3024->1083|3078->1107
                  LINES: 28->1|33->1|35->3|35->3|35->3|38->6|50->18|50->18|50->18|51->19|53->21|53->21|53->21|54->22|54->22|54->22|54->22|54->22|54->22|55->23|55->23|55->23|56->24|56->24|56->24|56->24|57->25|58->26|58->26|58->26|58->26|59->27|59->27|59->27|60->28|60->28|60->28|64->32
                  -- GENERATED --
              */
          