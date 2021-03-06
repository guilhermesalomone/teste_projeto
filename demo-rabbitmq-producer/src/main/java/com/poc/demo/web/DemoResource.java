package com.poc.demo.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author Guilherme.Salomone
 *
 */
@RestController
@RequestMapping("/api")
public class DemoResource {

	private static final Logger log = LoggerFactory.getLogger(DemoResource.class);
	
	private final DemoProducer producer;
	
	public DemoResource(DemoProducer produtor) {
		super();
		this.producer = produtor;
	}

	@GetMapping("/send")
	public void enviarMensagem(@RequestParam String mensagem) {
		
		log.info("Sending Request {}", mensagem);
		
		producer.sendMsgCuston(mensagem);
		
	}
}
