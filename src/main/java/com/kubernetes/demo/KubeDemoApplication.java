package com.kubernetes.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
@RestController
public class KubeDemoApplication {

	@GetMapping(path = "/",produces = "application/json")
	public String getServerDetails(){
		String serverDetails;
		try {
			serverDetails = "{ \"Container Id\":\""+ InetAddress.getLocalHost().getHostName() + "\",\"Container IP\":\""+InetAddress.getLocalHost().getHostAddress()+"\"}";
			return serverDetails;
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) {
		SpringApplication.run(KubeDemoApplication.class, args);
	}

}
