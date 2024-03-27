lazy val commonSettingsJava = Seq(
  crossPaths := false,
  autoScalaLibrary := false,
  EclipseKeys.withBundledScalaContainers := false,
  EclipseKeys.executionEnvironment := Some(EclipseExecutionEnvironment.JavaSE18),
  EclipseKeys.projectFlavor := EclipseProjectFlavor.Java,
  EclipseKeys.withSource := true,
  EclipseKeys.jdtMode := EclipseJDTMode.Overwrite,
  Compile / EclipseKeys.eclipseOutput := Some("target/javals/classes"),
  Test / EclipseKeys.eclipseOutput := Some("target/javals/test-classes"),
  bloopAggregateSourceDependencies := true,
  bloopExportJarClassifiers := Some(Set("sources"))
)

lazy val root = (project
  .in(file(".")))
  .settings(commonSettingsJava)
