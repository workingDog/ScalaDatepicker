
enablePlugins(ScalaJSPlugin)

name := "scaladatepicker"

organization := "com.github.workingDog"

version := (version in ThisBuild).value

scalaJSStage in Global := FullOptStage // FastOptStage //

scalaVersion := "2.11.8"

crossScalaVersions := Seq("2.11.8")

libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "0.9.1",
  "be.doeraene" %%% "scalajs-jquery" % "0.9.0",
  "org.webjars" % "bootstrap" % "4.0.0-alpha.3" exclude("org.webjars", "jquery"),
  "org.webjars" % "jquery" % "3.1.0",
  "org.webjars" % "font-awesome" % "4.6.3",
  "org.webjars.bower" % "bootstrap-datepicker" % "1.6.4",
  "org.webjars.bower" % "momentjs" % "2.15.1",
  "org.webjars" % "material-ui" % "0.15.1",
  "org.webjars.bower" % "tether" % "1.3.3",
  "org.querki" %%% "querki-jsext" % "0.7"
)

jsDependencies += RuntimeDOM

skip in packageJSDependencies := false

homepage := Some(url("https://github.com/workingDog/ScalaDatepicker"))

licenses := Seq("Apache 2" -> url("http://www.apache.org/licenses/LICENSE-2.0"))

scalacOptions ++= Seq(
  "-deprecation", // Emit warning and location for usages of deprecated APIs.
  "-feature", // Emit warning and location for usages of features that should be imported explicitly.
  "-unchecked", // Enable additional warnings where generated code depends on assumptions.
  "-Xlint" // Enable recommended additional warnings.
)

scalaJSUseRhino in Global := false