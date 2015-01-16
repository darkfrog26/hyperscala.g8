import spray.revolver.RevolverPlugin._

name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "$scalaVersion$"

seq(Revolver.settings: _*)

libraryDependencies += "org.hyperscala" %% "hyperscala-ui" % "0.9.3"

libraryDependencies += "com.outr.net" %% "outrnet-jetty" % "1.1.3"
