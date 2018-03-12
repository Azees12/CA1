
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

object ListEmployee extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[List[models.Employee],models.users.User,List[models.Department],play.api.Environment,List[models.Project],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(employees: List[models.Employee],user: models.users.User,departments: List[models.Department], env: play.api.Environment, projects: List[models.Project]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.156*/("""


"""),_display_(/*4.2*/main("Employees",user)/*4.24*/{_display_(Seq[Any](format.raw/*4.25*/("""
     """),format.raw/*5.6*/("""<p class ="lead">Employees</p> 
<div class ="row">
    <div class ="col-sm-2">
    
     <ul class ="list-group">
         <h4 class= "list-group-item">Departments</h4>
         <a href=""""),_display_(/*11.20*/routes/*11.26*/.HomeController.ListEmployee(0)),format.raw/*11.57*/("""" class ="list-group-item">All Departments</a>
        """),_display_(/*12.10*/for(d <- departments) yield /*12.31*/{_display_(Seq[Any](format.raw/*12.32*/("""
         """),format.raw/*13.10*/("""<a href=""""),_display_(/*13.20*/routes/*13.26*/.HomeController.ListEmployee(d.getDepartmentId)),format.raw/*13.73*/("""" class ="list-group-item">"""),_display_(/*13.101*/d/*13.102*/.getDepartment),format.raw/*13.116*/("""
             """),format.raw/*14.14*/("""<span class="badge">"""),_display_(/*14.35*/d/*14.36*/.getEmployees.size()),format.raw/*14.56*/("""</span>
         </a>   
        """)))}),format.raw/*16.10*/("""
     """),format.raw/*17.6*/("""</ul>


     <ul class ="list-group">
        <h4 class= "list-group-item">Projects</h4>
        <a href=""""),_display_(/*22.19*/routes/*22.25*/.HomeController.ListEmployee(0)),format.raw/*22.56*/("""" class ="list-group-item">All Departments</a>
       """),_display_(/*23.9*/for(d <- projects) yield /*23.27*/{_display_(Seq[Any](format.raw/*23.28*/("""
        """),format.raw/*24.9*/("""<a  class ="list-group-item">"""),_display_(/*24.39*/d/*24.40*/.getname),format.raw/*24.48*/("""
            """),format.raw/*25.13*/("""<span class="badge">"""),_display_(/*25.34*/d/*25.35*/.getMembers.size()),format.raw/*25.53*/("""</span>
        </a>   
       """)))}),format.raw/*27.9*/("""
    """),format.raw/*28.5*/("""</ul>


    </div>
<div class ="col-sm-10">
    <table class ="table table-bordered table-hover table-condensed">
        <thead>
            <tr>
                <th>Photo</th>
                <th>Name</th>
                <th>Department</th>
                <th>Email</th>
                <th>Projects</th>
                <th>Edit</th>
                <th>Remove </th>
            </tr>
        </thead>
        <tbody> 
"""),_display_(/*46.2*/for(p<-employees) yield /*46.19*/{_display_(Seq[Any](format.raw/*46.20*/("""
"""),format.raw/*47.1*/("""<tr>
    
        """),_display_(/*49.10*/if(env.resource("public/images/EmployeePic/thumbnails"+ p.getId + ".jpg").isDefined)/*49.94*/{_display_(Seq[Any](format.raw/*49.95*/("""
            """),format.raw/*50.13*/("""<td><img src "/assets/images/EmployeePic/thumbnails/"""),_display_(/*50.66*/(p.getId +".jpg")),format.raw/*50.83*/(""""/></td>
        """)))}/*51.11*/else/*51.15*/{_display_(Seq[Any](format.raw/*51.16*/("""
            """),format.raw/*52.13*/("""<td><a>No Photo Available</a></td>
        """)))}),format.raw/*53.10*/("""
    """),format.raw/*54.5*/("""<td>"""),_display_(/*54.10*/p/*54.11*/.getName),format.raw/*54.19*/("""</td>
    <td>"""),_display_(/*55.10*/p/*55.11*/.getDepartment.getDepartment),format.raw/*55.39*/("""</td>
    <td>"""),_display_(/*56.10*/p/*56.11*/.getEmail),format.raw/*56.20*/("""</td> 
    <td>
        <div class="dropdown">
            <button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">Projects
            <span class="caret"></span></button>
            <ul class="dropdown-menu">
             """),_display_(/*62.15*/for(p<-p.getProjects) yield /*62.36*/{_display_(Seq[Any](format.raw/*62.37*/("""
              """),format.raw/*63.15*/("""<li>"""),_display_(/*63.20*/p/*63.21*/.getname),format.raw/*63.29*/("""</li>
             """)))}),format.raw/*64.15*/("""
            """),format.raw/*65.13*/("""</ul>
        </div> 
        </td>    
        <td>
            <a href =""""),_display_(/*69.24*/routes/*69.30*/.HomeController.updateEmployee(p.getId)),format.raw/*69.69*/("""" class="button-xs btn danger">
               <span class="gyphicon glyphicon-pencil"></span> </a>
        </td>
        
     <td> 
         <a href =""""),_display_(/*74.21*/routes/*74.27*/.HomeController.deleteEmployee(p.getId)),format.raw/*74.66*/("""" class="button-xs btn-danger" onclick ="return confirmDel();">
             <span class= "glyphicon glyphicon-trash"></span>
            </a>
        </td>   
        
</tr>
""")))}),format.raw/*80.2*/("""


"""),format.raw/*83.1*/("""</tbody>
</table>



<p>
<a href=""""),_display_(/*89.11*/routes/*89.17*/.HomeController.addEmployee()),format.raw/*89.46*/("""">
 <button class ="btn btn-primary">Add a Employee</button>
</a>

</p>
<br><br><br>


<div class ="col-sm-10">
    <table class ="table table-bordered table-hover table-condensed">
        <thead>
            <tr>         
                <th>Project Name</th>
                <th>Members</th>
                <th>Add Members</th>
                <th>Delete</th>
            </tr>
        </thead>
        <tbody> 
                """),_display_(/*108.18*/for(c<-projects) yield /*108.34*/{_display_(Seq[Any](format.raw/*108.35*/("""
            """),format.raw/*109.13*/("""<tr>
            <td>"""),_display_(/*110.18*/c/*110.19*/.getname),format.raw/*110.27*/("""</td>
            <td>
                    <div class="dropdown">
                            <button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">Members
                            <span class="caret"></span></button>
                            <ul class="dropdown-menu">
                             """),_display_(/*116.31*/for(d<-c.getMembers) yield /*116.51*/{_display_(Seq[Any](format.raw/*116.52*/("""
                              """),format.raw/*117.31*/("""<li>"""),_display_(/*117.36*/d/*117.37*/.getName),format.raw/*117.45*/("""</li>
                             """)))}),format.raw/*118.31*/("""
                            """),format.raw/*119.29*/("""</ul>
                        </div> 
            </td>

             <td>
            <a href =""""),_display_(/*124.24*/routes/*124.30*/.HomeController.updateProject(c.getId)),format.raw/*124.68*/("""" class="button-xs btn danger">
               <span class="gyphicon glyphicon-pencil"></span> </a>
        </td>
        
     <td> 
         <a href =""""),_display_(/*129.21*/routes/*129.27*/.HomeController.deleteProject(c.getId)),format.raw/*129.65*/("""" class="button-xs btn-danger" onclick ="return confirmDel();">
             <span class= "glyphicon glyphicon-trash"></span>
            </a>
        </td>   


</tr>
                """)))}),format.raw/*136.18*/("""
       """),format.raw/*137.8*/("""</tbody>
       </table>

       <p>
        <a href=""""),_display_(/*141.19*/routes/*141.25*/.HomeController.addProject()),format.raw/*141.53*/("""">
         <button class ="btn btn-primary">Add a new Project</button>
        </a>
        </p>







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
                  DATE: Mon Mar 12 03:35:44 GMT 2018
                  SOURCE: /home/wdd/webapps/play/h4/app/views/ListEmployee.scala.html
                  HASH: 037898a103c9e99bc7455fdd97c5380d3ea9a808
                  MATRIX: 1054->1|1304->155|1333->159|1363->181|1401->182|1433->188|1648->376|1663->382|1715->413|1798->469|1835->490|1874->491|1912->501|1949->511|1964->517|2032->564|2088->592|2099->593|2135->607|2177->621|2225->642|2235->643|2276->663|2341->697|2374->703|2508->810|2523->816|2575->847|2656->902|2690->920|2729->921|2765->930|2822->960|2832->961|2861->969|2902->982|2950->1003|2960->1004|2999->1022|3061->1054|3093->1059|3544->1484|3577->1501|3616->1502|3644->1503|3690->1522|3783->1606|3822->1607|3863->1620|3943->1673|3981->1690|4018->1709|4031->1713|4070->1714|4111->1727|4186->1771|4218->1776|4250->1781|4260->1782|4289->1790|4331->1805|4341->1806|4390->1834|4432->1849|4442->1850|4472->1859|4754->2114|4791->2135|4830->2136|4873->2151|4905->2156|4915->2157|4944->2165|4995->2185|5036->2198|5139->2274|5154->2280|5214->2319|5395->2473|5410->2479|5470->2518|5676->2694|5706->2697|5768->2732|5783->2738|5833->2767|6294->3200|6327->3216|6367->3217|6409->3230|6459->3252|6470->3253|6500->3261|6865->3598|6902->3618|6942->3619|7002->3650|7035->3655|7046->3656|7076->3664|7144->3700|7202->3729|7328->3827|7344->3833|7404->3871|7586->4025|7602->4031|7662->4069|7879->4254|7915->4262|7998->4317|8014->4323|8064->4351
                  LINES: 28->1|33->1|36->4|36->4|36->4|37->5|43->11|43->11|43->11|44->12|44->12|44->12|45->13|45->13|45->13|45->13|45->13|45->13|45->13|46->14|46->14|46->14|46->14|48->16|49->17|54->22|54->22|54->22|55->23|55->23|55->23|56->24|56->24|56->24|56->24|57->25|57->25|57->25|57->25|59->27|60->28|78->46|78->46|78->46|79->47|81->49|81->49|81->49|82->50|82->50|82->50|83->51|83->51|83->51|84->52|85->53|86->54|86->54|86->54|86->54|87->55|87->55|87->55|88->56|88->56|88->56|94->62|94->62|94->62|95->63|95->63|95->63|95->63|96->64|97->65|101->69|101->69|101->69|106->74|106->74|106->74|112->80|115->83|121->89|121->89|121->89|140->108|140->108|140->108|141->109|142->110|142->110|142->110|148->116|148->116|148->116|149->117|149->117|149->117|149->117|150->118|151->119|156->124|156->124|156->124|161->129|161->129|161->129|168->136|169->137|173->141|173->141|173->141
                  -- GENERATED --
              */
          