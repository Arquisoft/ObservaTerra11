import de.johoop.jacoco4sbt._
import JacocoPlugin._

name := "observaTerraPlay"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
  "postgresql" % "postgresql" % "8.4-702.jdbc4",
  "org.apache.poi" % "poi-ooxml" % "3.9",
  "com.google.inject" % "guice" % "3.0" % "test",
  "info.cukes" % "cucumber-guice" % "1.1.5" % "test",
  "info.cukes" % "cucumber-java" % "1.1.5" % "test",
  "info.cukes" % "cucumber-junit" % "1.1.5" % "test",
  "org.assertj" % "assertj-core" % "1.5.0" % "test",
  "org.mockito" % "mockito-all" % "1.9.5" % "test"
)     

play.Project.playJavaSettings

site.settings

jacoco.settings

unmanagedResourceDirectories in Test <+= baseDirectory( _ / "features" )