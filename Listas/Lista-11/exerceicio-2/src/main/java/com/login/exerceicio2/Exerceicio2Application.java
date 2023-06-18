package com.login.exerceicio2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@SpringBootApplication
@RestController
@RequestMapping("/user")
public class Exerceicio2Application {
	@GetMapping("/{nome")
	public boolean ehAdmin(@PathVariable String nome){
		if (nome.equals("admin")) {
			return true;
		}
		else {
			return  false;
		}
	}


	public static void main(String[] args) {
		SpringApplication.run(Exerceicio2Application.class, args);
	}

}
