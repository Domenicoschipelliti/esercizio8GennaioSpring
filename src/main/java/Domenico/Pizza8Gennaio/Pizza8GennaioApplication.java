package Domenico.Pizza8Gennaio;

import Domenico.Pizza8Gennaio.enteties.Bevande;
import Domenico.Pizza8Gennaio.enteties.Menu;
import Domenico.Pizza8Gennaio.enteties.Pizze;
import Domenico.Pizza8Gennaio.enteties.Toppings;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class Pizza8GennaioApplication   {
//Grazie a lombok possiamo compattare una classe da 15 righe a 3-4 di codice grazie alle annotazioni,provare per credere
	public static void main(String[] args) {
		SpringApplication.run(Pizza8GennaioApplication.class, args);
	}

}
