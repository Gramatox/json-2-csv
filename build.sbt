import scalariform.formatter.preferences._

name := "json2CsvStream"

jarName in assembly := "jsonToCsv.jar"

version := "0.1-SNAPSHOT"

scalaVersion := "2.11.4"

scalacOptions := Seq(
  "-unchecked",
  "-deprecation",
  "-target:jvm-1.7",
  "-encoding", "UTF-8",
  "-Ywarn-dead-code",
  "-language:implicitConversions",
  "-language:postfixOps",
  "-feature",
  "-Ywarn-unused-import"
)

fork in Test := true

scalariformSettings

ScalariformKeys.preferences := ScalariformKeys.preferences.value
  .setPreference(AlignSingleLineCaseStatements, true)
  .setPreference(AlignSingleLineCaseStatements.MaxArrowIndent, 100)
  .setPreference(AlignParameters, true)
  .setPreference(DoubleIndentClassDeclaration, true)
  .setPreference(PreserveDanglingCloseParenthesis, true)
  .setPreference(RewriteArrowSymbols, true)

libraryDependencies ++= {
  val commonsIoV = "2.4"
  val scalaTestV = "2.2.2"
  val jawnV      = "0.7.0"
  val scalaCsvV  = "1.1.1"
  Seq(
     "commons-io"           % "commons-io" % commonsIoV
    ,"org.spire-math"       %% "jawn-ast"  % jawnV
    ,"com.github.tototoshi" %% "scala-csv" % scalaCsvV
    ,"org.scalatest"        %% "scalatest" % scalaTestV % "test"
  )
}
