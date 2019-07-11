package com.KafkaReader

//Consumer code to read messages using assign method.Java

import java.util
import org.apache.kafka.clients.consumer.KafkaConsumer
import java.util.Properties
import scala.collection.JavaConverters._

object ConsumerAssignApp {

  def are(args:List[String] ):Unit= {

    // Following properties are mandatory to create ConsumerConfig which is then used to create a kafka consumer
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
  }
}
