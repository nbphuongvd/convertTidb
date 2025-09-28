package vn.com.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.kafka.annotation.EnableKafka;

@EnableAutoConfiguration
@SpringBootApplication
@EnableKafka
public class ConvrtTidbApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConvrtTidbApplication.class, args);
	}

}
