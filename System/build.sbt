name := """System"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  "mysql" % "mysql-connector-java" % "5.1.26",
  "commons-io" % "commons-io" % "2.4",
  javaEbean,
  cache,
  javaWs
)


fork in run := true