/**
  * A Scala.js facade to bootstrap-datepicker
  *
  * Reference:  [[https://github.com/uxsolutions/bootstrap-datepicker]]
  *
  * Author: R. Wathelet October 2016
  */
package com.kodekutters.datepicker

import org.scalajs.jquery.JQueryEventObject

import scala.language.implicitConversions
import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.{Any, Date, UndefOr, |}



/**
  * the Symbol options
  */
@ScalaJSDefined
trait DatepickerOptions extends js.Object {

  val language: js.UndefOr[String] = js.undefined
  val format: js.UndefOr[String] = js.undefined
  val todayHighlight: js.UndefOr[Boolean] = js.undefined
  val startDate: js.UndefOr[Date | String] = js.undefined
  val autoclose: js.UndefOr[Boolean] = js.undefined
  val beforeShowDay: js.UndefOr[Date | String] = js.undefined
  val beforeShowMonth: js.UndefOr[Date | String] = js.undefined
  val beforeShowYear: js.UndefOr[Date | String] = js.undefined
  val beforeShowDecade: js.UndefOr[Date | String] = js.undefined
  val beforeShowCentury: js.UndefOr[Date | String] = js.undefined
  val calendarWeeks: js.UndefOr[Boolean] = js.undefined
  val clearBtn: js.UndefOr[Boolean] = js.undefined
  val container: js.UndefOr[String] = js.undefined
  val datesDisabled: js.UndefOr[Boolean] = js.undefined
  val daysOfWeekDisabled: js.UndefOr[Array[String]] = js.undefined
  val daysOfWeekHighlighted: js.UndefOr[Array[String]] = js.undefined
  val disableTouchKeyboard: js.UndefOr[Array[String]] = js.undefined
  val enableOnReadonly: js.UndefOr[Boolean] = js.undefined
  val endDate: js.UndefOr[Date | String] = js.undefined
  val forceParse: js.UndefOr[Boolean] = js.undefined
  val assumeNearbyYear: js.UndefOr[Boolean] = js.undefined
  val immediateUpdates: js.UndefOr[Boolean] = js.undefined
  val inputs: js.UndefOr[Array[String]] = js.undefined
  val keyboardNavigation: js.UndefOr[Boolean] = js.undefined
  val maxViewMode: js.UndefOr[Int | String] = js.undefined
  val minViewMode: js.UndefOr[Int | String] = js.undefined
  val multidate: js.UndefOr[Boolean | Int] = js.undefined
  val multidateSeparator: js.UndefOr[String] = js.undefined
  val orientation: js.UndefOr[String] = js.undefined
  val showOnFocus: js.UndefOr[Boolean] = js.undefined
  val startView: js.UndefOr[Int | String] = js.undefined
  val templates: js.UndefOr[Object] = js.undefined
  val title: js.UndefOr[String] = js.undefined
  val todayBtn: js.UndefOr[Boolean] = js.undefined
  val toggleActive: js.UndefOr[Boolean] = js.undefined
  val weekStart: js.UndefOr[Int] = js.undefined
  val zIndexOffset: js.UndefOr[Int] = js.undefined
}

@js.native
trait EventAttributes extends JQueryEventObject {
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

  // aliases
  // "-1d"
  val yesterday: String = js.native
  // "+0d"
  val today: String = js.native
  // "+1d"
  val tomorrow: String = js.native
}
