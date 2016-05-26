import scala.scalanative.sbtplugin.{ScalaNativePlugin, ScalaNativePluginInternal}
import ScalaNativePlugin.autoImport._

lazy val root = project.in(file(".")).
    settings (ScalaNativePlugin.projectSettings ++ Seq (
      organization := "cl.fbd",
      
      name := "scala-native-test_set_array_length",

      version      := "0.1",

      scalaVersion := "2.11.8",
    
      libraryDependencies ++= Seq (
        "org.scala-native" %% "scalalib" % "0.1-SNAPSHOT",
        "org.scala-native" %% "javalib"    % "0.1-SNAPSHOT",
        "org.scala-native" %% "clib" % "0.1-SNAPSHOT"
      ),

      nativeEmitDependencyGraphPath := Some(file("out.dot")),

      nativeVerbose := true,

      nativeClangOptions ++= Seq("-O2")
    ))
