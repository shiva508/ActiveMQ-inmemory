package com.shiva.controller;

import javax.jms.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {
	@Autowired
	private Queue queue;
	@Autowired
	private JmsTemplate jmsTemplate;

	@GetMapping("/message/{message}")
	public String send(@PathVariable("message") String message) {
		jmsTemplate.convertAndSend(queue, message);
		return "produced";
	}
}
