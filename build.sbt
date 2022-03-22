ThisBuild / version := "0.1.1"

ThisBuild / scalaVersion := "2.13.8"

lazy val root = (project in file("."))
  .settings(
    name := "math-mar"
  )

publishTo := Some("GitHub bereszit Apache Maven Packages" at "https://maven.pkg.github.com/bereszit/math-mar")
publishMavenStyle := true
credentials += Credentials(
  "GitHub Package Registry",
  "maven.pkg.github.com",
  "bereszit",
  "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"
)