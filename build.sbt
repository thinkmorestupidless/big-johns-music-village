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
    )
  )
