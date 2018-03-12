
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.27*/("""

"""),_display_(/*4.2*/main("Home",user)/*4.19*/ {_display_(Seq[Any](format.raw/*4.21*/("""
    """),format.raw/*5.5*/("""<div class="jumbotron text-center">
            <h1>Online business</h1>
            <legend style="font-weight:bold;" >See what you co.worker are working on at the moment</p></legend>
""")))}),format.raw/*8.2*/("""
"""))
      }
    }
  }

  def render(user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 12 03:23:28 GMT 2018
                  SOURCE: /home/wdd/webapps/play/h4/app/views/index.scala.html
                  HASH: 29f76394aa5db433f93e77725762ba9138194f5e
                  MATRIX: 959->2|1079->27|1107->30|1132->47|1171->49|1202->54|1417->240
                  LINES: 28->2|33->2|35->4|35->4|35->4|36->5|39->8
                  -- GENERATED --
              */
          