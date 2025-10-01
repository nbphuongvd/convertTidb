package vn.com.payment.controllers;

import java.util.HashMap;
import java.util.Hashtable;

import org.apache.avro.generic.GenericRecord;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import vn.com.payment.config.AppConfig;
import vn.com.payment.gateway.database.entities.Isomessage;
import vn.com.payment.gateway.database.home.TblIsomessageHome;
@Component
public class KafkaAwaitilityListener {

	private static final Logger log = LoggerFactory.getLogger(KafkaAwaitilityListener.class);
	private static final ObjectMapper mapper = new ObjectMapper();
	private Gson gson = new Gson();

	@Autowired
	public AppConfig appConfig;
	
	@Autowired
	private TblIsomessageHome tblIsomessageHome;
	// lắng nghe dữ liệu từ gateway
//	@KafkaListener(topics = "#{'${app.topicGateway}'}", groupId = "#{'${app.groupIDGateway}'}")
//	public void listenTopicGateway(ConsumerRecord<String, String> record) {
//		System.out.println("===================================================================================================");
//		log.info("listenTopicGateway data : " + record);
//		System.out.println("========");
//		System.out.println("Received record: " + record);
//		System.out.println("Topic: " + record.topic());
//		System.out.println("Partition: " + record.partition());
//		System.out.println("Offset: " + record.offset());
//		System.out.println("Key: " + record.key());
//		System.out.println("Value: " + record.value());
//		System.out.println("Timestamp: " + record.timestamp());
//		System.out.println("Headers: " + record.headers());
//		System.out.println("========");
//		log.info("listenTopicGateway record.value(): " + record.value());
////    	Thread threadGW = new Thread(new ThreadListenGW(record.value()));
//////    	threadGW.start();
////    	/*Thangtc 11/4: Them xu ly thread Pool*/
////    	ThreadPoolManager.shareInstance().excute(threadGW);
//	}
	@KafkaListener(topics = "#{'${app.topicGateway}'}", groupId = "#{'${app.groupIDGateway}'}")
	public void listenTopicGateway(ConsumerRecord<String, GenericRecord> record) {
        System.out.println("===================================================================================================");
        log.info("listenTopicGateway data : {}", record);

        System.out.println("========");
        System.out.println("Received record: " + record);
        System.out.println("Topic: " + record.topic());
        System.out.println("Partition: " + record.partition());
        System.out.println("Offset: " + record.offset());
        System.out.println("Key: " + record.key());

        GenericRecord value = record.value();
        if (value != null) {
            System.out.println("Value (full Avro JSON): " + value);

            GenericRecord after = (GenericRecord) value.get("after");
            if (after != null) {
                try {
                    // Convert Avro GenericRecord -> JSON string -> POJO
                    String json = after.toString();
                    Isomessage isomessage = mapper.readValue(json, Isomessage.class);
                    System.out.println("Mapped DTO = " + isomessage);
                    System.out.println("Mapped DTO = " + gson.toJson(isomessage));
                    try {
                        Isomessage savedIsomessage = tblIsomessageHome.save(isomessage);
                        System.out.println("savedIsomessage: " + gson.toJson(savedIsomessage));
					} catch (Exception e) {
						System.out.println("Exception save Isomessage: " + e);
						e.printStackTrace();
					}                  
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println("Timestamp: " + record.timestamp());
        System.out.println("Headers: " + record.headers());
        System.out.println("========");

        log.info("listenTopicGateway Avro value: {}", value);

        // Nếu bạn cần xử lý bằng thread pool
        // Thread threadGW = new Thread(new ThreadListenGW(value.toString()));
        // ThreadPoolManager.shareInstance().excute(threadGW);
        
     // Ngủ 1 tiếng
        System.out.println("Consumer sẽ nghỉ 1 tiếng...");
        try {
			Thread.sleep(60 * 60 * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
	
}