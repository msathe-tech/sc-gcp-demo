package com.example.scgcpdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gcp.data.datastore.repository.config.EnableDatastoreRepositories;

@SpringBootApplication
public class ScGcpDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScGcpDemoApplication.class, args);
	}
}
