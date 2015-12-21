import sbt._

object Dependencies {

  val scaldingVersion = "0.15.0"
	val scaldingCore = "com.twitter" %%  "scalding-core" % scaldingVersion
//	val scaldingCommons = "com.twitter" %%  "scalding-commons" % scaldingVersion
	val hadoopClient   = "org.apache.hadoop" % "hadoop-client" % "2.2.0" % "provided"
	val hadoopCommon = "org.apache.hadoop" % "hadoop-common" % "2.6.0" % "provided"

	val scaldingTap = "io.scalding" %% "scalding-taps" % "0.2"

	val commonDependencies: Seq[ModuleID] = Seq(
		scaldingCore
				exclude("com.esotericsoftware.minlog", "minlog"),
//		scaldingCommons
//			exclude("org.mortbay.jetty", "jsp-2.1")
//			exclude("org.mortbay.jetty", "jsp-api-2.1")
//			exclude("commons-beanutils", "commons-beanutils")
//			exclude("commons-beanutils", "commons-beanutils-core"),
		hadoopClient,
		hadoopCommon
	)

	val applicationDependencies: Seq[ModuleID] = Seq(
		hadoopClient // need to include this again because it's "provided"
	)
}