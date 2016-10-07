# Scala.js interface to bootstrap-datepicker

This library **ScalaDatepicker** is a Scala interface to the [bootstrap-datepicker](https://github.com/eternicode/bootstrap-datepicker).

@eternicode bootstrap-datepicker is a very useful bootstrap datepicker, it is one of a few datepicker that allows multi-dates to be selected.

## References
 
1) [@eternicode datepicker for @twitter bootstrap](https://github.com/eternicode/bootstrap-datepicker)

2) [jsext](https://github.com/jducoeur/jsext)

## Dependencies

This facade uses [jsext](https://github.com/jducoeur/jsext) for JSOptionBuilder support.

## Compiling and installation 

To compile and generate a javascript file from the source code:

    sbt fullOptJS 

The javascript file (scaladatepicker-opt.js) will be in the "./target/scala-2.11" directory.

To publish it to your local (Ivy) repository, simply type:

    sbt publishLocal
    
Then include this in your build.sbt file

    libraryDependencies += "com.github.workingDog" %%% "scaladatepicker" % "1.0"

## Usage

To use this facade, at a minimum you need to provide the bootstrap-datepicker, jquery and jsext  
in your build dependencies. Typical setup:

    libraryDependencies ++= Seq(
      "com.github.workingDog" %%% "scaladatepicker" % "1.0",
      "be.doeraene" %%% "scalajs-jquery" % "0.9.0",
      "org.querki" %%% "querki-jsext" % "0.7",
      "org.webjars" % "bootstrap-datepicker" % "1.6.1",   
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
        jQ.datepicker("setDate", new Date("2016-10-08"))
        // use of a command that returns a result
        val theDate = jQ.datepicker("getDate")
        println("theDate " + theDate)
      }
    }

## Documentations

Refer to the original [bootstrap-datepicker](https://bootstrap-datepicker.readthedocs.io/en/stable/) documentation and 
[jsext](https://github.com/jducoeur/jsext) for how to use the JSOptionBuilder.

## Status

usable

