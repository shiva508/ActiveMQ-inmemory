package com.shiva.configuration;

import javax.jms.Queue;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
@EnableJms
@Configuration
public class ActiveMqConfig {
	@Bean
	public Queue queue() {
		return new ActiveMQQueue("In-memmory-queue");
	}

}
