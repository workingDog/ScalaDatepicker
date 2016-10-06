# Scala.js interface to bootstrap-datepicker

This library **ScalaDatepicker** is a Scala interface to the [bootstrap-datepicker](https://github.com/eternicode/bootstrap-datepicker).

@eternicode bootstrap-datepicker is a nice bootstrap datepicker, it is one of a few datepicker that allows multi-dates to be selected.

## References
 
1) [@eternicode datepicker for @twitter bootstrap](https://github.com/eternicode/bootstrap-datepicker)

## Dependencies

See the build.sbt file.

## Compiling and installation 

To compile and generate a javascript file from the source code:

    sbt fullOptJS 

The javascript file (scaladatepicker-opt.js) will be in the "./target/scala-2.11" directory.

To publish it to your local (Ivy) repository, simply type:

    sbt publishLocal
    
Then put this in your build.sbt file

    libraryDependencies += "com.github.workingDog" %%% "scaladatepicker" % "1.0"

## Documentations

Refer to the original [bootstrap-datepicker](https://bootstrap-datepicker.readthedocs.io/en/stable/) documentation.

## Status

usable

