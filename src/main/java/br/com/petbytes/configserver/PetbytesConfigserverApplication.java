package br.com.petbytes.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class PetbytesConfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetbytesConfigserverApplication.class, args);
	}

}
