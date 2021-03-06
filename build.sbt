
enablePlugins(ScalaJSPlugin)

name := "scaladatepicker"

organization := "com.github.workingDog"

version := (version in ThisBuild).value

scalaJSStage in Global := FullOptStage // FastOptStage //

scalaVersion := "2.12.2"

crossScalaVersions := Seq("2.12.2")

libraryDependencies += "be.doeraene" %%% "scalajs-jquery" % "0.9.1"

skip in packageJSDependencies := false

homepage := Some(url("https://github.com/workingDog/ScalaDatepicker"))

licenses := Seq("Apache 2" -> url("http://www.apache.org/licenses/LICENSE-2.0"))

scalacOptions ++= Seq(
  "-deprecation", // Emit warning and location for usages of deprecated APIs.
  "-feature", // Emit warning and location for usages of features that should be imported explicitly.
  "-unchecked", // Enable additional warnings where generated code depends on assumptions.
  "-Xlint" // Enable recommended additional warnings.
)
