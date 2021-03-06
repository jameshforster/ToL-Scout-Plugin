import Dependencies._
import sbt.Keys._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.12.1",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "ToL-Scout-Plugin",
    libraryDependencies ++= Seq(sponge, apacheHttpCore, apacheHttpClient, jacksonCore, jacksonAnnotations, jacksonDatabind),
    libraryDependencies ++= Seq(scalaTest % "test", mockito % "test"),
    resolvers += "SpongePowered" at "https://repo.spongepowered.org/maven/",
    coverageEnabled := true,
    coverageMinimum := 100,
    coverageFailOnMinimum := true,
    coverageExcludedPackages := "plugin.ScoutPlugin.*; config.*"
  )
