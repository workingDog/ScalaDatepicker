import com.kodekutters.datepicker._
import org.scalajs.jquery.jQuery
import scala.scalajs.js.{Date, JSApp}
import scala.language.implicitConversions

/**
  * a basic example using scaladatepicker facade.
  *
  * to compile and generate scaladatepicker, type "sbt fastOptJS".
  * This will generate "scaladatepicker-fastopt.js" in the "./target/scala-2.11/ directory".
  *
  * Drag and drop "testdp.html" onto your browser.
  *
  */
object PickerApp extends JSApp {

  def main(): Unit = {
    println("---> hello from PickerApp")
    // for convenience
    val jQ = jQuery("#scalaPicker")
    // construct a datepicker with some options
    jQ.datepicker(DatepickerOptions.todayHighlight(true))
    // use of a command with argument
    jQ.datepicker("setDate", new Date("2016-10-08"))
    // use of a command that returns a date
    val theDate = jQ.datepicker("getDate")
    println("theDate " + theDate)
  }

}