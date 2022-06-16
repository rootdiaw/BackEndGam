package com.example.gam;

import com.example.gam.services.AllOptionService;
import com.example.gam.services.NatureInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GamApplication {
	//@Autowired
	//private AllOptionService allOptionService;

//	@Autowired
	//private NatureInfoService natureInfoService;

	public static void main(String[] args) {
		SpringApplication.run(GamApplication.class, args);
	}


	/*@Override
	public void run(String... args) throws Exception {

		System.out.println("my alioune badara===="+allOptionService.getAllOption());

	}*/
}
