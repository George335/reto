package com.example.reto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@ComponentScan("com.example.reto.model")
//@ComponentScan({"com.example.reto.repository"})
//@EntityScan({"com.example.reto.model.Cambios","com.example.reto.model.Divisas"})
//@EnableJpaRepositories(basePackages = "com.example.reto.repository")
//@ComponentScan({"controller", "repository"})
@SpringBootApplication
@EntityScan({"com.example.reto.model"})
public class RetoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RetoApplication.class, args);
	}

}
