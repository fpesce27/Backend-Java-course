package com.proyecto.main;

import com.proyecto.main.api.service.PrecioDolar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.util.Properties;

@SpringBootApplication
public class MainApplication {

	public MainApplication() throws IOException {
	}

	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
	}
}
