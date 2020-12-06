ThisBuild / organization := "$organization$"

ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / licenses := Seq("MIT License" -> url("https://opensource.org/licenses/MIT"))

ThisBuild / scalaVersion := "2.12.12"

ThisBuild / scalacOptions := Seq(
  "-deprecation",                   // Emit warning and location for usages of deprecated APIs.
  "-encoding", "utf-8",             // Specify character encoding used by source files.
  "-explaintypes",                  // Explain type errors in more detail.
  "-feature",                       // Emit warning and location for usages of features that should be imported explicitly.
  "-language:existentials",         // Existential types (besides wildcard types) can be written and inferred.
  "-language:higherKinds",          // Allow higher-kinded types.
  "-language:implicitConversions",  // Allow definition of implicit functions called views.
  "-Xcheckinit",                    // Wrap field accessors to throw an exception on uninitialized access.
  "-Xlint:adapted-args",            // Warn if an argument list is modified to match the receiver.
  "-Xlint:nullary-unit",            // Warn when nullary methods return Unit.
  "-Xlint:inaccessible",            // Warn about inaccessible types in method signatures.
  "-Xlint:infer-any",               // Warn when a type argument is inferred to be Any.
  "-Xlint:missing-interpolator",    // A string literal appears to be missing an interpolator id.
  "-Xlint:doc-detached",            // A Scaladoc comment appears to be detached from its element.
  "-Xlint:private-shadow",          // A private field (or class parameter) shadows a superclass field.
  "-Xlint:type-parameter-shadow",   // A local type parameter shadows a type already in scope.
  "-Xlint:poly-implicit-overload",  // Parameterized overloaded implicit methods are not visible as view bounds.
  "-Xlint:option-implicit",         // Option.apply used implicit view.
  "-Xlint:delayedinit-select",      // Selecting member of DelayedInit.
  "-Xlint:package-object-classes",  // Class or object defined in package object.
  "-Xlint:stars-align",             // Pattern sequence wildcard must align with sequence component.
  "-Xlint:constant",                // Evaluation of a constant arithmetic expression results in an error.
  "-Xlint:unused",                  // Enable -Wunused:imports,privates,locals,implicits.
  "-Ywarn-dead-code",               // Warn when dead code is identified.
  "-Ywarn-extra-implicit",          // Warn when more than one implicit parameter section is defined.
  "-Ywarn-numeric-widen"            // Warn when numerics are widened.
)

publish / skip := true
publishMavenStyle := true

credentials += publishSettings.credentials

publishTo := publishSettings.publishTo

lazy val plugin = (project in file("plugin"))
  .enablePlugins(SbtPlugin)
  .settings(
    name := "$project_name$"
  )
