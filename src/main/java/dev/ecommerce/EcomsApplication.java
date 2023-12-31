package dev.ecommerce;

import dev.ecommerce.db.StaticDB;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EcomsApplication {
	public static void main(String[] args) {

		SpringApplication.run(EcomsApplication.class, args);
		StaticDB.initDB();
	}
}
