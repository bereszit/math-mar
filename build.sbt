ThisBuild / version := "0.1.3"

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
