package vn.com.payment.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter
@ConfigurationProperties(prefix = "app")

public class AppConfig {

	@Autowired
	public Environment environment;

	public String userAu;
	public String passAu;

	public String privatekey;
	public String publickey;
	public String expiration;

	public String topicGateway;
	public String groupIDGateway;
	public String topicConnector;
	public String groupIDConnector;
	public String topicCache;
	public String groupIDCache;
	public String kafkaTopicConfig;

}