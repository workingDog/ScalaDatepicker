# Scala.js interface to bootstrap-datepicker

This library **ScalaDatepicker** is a Scala interface to the [bootstrap-datepicker](https://github.com/uxsolutions/bootstrap-datepicker).
From reference 1: "Bootstrap-datepicker is a jQuery plugin that provides a flexible datepicker widget in the Twitter bootstrap style."
This bootstrap datepicker is one of a few datepicker that allows multi-dates to be selected.

## Dependencies

This facade depends on [jsext](https://github.com/jducoeur/jsext) for JSOptionBuilder support and 
[scalajs-jquery](https://github.com/scala-js/scala-js-jquery). 
The original javascript [bootstrap datepicker](https://github.com/uxsolutions/bootstrap-datepicker) is also required.

## References
 
1) [A datepicker for twitter bootstrap (@twbs)](https://github.com/uxsolutions/bootstrap-datepicker)

2) [jsext](https://github.com/jducoeur/jsext)

## Usage

To use **ScalaDatepicker** include this in your build.sbt file:

    libraryDependencies += "com.github.workingDog" %%% "scaladatepicker" % "1.0"

In addition you need to include the bootstrap-datepicker, jquery and jsext  
in your build dependencies. Typical setup:

    libraryDependencies ++= Seq(
      "com.github.workingDog" %%% "scaladatepicker" % "1.0",
      "be.doeraene" %%% "scalajs-jquery" % "0.9.0",
      "org.querki" %%% "querki-jsext" % "0.7",
      "org.webjars.bower" % "bootstrap-datepicker" % "1.6.4",   
      "org.webjars" % "jquery" % "3.1.1"      
    )

Then use it as follows, note the the important implicit that converts jquery to the required type: 

    implicit def datepickerExt(jq: JQuery): Datepicker = jq.asInstanceOf[Datepicker]

    object PickerApp extends JSApp {
      def main(): Unit = {
        // refering to an element with id = "scalaPicker"
        val jQ = jQuery("#scalaPicker")
        // construct a datepicker with some options
        jQ.datepicker(DatepickerOptions.todayHighlight(true).multidate(true))
        // use of a command with argument
        jQ.datepicker("setDate", "2016-10-08")
        // can also take a Date 
        jQ.datepicker("setDate", new Date(2016,10,8))
        // use of a command that returns a result
        val theDate = jQ.datepicker("getDate")
        println("theDate " + theDate)
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

    libraryDependencies += "com.github.workingDog" %%% "scaladatepicker" % "1.1-SNAPSHOT"

## Documentations

Refer to the original [bootstrap-datepicker](https://readthedocs.org/projects/bootstrap-datepicker/) documentation and 
[jsext](https://github.com/jducoeur/jsext) for how to use the JSOptionBuilder.

## Status

stable

