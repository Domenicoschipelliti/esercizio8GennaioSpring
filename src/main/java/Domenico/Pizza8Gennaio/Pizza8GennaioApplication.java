package Domenico.Pizza8Gennaio;

import Domenico.Pizza8Gennaio.enteties.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Pizza8GennaioApplication {

	public static void main(String[] args) {
		SpringApplication.run(Pizza8GennaioApplication.class, args);
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(Pizza8GennaioApplication.class);
		Menu m= (Menu) ctx.getBean("menu");
		System.out.println(m);
		m.rispostaOrdine();
	}

}
