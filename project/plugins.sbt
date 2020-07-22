addSbtPlugin("io.spray" % "sbt-revolver" % "0.9.1")


// The Play plugin
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.6.16")

addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "1.0.0")

// Scala formatting: "sbt scalafmt"
addSbtPlugin("com.lucidchart" % "sbt-scalafmt" % "1.12")

addSbtPlugin("org.wartremover" % "sbt-wartremover" % "2.2.1")

addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.3.4")





resolvers += Resolver.bintrayRepo("colisweb", "sbt-plugins")
addSbtPlugin("com.colisweb.sbt" % "sbt-datadog" % "0.1.8")
