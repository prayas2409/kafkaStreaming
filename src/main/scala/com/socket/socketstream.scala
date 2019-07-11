package com.socket

import java.util
import java.util.Properties

import org.apache.kafka.clients.consumer.KafkaConsumer

import scala.collection.JavaConverters._

object socketstream {

  def main(args: Array[String]): Unit = {

//    val config = new SparkConf()
//      .setAppName("Streaming text")
//      .setMaster("local[*]")
//      .set("spark.driver.allowMultipleContexts", "true")

//    val spark = SparkSession.builder().appName("Socket Streaming").master("local[*]").getOrCreate()
//
//    val ssc = new StreamingContext(spark.sparkContext,Seconds(5))
//    val data = ssc.socketTextStream("localhost",9014)
//
//
//    val words = data.flatMap(_.split(" ")).map(w => (w,1)).reduceByKey(_+_)
//    val returned = data.foreachRDD(_.pipe("/home/admin1/IdeaProjects/socketstreaming/src/main/python/Predictor.py"))
//    print(returned.getClass())
//    println(returned.toString)

//    println(data.getClass)
//    println(data.toString.lines().getClass)
//    val market_data = data.flatMap(_.split("/"))
//
//    print(market_data)
////    Seq(market_data).toList.foreach(println)
//    val mark = spark.sparkContext.makeRDD(Seq(market_data))
//    mark.collect().foreach(print)
//    val pred = mark.pipe("/home/admin1/IdeaProjects/socketstreaming/src/main/python/Predictor.py")
//    pred.collect().foreach(println)
val properties = new Properties();
    properties.put("bootstrap.servers", "localhost:9093"); // specify more than one to provide fallback broker access.
    properties.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
    properties.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
    properties.put("group.id", "group1");
    //    val firstTopicPartition = new TopicPartition("kafka-training", 0);
    //    val secondTopicPartition = new TopicPartition("kafka-training-2", 2);
    val topic = "raw-data-1"

    val consumer: KafkaConsumer[String, String] = new KafkaConsumer[String, String](properties)
    consumer.subscribe(util.Arrays.asList(topic))
    while (true) {
      val record = consumer.poll(1000).asScala

      for (data <- record.iterator) println(data.value())
    }
//    ssc.start()
//    ssc.awaitTermination()
  }
}
