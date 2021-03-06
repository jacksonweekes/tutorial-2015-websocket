name := "chirper"

version := "1.0"

scalaVersion := "2.11.6"

lazy val root = (project in file(".")).enablePlugins(PlayJava, SbtWeb)

libraryDependencies ++= Seq(
  "org.mindrot" % "jbcrypt" % "0.3m"
)

pipelineStages := Seq(rjs)
