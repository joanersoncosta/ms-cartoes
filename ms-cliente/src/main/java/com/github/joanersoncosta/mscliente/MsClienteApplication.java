package com.github.joanersoncosta.mscliente;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;

@SpringBootApplication
@RestController
@RequestMapping("/")
@Log4j2
public class MsClienteApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsClienteApplication.class, args);
	}
	
	@GetMapping
	public String status() {
		log.info("Obtendo o sttaus do microservice de clientes");
		return "API Clientes";
	}
}