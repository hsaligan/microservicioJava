package com.gfi.microservicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//RestController define microservicio Rest
@SpringBootApplication
@RestController 
public class MicroservicioApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioApplication.class, args);
	}
	//La notación RequestMapping relaciona una petiición HTTP
	//con el método Saludo()
	@RequestMapping("main")
	public String Saludo() {
		return "Hola mundo";
		
	}

}
