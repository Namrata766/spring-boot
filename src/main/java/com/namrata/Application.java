package com.namrata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author NAMRATA
 *
 */
@RestController
@SpringBootApplication
public class Application {
	
	@Autowired
	private String message;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return
	 */
	@RequestMapping("/")
	public String home() {
		return "Hello World! " + getMessage();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
	}
}
