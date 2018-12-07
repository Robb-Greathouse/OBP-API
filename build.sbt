cancelable := true

developers := List( // TODO replace this with your information
  Developer("mslinn",
            "Mike Slinn",
            "mslinn@micronauticsresearch.com",
            url("https://github.com/mslinn")
  )
)

// define the statements initially evaluated when entering 'console', 'console-quick', but not 'console-project'
initialCommands in console := """
                                |""".stripMargin

javacOptions ++= Seq(
  "-Xlint:deprecation",
  "-Xlint:unchecked",
  "-source", "1.8",
  "-target", "1.8",
  "-g:vars"
)

libraryDependencies ++= Seq(
  "com.github.everit-org.json-schema" %  "org.everit.json.schema" % "1.6.1",
  "ch.qos.logback" %  "logback-classic" % "1.2.3",
  "org.scala-lang.modules" %  "scala-xml_${scala.version}" % "1.0.5",
  "net.liftweb" %  "lift-mapper_${scala.version}" % "${lift.version}",
  "net.databinder.dispatch" %  "dispatch-lift-json_${scala.version}" % "0.13.1",
  "net.databinder.dispatch" %  "dispatch-core_${scala.version}" % "0.13.1",
  "org.slf4j" %  "log4j-over-slf4j" % "1.7.25",
  "org.apache.logging.log4j" %  "log4j-api" % "${log4j.version}",
  "org.apache.logging.log4j" %  "log4j-core" % "${log4j.version}",
  "org.apache.kafka" %  "kafka-clients" % "${kafka.version}",
  "org.apache.kafka" %  "connect-json" % "${kafka.version}",
  "org.bouncycastle" %  "bcpg-jdk16" % "1.46",
  "org.postgresql" %  "postgresql" % "9.4.1211",
  "com.h2database" %  "h2" % "1.4.191" % "runtime",
  "mysql" %  "mysql-connector-java" % "6.0.6",
  "com.microsoft.sqlserver" %  "mssql-jdbc" % "6.2.0.jre8" % "test",
  "javax.servlet" %  "javax.servlet-api" % "3.1.0" % "provided",
  "junit" %  "junit" % "4.12" % "test",
  "org.scalatest" %  "scalatest_${scala.version}" % "3.0.5" % "test",
  "org.eclipse.jetty" %  "jetty-server" % "${jetty.version}" % "test",
  "org.eclipse.jetty" %  "jetty-webapp" % "${jetty.version}" % "test",
  "net.liftweb" %  "lift-mongodb_${scala.version}" % "${lift.version}",
  "net.liftweb" %  "lift-mongodb-record_${scala.version}" % "${lift.version}",
  "org.seleniumhq.selenium" %  "selenium-java" % "2.52.0",
  "org.seleniumhq.selenium" %  "selenium-htmlunit-driver" % "2.52.0",
  "org.apache.httpcomponents" %  "httpclient" % "4.5.2",
  "net.sourceforge.htmlunit" %  "htmlunit" % "2.21",
  "net.liftmodules" %  "amqp_3.1_${scala.version}" % "1.5.0",
  "org.pegdown" %  "pegdown" % "1.6.0",
  "com.jason-goodwin" %  "authentikat-jwt_${scala.version}" % "0.4.5",
  "com.tokbox" %  "opentok-server-sdk" % "3.0.0-beta.2",
  "org.elasticsearch" %  "elasticsearch" % "6.1.1",
  "com.sksamuel.elastic4s" %  "elastic4s-http_${scala.version}" % "6.1.1",
  "org.scala-lang" %  "scala-compiler" % "${scala.compiler}" % "compile",
  "org.scala-lang" %  "scala-library" % "${scala.compiler}",
  "oauth.signpost" %  "signpost-commonshttp4" % "1.2.1.2",
  "com.tesobe.obp" %  "obp-ri-core" % "${obp-ri.version}",
  "com.tesobe.obp" %  "obp-ri-kafka" % "${obp-ri.version}",
  "com.tesobe.obp" %  "obp-ri-transport" % "${obp-ri.version}",
  "com.typesafe.akka" %  "akka-actor_${scala.version}" % "${akka.version}",
  "com.typesafe.akka" %  "akka-remote_${scala.version}" % "${akka.version}",
  "com.typesafe.akka" %  "akka-stream-kafka_${scala.version}" % "${akka-streams-kafka.version}",
  "com.sksamuel.avro4s" %  "avro4s-core_${scala.version}" % "${avro.version}",
  "com.twitter" %  "chill-akka_${scala.version}" % "0.9.1",
  "com.twitter" %  "chill-bijection_${scala.version}" % "0.9.1",
  "com.github.cb372" %  "scalacache-guava_${scala.version}" % "0.9.3",
  "com.github.cb372" %  "scalacache-redis_${scala.version}" % "0.9.3",
  "com.typesafe.akka" %  "akka-slf4j_${scala.version}" % "${akka.version}",
  "com.github.dwickern" %  "scala-nameof_${scala.version}" % "1.0.3",
  "com.auth0" %  "java-jwt" % "3.3.0",
  "com.nimbusds" %  "nimbus-jose-jwt" % "4.23",
  "com.github.OpenBankProject" %  "scala-macros" % "v1.0.0-alpha.3",
  "org.scalameta" %  "scalameta_${scala.version}" % "3.7.4",
  "ai.grakn" %  "redis-mock" % "0.1.6"
  "org.scalatest"     %% "scalatest"   % "3.0.3" % Test withSources(),
  "junit"             %  "junit"       % "4.12"  % Test
)

// If you want to apply a license, such as the Apache 2 license, uncomment the following:
licenses += ("Apache-2.0", url("https://www.apache.org/licenses/LICENSE-2.0.html"))

logLevel := Level.Warn

// Only show warnings and errors on the screen for compilations.
// This applies to both test:compile and compile and is Info by default
logLevel in compile := Level.Warn

// Level.INFO is needed to see detailed output when running tests
logLevel in test := Level.Info

name := "my-new-project" // TODO provide a short yet descriptive name

organization := "com.micronautics"

resolvers ++= Seq(
)

scalacOptions ++= Seq( // From https://tpolecat.github.io/2017/04/25/scalac-flags.html
  "-deprecation",                      // Emit warning and location for usages of deprecated APIs.
  "-encoding", "utf-8",                // Specify character encoding used by source files.
  "-explaintypes",                     // Explain type errors in more detail.
  "-feature",                          // Emit warning and location for usages of features that should be imported explicitly.
  "-language:existentials",            // Existential types (besides wildcard types) can be written and inferred
  "-language:experimental.macros",     // Allow macro definition (besides implementation and application)
  "-language:higherKinds",             // Allow higher-kinded types
  "-language:implicitConversions",     // Allow definition of implicit functions called views
  "-unchecked",                        // Enable additional warnings where generated code depends on assumptions.
  "-Xcheckinit",                       // Wrap field accessors to throw an exception on uninitialized access.
  //"-Xfatal-warnings",                  // Fail the compilation if there are any warnings.
  "-Xfuture",                          // Turn on future language features.
  "-Xlint:adapted-args",               // Warn if an argument list is modified to match the receiver.
  "-Xlint:by-name-right-associative",  // By-name parameter of right associative operator.
  "-Xlint:constant",                   // Evaluation of a constant arithmetic expression results in an error.
  "-Xlint:delayedinit-select",         // Selecting member of DelayedInit.
  "-Xlint:doc-detached",               // A Scaladoc comment appears to be detached from its element.
  "-Xlint:inaccessible",               // Warn about inaccessible types in method signatures.
  "-Xlint:infer-any",                  // Warn when a type argument is inferred to be `Any`.
  "-Xlint:missing-interpolator",       // A string literal appears to be missing an interpolator id.
  "-Xlint:nullary-override",           // Warn when non-nullary `def f()' overrides nullary `def f'.
  "-Xlint:nullary-unit",               // Warn when nullary methods return Unit.
  "-Xlint:option-implicit",            // Option.apply used implicit view.
  "-Xlint:package-object-classes",     // Class or object defined in package object.
  "-Xlint:poly-implicit-overload",     // Parameterized overloaded implicit methods are not visible as view bounds.
  "-Xlint:private-shadow",             // A private field (or class parameter) shadows a superclass field.
  "-Xlint:stars-align",                // Pattern sequence wildcard must align with sequence component.
  "-Xlint:type-parameter-shadow",      // A local type parameter shadows a type already in scope.
  "-Xlint:unsound-match",              // Pattern match may not be typesafe.
  "-Yno-adapted-args",                 // Do not adapt an argument list (either by inserting () or creating a tuple) to match the receiver.
  "-Ypartial-unification",             // Enable partial unification in type constructor inference
  //"-Ywarn-dead-code",                  // Warn when dead code is identified.
  "-Ywarn-extra-implicit",             // Warn when more than one implicit parameter section is defined.
  "-Ywarn-inaccessible",               // Warn about inaccessible types in method signatures.
  "-Ywarn-infer-any",                  // Warn when a type argument is inferred to be `Any`.
  "-Ywarn-nullary-override",           // Warn when non-nullary `def f()' overrides nullary `def f'.
  "-Ywarn-nullary-unit",               // Warn when nullary methods return Unit.
  "-Ywarn-numeric-widen"               // Warn when numerics are widened.
  //"-Ywarn-unused:implicits",           // Warn if an implicit parameter is unused.
  //"-Ywarn-unused:imports",             // Warn if an import selector is not referenced.
  //"-Ywarn-unused:locals",              // Warn if a local definition is unused.
  //"-Ywarn-unused:params",              // Warn if a value parameter is unused.
  //"-Ywarn-unused:patvars",             // Warn if a variable bound in a pattern is unused.
  //"-Ywarn-unused:privates",            // Warn if a private member is unused.
  //"-Ywarn-value-discard"               // Warn when non-Unit expression results are unused.
)

// The REPL can’t cope with -Ywarn-unused:imports or -Xfatal-warnings so turn them off for the console
scalacOptions in (Compile, console) --= Seq("-Ywarn-unused:imports", "-Xfatal-warnings")

scalacOptions in (Compile, doc) ++= baseDirectory.map {
  (bd: File) => Seq[String](
     "-sourcepath", bd.getAbsolutePath, // todo replace my-new-project with the github project name, and replace mslinn with your github id
     "-doc-source-url", "https://github.com/mslinn/my-new-project/tree/master€{FILE_PATH}.scala"
  )
}.value

scalaVersion := "2.12.8"

scmInfo := Some(
  ScmInfo(  // TODO replace mslinn with your github id
    url(s"https://github.com/mslinn/$name"),
    s"git@github.com:mslinn/$name.git"
  )
)

sublimeTransitive := true

version := "0.1.0"

