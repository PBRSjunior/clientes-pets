package br.com.pets.clientespets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class ClientesPetsApplication {

	@GetMapping
	public String getHometeste( ) {
		return "Cliente Pet - API Home";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ClientesPetsApplication.class, args);
	}

}
