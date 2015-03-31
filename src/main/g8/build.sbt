import spray.revolver.RevolverPlugin._

name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "$scalaVersion$"

seq(Revolver.settings: _*)

libraryDependencies += "org.hyperscala" %% "hyperscala-ui" % "$hyperscalaVersion$"

libraryDependencies += "com.outr.net" %% "outrnet-jetty" % "1.1.4"
