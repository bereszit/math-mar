ThisBuild / version := "0.1.1"

ThisBuild / scalaVersion := "2.13.8"

lazy val root = (project in file("."))
  .settings(
    name := "math-mar"
  )
updateOptions := updateOptions.value.withGigahorse(false)
publishTo := Some("GitHub bereszit Apache Maven Packages" at "https://maven.pkg.github.com/bereszit/math-mar")
publishMavenStyle := true
credentials += Credentials(
  "GitHub Package Registry",
  "maven.pkg.github.com",
  "bereszit",
  "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"
)
