import spray.revolver.RevolverPlugin._

name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "$scalaVersion$"

seq(Revolver.settings: _*)

libraryDependencies += "org.hyperscala" %% "hyperscala-ui" % "0.9.2"

libraryDependencies += "com.outr.net" %% "outrnet-jetty" % "1.1.2"
