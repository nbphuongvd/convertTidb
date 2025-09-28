package vn.com.payment.controllers;

import java.util.HashMap;
import java.util.Hashtable;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import vn.com.payment.config.AppConfig;
@Component
public class KafkaAwaitilityListener {

	private static final Logger log = LoggerFactory.getLogger(KafkaAwaitilityListener.class);
	@Autowired
	public AppConfig appConfig;
	// lắng nghe dữ liệu từ gateway
	@KafkaListener(topics = "#{'${app.topicGateway}'}", groupId = "#{'${app.groupIDGateway}'}")
	public void listenTopicGateway(ConsumerRecord<String, String> record) {
		System.out.println("===================================================================================================");
		log.info("listenTopicGateway data : " + record);
		System.out.println("========");
		System.out.println("Received record: " + record);
		System.out.println("Topic: " + record.topic());
		System.out.println("Partition: " + record.partition());
		System.out.println("Offset: " + record.offset());
		System.out.println("Key: " + record.key());
		System.out.println("Value: " + record.value());
		System.out.println("Timestamp: " + record.timestamp());
		System.out.println("Headers: " + record.headers());
		System.out.println("========");
		log.info("listenTopicGateway record.value(): " + record.value());
//    	Thread threadGW = new Thread(new ThreadListenGW(record.value()));
////    	threadGW.start();
//    	/*Thangtc 11/4: Them xu ly thread Pool*/
//    	ThreadPoolManager.shareInstance().excute(threadGW);
	}
}