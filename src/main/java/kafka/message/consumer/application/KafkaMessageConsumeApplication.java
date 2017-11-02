package kafka.message.consumer.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class })
@ComponentScan({ "com.tgt" })
@PropertySource({ "classpath:config/kafka.${env}.properties" })

public class KafkaMessageConsumeApplication {

  public static void main(String[] args) {
    SpringApplication.run(KafkaMessageConsumeApplication.class, args);
  }

}
