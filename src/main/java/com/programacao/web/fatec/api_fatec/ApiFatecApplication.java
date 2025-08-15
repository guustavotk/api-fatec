
package com.programacao.web.fatec.api_fatec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ApiFatecApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiFatecApplication.class, args);
	}
	@GetMapping("/Hello")
	public String Hello (){
		return "API esta rodando";
	}

}
