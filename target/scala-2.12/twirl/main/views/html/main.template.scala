
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, user: models.users.User)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.57*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*6.62*/("""
        """),format.raw/*7.9*/("""<title>"""),_display_(/*7.17*/title),format.raw/*7.22*/("""</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <script src=""""),_display_(/*13.23*/routes/*13.29*/.Assets.versioned("javascripts/main.js")),format.raw/*13.69*/(""""></script>
    </head>

    <nav class="navbar navbar-inverse">
        <div class="container-fluid">
          <div class="navbar-header">
            <a class="navbar-brand" href=""""),_display_(/*19.44*/routes/*19.50*/.HomeController.index),format.raw/*19.71*/("""">Home</a>
          </div>
          <ul class="nav navbar-nav">
   
          <li """),_display_(/*23.16*/if(title=="Login")/*23.34*/{_display_(Seq[Any](format.raw/*23.35*/("""class="active"""")))}),format.raw/*23.50*/(""">
            """),_display_(/*24.14*/if(user !=null)/*24.29*/{_display_(Seq[Any](format.raw/*24.30*/("""
              """),format.raw/*25.15*/("""<a href=""""),_display_(/*25.25*/routes/*25.31*/.HomeController.ListEmployee(0)),format.raw/*25.62*/("""">Employees</a>
              <a href=""""),_display_(/*26.25*/routes/*26.31*/.LoginController.logout()),format.raw/*26.56*/("""">Logout """),_display_(/*26.66*/user/*26.70*/.getName),format.raw/*26.78*/(""" """),format.raw/*26.79*/("""</a>
            """)))}/*27.15*/else/*27.19*/{_display_(Seq[Any](format.raw/*27.20*/("""
            """),format.raw/*28.13*/("""<a href=""""),_display_(/*28.23*/routes/*28.29*/.LoginController.login()),format.raw/*28.53*/("""">Login</a>
            """)))}),format.raw/*29.14*/("""
          """),format.raw/*30.11*/("""</li>
          </ul>
        </div>
      </nav>

    <body>
        """),format.raw/*37.32*/("""
        """),_display_(/*38.10*/content),format.raw/*38.17*/("""
    """),format.raw/*39.5*/("""</body>
</html>
"""))
      }
    }
  }

  def render(title:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 12 03:23:28 GMT 2018
                  SOURCE: /home/wdd/webapps/play/h4/app/views/main.scala.html
                  HASH: 5bb1cc7ae757488f5811774a7fc898b1d6ba8cdb
                  MATRIX: 970->1|1120->56|1148->58|1227->163|1262->172|1296->180|1321->185|1793->630|1808->636|1869->676|2080->860|2095->866|2137->887|2249->972|2276->990|2315->991|2361->1006|2403->1021|2427->1036|2466->1037|2509->1052|2546->1062|2561->1068|2613->1099|2680->1139|2695->1145|2741->1170|2778->1180|2791->1184|2820->1192|2849->1193|2886->1212|2899->1216|2938->1217|2979->1230|3016->1240|3031->1246|3076->1270|3132->1295|3171->1306|3269->1466|3306->1476|3334->1483|3366->1488
                  LINES: 28->1|33->1|35->3|38->6|39->7|39->7|39->7|45->13|45->13|45->13|51->19|51->19|51->19|55->23|55->23|55->23|55->23|56->24|56->24|56->24|57->25|57->25|57->25|57->25|58->26|58->26|58->26|58->26|58->26|58->26|58->26|59->27|59->27|59->27|60->28|60->28|60->28|60->28|61->29|62->30|68->37|69->38|69->38|70->39
                  -- GENERATED --
              */
          