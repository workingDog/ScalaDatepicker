package com.kodekutters

import org.scalajs.jquery.JQuery
import scala.language.implicitConversions

/**
  * A Scala.js facade to bootstrap-datepicker
  *
  * Reference:  [[https://github.com/eternicode/bootstrap-datepicker]]
  *
  * Author: R. Wathelet October 2016
  */
package object datepicker {

  implicit def datepickerExt(jq: JQuery): Datepicker = jq.asInstanceOf[Datepicker]

}
