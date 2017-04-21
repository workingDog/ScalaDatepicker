# Scala.js interface to bootstrap-datepicker

This library **ScalaDatepicker** is a Scala interface to the [bootstrap-datepicker](https://github.com/uxsolutions/bootstrap-datepicker).
From reference 1: "Bootstrap-datepicker is a jQuery plugin that provides a flexible datepicker widget in the Twitter bootstrap style."
This bootstrap datepicker is one of a few datepicker that allows multi-dates to be selected.

## Dependencies

**ScalaDatepicker** version 1.1 requires Scala.js 0.6.14.

This **ScalaDatepicker** version 1.2-SNAPSHOT requires Scala.js 0.6.15.

The original javascript [bootstrap datepicker](https://github.com/uxsolutions/bootstrap-datepicker) is required.

## References
 
1) [A datepicker for twitter bootstrap (@twbs)](https://github.com/uxsolutions/bootstrap-datepicker)

## Usage

To use **ScalaDatepicker** include this in your build.sbt file:

    libraryDependencies += "com.github.workingDog" %%% "scaladatepicker" % "1.1"

In addition you need to include the bootstrap-datepicker and jquery 
in your build dependencies. Typical setup:

    libraryDependencies ++= Seq(
      "com.github.workingDog" %%% "scaladatepicker" % "1.1",
      "be.doeraene" %%% "scalajs-jquery" % "0.9.1",
      "org.webjars.bower" % "bootstrap-datepicker" % "1.6.4",   
      "org.webjars" % "jquery" % "3.1.1"      
    )

Then use it as follows, note the the important implicit that converts jquery to the required type: 

    implicit def datepickerExt(jq: JQuery): Datepicker = jq.asInstanceOf[Datepicker]

    object PickerApp extends JSApp {
      def main(): Unit = {
      // ensure the dom is ready
      jQuery(dom.document).ready(() => {
        // refering to an element with id = "scalaPicker"
        val jQ = jQuery("#scalaPicker")
        // construct a datepicker with some options
        jQ.datepicker(new DatepickerOptions {
            override val todayHighlight: js.UndefOr[Boolean] = true
            override val multidate: js.UndefOr[Boolean | Int] = true
         })
        // use of a command with argument
        jQ.datepicker("setDate", "2016-10-08")
        // can also take a Date 
        jQ.datepicker("setDate", new Date(2016,10,8))
        // use of a command that returns a result
        val theDate = jQ.datepicker("getDate")
        println("theDate " + theDate)
       }
      }
    }

Generally use **ScalaDatepicker** as you would the original **bootstrap-datepicker**.

## Compiling and installation 

To compile and generate a javascript file from the source code:

    sbt fullOptJS 

The javascript file (scaladatepicker-opt.js) will be in the "./target/scala-2.11" directory.

To publish it to your local (Ivy) repository, simply type:

    sbt publishLocal
    
Then include this in your build.sbt file

    libraryDependencies += "com.github.workingDog" %%% "scaladatepicker" % "1.2-SNAPSHOT"

## Documentations

Refer to the original [bootstrap-datepicker](https://readthedocs.org/projects/bootstrap-datepicker/) documentation.

## Status

stable

