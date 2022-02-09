package br.com.tcs.polpay.api.core.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import br.com.tcs.polpay.api.infrastructure.repositories.UserMongoRepository;

@SpringBootApplication
(exclude = {DataSourceAutoConfiguration.class}, scanBasePackages = "br.com.tcs.polpay.api.*.*")
public class PolPayApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PolPayApiApplication.class, args);
	}
	
}
