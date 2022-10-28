package com.mercadolibre.examen.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	// @Bean(name="entityManagerFactory")
	// public LocalSessionFactoryBean sessionFactory() {
	// 	LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
	// 	return sessionFactory;
	// }

}
