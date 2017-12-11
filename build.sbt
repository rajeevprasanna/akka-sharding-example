name := "akka-sharding-example"

version := "1.0"

scalaVersion := "2.12.1"

libraryDependencies += "com.typesafe.akka" %% "akka-http" % "10.0.11"
libraryDependencies += "com.typesafe.akka" %% "akka-cluster" % "2.5.8"
libraryDependencies += "com.typesafe.akka" %% "akka-stream" % "2.5.8"
libraryDependencies += "com.typesafe.akka" %% "akka-actor"  % "2.5.8"
libraryDependencies += "com.typesafe.akka" %% "akka-cluster-sharding" % "2.5.8"

val circeVersion = "0.8.0"
libraryDependencies ++= Seq(
  "io.circe" %% "circe-core",
  "io.circe" %% "circe-generic",
  "io.circe" %% "circe-parser"
).map(_ % circeVersion)

resolvers += Resolver.bintrayRepo("hseeberger", "maven")
libraryDependencies += "de.heikoseeberger" %% "akka-http-circe" % "1.18.0"

libraryDependencies += "com.typesafe.akka" %% "akka-slf4j" % "2.5.8"

libraryDependencies += "org.iq80.leveldb" % "leveldb" % "0.9"
