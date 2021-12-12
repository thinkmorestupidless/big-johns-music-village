lazy val root = (project in file("."))
  .enablePlugins(PlayScala)
  .settings(
    name := """big-johns-music-village""",
    version := "2.8.x",
    scalaVersion := "2.13.6",
    libraryDependencies ++= Seq(
      "com.softwaremill.macwire" %% "macros" % "2.3.3" % "provided",
      "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test
    ),
    scalacOptions ++= Seq(
      "-feature",
      "-deprecation",
      "-Xfatal-warnings"
    ),
    javaOptions in Universal ++= Seq(
      // JVM memory tuning
      "-J-Xmx1024m",
      "-J-Xms512m"
    ),
    dockerExposedPorts := Seq(8080, 8080),
    dockerEntrypoint := Seq(""),
    dockerBaseImage := "openjdk:11.0.6-jre-slim",
    dockerEntrypoint := Seq("/opt/docker/bin/big-johns-music-village", "-Dplay.server.pidfile.path=/dev/null", "-Dconfig.resource=application.prod.conf")
  )
