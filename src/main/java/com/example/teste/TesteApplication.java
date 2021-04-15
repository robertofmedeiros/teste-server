package com.example.teste;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TesteApplication {

	public static void main(String[] args) {
		System.out.println("Teste para o jenkins");
		System.out.println("Testando logs");
		System.out.println("Pausando");
		System.out.println("T1");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Continuando");
		System.out.println("Fim");
	}

}
