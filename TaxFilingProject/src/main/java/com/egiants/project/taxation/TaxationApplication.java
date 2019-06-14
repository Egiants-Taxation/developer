package com.egiants.project.taxation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication
public class TaxationApplication {

	@RequestMapping("/")
    String home() {
        return "Taxation Project Dummy URL to Just Run the Project";
    }
	
	public static void main(String[] args) throws Exception{
		SpringApplication.run(TaxationApplication.class, args);
	}

}
