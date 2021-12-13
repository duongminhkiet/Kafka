package com.zmk.kafka.app3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class Kafka2MultiConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Kafka2MultiConsumerApplication.class, args);
	}

}
