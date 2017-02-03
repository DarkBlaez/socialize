// Comment to get more information during initialization
logLevel := Level.Info

// Plugins
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.4.3")

addSbtPlugin("com.typesafe.sbt" % "sbt-digest" % "1.0.0")

addSbtPlugin("com.typesafe.sbt" % "sbt-gzip" % "1.0.0")

addSbtPlugin("com.typesafe.sbt" % "sbt-twirl" % "1.1.1")

addSbtPlugin("com.typesafe.sbt" % "sbt-web" % "1.2.0")

addSbtPlugin("com.vmunier" % "sbt-play-scalajs" % "0.2.8")

addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.14")

// Resolvers
resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

resolvers += Resolver.url("scala-js-snapshots", url("http://repo.scala-js.org/repo/snapshots/"))(Resolver.ivyStylePatterns)
