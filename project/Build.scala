import sbt._
import Keys._
import play.Play.autoImport._
import PlayKeys._

object Build extends Build {

  val appName = "DVLAApp"
  val appVersion = "1.0"

  val scalaVersion = "2.11.7"

  val appDependencies = Seq(

  )

  val main = Project(appName, file(".")).enablePlugins(play.PlayScala).settings(
    version := appVersion,
    libraryDependencies ++= appDependencies
  )
}
