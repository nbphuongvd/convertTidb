package vn.com.payment.controllers;

import java.util.HashMap;
import java.util.Hashtable;

import org.apache.avro.generic.GenericRecord;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.google.gson.Gson;

import vn.com.payment.config.AppConfig;
import vn.com.payment.gateway.database.entities.Isomessage;
import vn.com.payment.gateway.database.entities.IsomessageDto;
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
            String op = value.get("op").toString();
            System.out.println("Operation = " + op);
            if ("c".equals(op) || "u".equals(op)) {
            	GenericRecord after = (GenericRecord) value.get("after");
                if (after != null) {
                    try {
                        // Convert Avro GenericRecord -> JSON string -> POJO
                      String json = after.toString().trim();                       
                      System.out.println("=========json:  "+ json);                        
//                     // JSON -> DTO
                      ObjectMapper objectMapper = new ObjectMapper();
                      IsomessageDto isomessageDto = objectMapper.readValue(json, IsomessageDto.class);
                      // DTO -> Entity
                      ModelMapper mapperIsome = new ModelMapper();
                      Isomessage isomessage = mapperIsome.map(isomessageDto, Isomessage.class);
                        try {
                            Isomessage savedIsomessage = tblIsomessageHome.save(isomessage);
                            System.out.println(savedIsomessage.getTidbId());
//                            System.out.println("savedIsomessage: " + gson.toJson(savedIsomessage));
    					} catch (Exception e) {
    						System.out.println("Exception save Isomessage: " + e);
    						e.printStackTrace();
    					}                  
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            } else {
                System.out.println("Bỏ qua event không có after (op=" + op + ")");
            }         
        }

        System.out.println("Timestamp: " + record.timestamp());
        System.out.println("Headers: " + record.headers());
        System.out.println("========");

        log.info("listenTopicGateway Avro value: {}", value);
        
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