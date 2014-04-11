import de.johoop.jacoco4sbt._
import JacocoPlugin._

name := "ejemploPlay"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
  "org.apache.poi" % "poi-ooxml" % "3.9",
  "info.cukes" % "cucumber-java" % "1.1.5" % "test",
  "info.cukes" % "cucumber-junit" % "1.1.5" % "test",
  "org.assertj" % "assertj-core" % "1.5.0" % "test"
)     

play.Project.playJavaSettings

site.settings

jacoco.settings

unmanagedResourceDirectories in Test <+= baseDirectory( _ / "features" )