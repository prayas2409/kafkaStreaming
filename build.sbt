name := "socketstreaming"

version := "0.1"

scalaVersion := "2.11.12"

libraryDependencies += "org.apache.spark" %% "spark-streaming" % "2.4.3"

// https://mvnrepository.com/artifact/org.apache.spark/spark-sql
libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.2.1"

// https://mvnrepository.com/artifact/org.apache.spark/spark-core
libraryDependencies += "org.apache.spark" %% "spark-core" % "2.2.1"
//
//// https://mvnrepository.com/artifact/org.apache.kafka/kafka
//libraryDependencies += "org.apache.kafka" %% "kafka" % "2.2.1"

// https://mvnrepository.com/artifact/org.apache.kafka/kafka-clients
//libraryDependencies += "org.apache.kafka" % "kafka-clients" % "2.2.1"

////// https://mvnrepository.com/artifact/org.apache.kafka/kafka-streams
////libraryDependencies += "org.apache.kafka" % "kafka-streams" % "2.2.1"
//
//// https://mvnrepository.com/artifact/org.apache.kafka/connect-api
//libraryDependencies += "org.apache.kafka" % "connect-api" % "2.1.1"
//
//// https://mvnrepository.com/artifact/org.apache.kafka/connect-file
//libraryDependencies += "org.apache.kafka" % "connect-file" % "2.2.1"
//
//// https://mvnrepository.com/artifact/org.apache.kafka/kafka-streams-scala
//libraryDependencies += "org.apache.kafka" %% "kafka-streams-scala" % "2.2.1"

//// https://mvnrepository.com/artifact/org.apache.spark/spark-streaming-kafka
//libraryDependencies += "org.apache.spark" %% "spark-streaming-kafka-0-8_2.11" % "2.1.0"
//
//libraryDependencies ++= {
//  Seq(
//    "org.apache.kafka" %% "kafka" % "0.8.2.2",
//    "org.apache.kafka" % "kafka-clients" % "0.8.2.2",
//  )
//}
libraryDependencies ++= Seq(
  "org.apache.kafka" % "kafka_2.11" % "0.10.0.0"
)

// https://mvnrepository.com/artifact/org.apache.spark/spark-streaming-kafka-0-10
libraryDependencies += "org.apache.spark" %% "spark-streaming-kafka-0-10" % "2.4.3"

