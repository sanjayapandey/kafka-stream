package com.sanjaya.kafka;

import com.sanjaya.kafka.producer.WikimediaChangesProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaStreamApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(KafkaStreamApplication.class, args);
	}

	@Autowired
	private WikimediaChangesProducer producer;

	@Override
	public void run(String... args) throws Exception {
		producer.sendMessage();
	}
}
