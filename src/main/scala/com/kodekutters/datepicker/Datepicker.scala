/**
  * A Scala.js facade to bootstrap-datepicker
  *
  * Reference:  [[https://github.com/eternicode/bootstrap-datepicker]]
  *
  * Author: R. Wathelet October 2016
  */
package com.kodekutters.datepicker

import org.querki.jsext.{JSOptionBuilder, _}

import scala.language.implicitConversions
import scala.scalajs.js
import scala.scalajs.js.{Any, Date, UndefOr, |}

@js.native
trait DatepickerOptions extends js.Object

object DatepickerOptions extends DatepickerOptionsBuilder(noOpts)

class DatepickerOptionsBuilder(val dict: OptMap) extends JSOptionBuilder[DatepickerOptions, DatepickerOptionsBuilder](new DatepickerOptionsBuilder(_)) {

  def language(v: String) = jsOpt("language", v)

  def multidate(v: Boolean) = jsOpt("multidate", v)

  def format(v: String) = jsOpt("format", v)

  def todayHighlight(v: Boolean) = jsOpt("todayHighlight", v)

  def startDate(v: Date | String) = jsOpt("startDate", v)

  def autoclose(v: Boolean) = jsOpt("autoclose", v)

  def beforeShowDay(v: Date | String) = jsOpt("beforeShowDay", v)

  def beforeShowMonth(v: Date | String) = jsOpt("beforeShowMonth", v)

  def beforeShowYear(v: Date | String) = jsOpt("beforeShowYear", v)

  def beforeShowDecade(v: Date | String) = jsOpt("beforeShowDecade", v)

  def beforeShowCentury(v: Date | String) = jsOpt("beforeShowCentury", v)

  def calendarWeeks(v: Boolean) = jsOpt("calendarWeeks", v)

  def clearBtn(v: Boolean) = jsOpt("clearBtn", v)

  def container(v: String) = jsOpt("container", v)

  def datesDisabled(v: Array[String]) = jsOpt("datesDisabled", v)

  def daysOfWeekDisabled(v: Array[String]) = jsOpt("daysOfWeekDisabled", v)

  def daysOfWeekHighlighted(v: Array[String]) = jsOpt("daysOfWeekHighlighted", v)

  def disableTouchKeyboard(v: Boolean) = jsOpt("disableTouchKeyboard", v)

  def enableOnReadonly(v: Boolean) = jsOpt("enableOnReadonly", v)

  def endDate(v: Date | String) = jsOpt("endDate", v)

  def forceParse(v: Boolean) = jsOpt("forceParse", v)

  def assumeNearbyYear(v: Boolean | Int) = jsOpt("assumeNearbyYear", v)

  def immediateUpdates(v: Boolean) = jsOpt("immediateUpdates", v)

  def inputs(v: Array[String]) = jsOpt("inputs", v)

  def keyboardNavigation(v: Boolean) = jsOpt("keyboardNavigation", v)

  def maxViewMode(v: Int | String) = jsOpt("maxViewMode", v)

  def minViewMode(v: Int | String) = jsOpt("minViewMode", v)

  def multidate(v: Boolean | Int) = jsOpt("multidate", v)

  def multidateSeparator(v: String) = jsOpt("multidateSeparator", v)

  def orientation(v: String) = jsOpt("orientation", v)

  def showOnFocus(v: Boolean) = jsOpt("showOnFocus", v)

  def startView(v: Int | String) = jsOpt("startView", v)

  def templates(v: Object) = jsOpt("templates", v)

  def title(v: String) = jsOpt("title", v)

  def todayBtn(v: Boolean) = jsOpt("todayBtn", v)

  def toggleActive(v: Boolean) = jsOpt("toggleActive", v)

  def weekStart(v: Int) = jsOpt("weekStart", v)

  def zIndexOffset(v: Int) = jsOpt("zIndexOffset", v)
}

@js.native
trait EventAttributes extends js.Object {
  def date: Date = js.native

  def dates: js.UndefOr[Array[Date]] = js.native

  def format: js.Function2[UndefOr[Int], UndefOr[String], String] = js.native
}

@js.native
trait Datepicker extends js.Object {

  // constructor with possible options
  def datepicker(options: DatepickerOptions = ???): Datepicker = js.native

  // commands with variable arguments
  def datepicker(cmd: String, args: Any*): Any = js.native

  // events processing
  def on(event: String, func: js.Function1[EventAttributes, Any] = ???): Any = js.native

  // aliases
  // "-1d"
  val yesterday: String = js.native
  // "+0d"
  val today: String = js.native
  // "+1d"
  val tomorrow: String = js.native
}



