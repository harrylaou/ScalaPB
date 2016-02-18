name := "ScalaPB"

version := "1.0"

scalaVersion := "2.11.7"


import com.trueaccord.scalapb.{ScalaPbPlugin => PB}

PB.protobufSettings

//PB.grpc := false

lazy val root = (project in file(".")).enablePlugins(PlayScala)

sourceDirectory  in PB.protobufConfig :=  (sourceDirectory in Compile).value / "protobuf"

libraryDependencies ++= Seq(ws)

val myTask = TaskKey[Unit]("myTask","myTask")
myTask:= {
  println("sum: " + (sourceDirectory in Compile).value)
}
