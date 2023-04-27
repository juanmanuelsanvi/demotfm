package com.jsv.tfmdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.jsv.tfmdemo.modelo.*;

@SpringBootApplication
public class TfmDemoApplication {

	public static void main(String[] args) {
		Grafo g1;
		g1 = new Grafo();
		
		SpringApplication.run(TfmDemoApplication.class, args);
		

	}

}
