import Dependencies._

scalaVersion in ThisBuild := "2.11.7"

resolvers in ThisBuild += "clojars" at "https://clojars.org/repo"
resolvers in ThisBuild += "conjars" at "http://conjars.org/repo"
resolvers in ThisBuild += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"
resolvers in ThisBuild += "Twitter Maven Repo" at "http://maven.twttr.com"

lazy val core = (project in file("core"))
		.settings(Commons.settings: _*)
		.settings(
			libraryDependencies ++= commonDependencies
		)

lazy val application = (project in file("application")).
	settings(Commons.settings: _*)
	.settings(
		libraryDependencies ++= applicationDependencies
	)
	.settings(
		assemblyMergeStrategy in assembly := {
			case PathList("META-INF", xs @ _*) => MergeStrategy.discard
			case x =>
				val oldStrategy = (assemblyMergeStrategy in assembly).value
				oldStrategy(x)
		}
	)
	.dependsOn(core)

