name := "akka-quickstart-scala"

version := "1.0"

scalaVersion := "2.12.6"

lazy val akkaVersion = "2.6.0-M2"

lazy val root = (project in file("."))
  .configs(IntegrationTest)
  .settings(Defaults.itSettings)
  .enablePlugins(DatadogAPM)

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-testkit" % akkaVersion,
  "org.scalatest" %% "scalatest" % "3.0.5" % "test"
)


//DataDog APM
datadogApmVersion := "0.30.0"
datadogServiceName := "AkkaQuickStart"
datadogAgentPort := 8126
datadogEnableDebug := true
datadogAgentHost := "127.0.0.1"
datadogEnv := "staging"
