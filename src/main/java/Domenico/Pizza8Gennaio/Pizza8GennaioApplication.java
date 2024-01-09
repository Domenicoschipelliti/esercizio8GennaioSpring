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
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(Pizza8GennaioApplication.class);


		Pizze m= (Pizze) ctx.getBean("pizze");

		Toppings me=(Toppings) ctx.getBean("toppings");

		Bevande menu=(Bevande) ctx.getBean("bevande");
		System.out.println(">--------------MENU---------------<");

		System.out.println(">--------------PIZZE---------------<");
		System.out.println(m);
		System.out.println(">--------------AGGIUNTE---------------<");
		System.out.println(me);
		System.out.println(">--------------BEVANDE---------------<");
		System.out.println(menu);

		System.out.println("Cosa vuole prendere?");
		Scanner scanner=new Scanner(System.in);

		String scelta= scanner.nextLine();


		if (scelta.equals("pizza margherita")){
			Pizze p=(Pizze) ctx.getBean("pizzaMargherita");
			System.out.println(p);
		} else if (scelta.equals("pizza hawaiana")) {
			Pizze pi=(Pizze) ctx.getBean("pizzaHawaiana");
			System.out.println(pi);
		} else if (scelta.equals("pizza con salame")) {
			Pizze piz=(Pizze) ctx.getBean("pizzaSalame");
			System.out.println(piz);
		}
		System.out.println("vuole aggiungere qualcosa alla pizza?");


			String sce=scanner.nextLine();
			if (sce.equals("formaggio")){
				Toppings toppings=(Toppings) ctx.getBean("formaggio");
				System.out.println("ok "+toppings);
			}
			if (sce.equals("prosciutto")){
				Toppings top=(Toppings) ctx.getBean("prosciutto");
				System.out.println("ok "+top);
			}
			if (sce.equals("cipolla")){
				Toppings topp=(Toppings) ctx.getBean("cipolla");
				System.out.println("ok "+topp);
			}
			if (sce.equals("ananas")){
                Toppings toopi=(Toppings) ctx.getBean("ananas");
				System.out.println("ok "+toopi);
			}
			if (sce.equals("salame")){
				Toppings toopp=(Toppings) ctx.getBean("salame");
				System.out.println("ok "+toopp);
			}
		    else if (sce.equals("no")) {
			System.out.println("arriva subito la pizza...");
		}
		System.out.println("Vuole per caso bevande?");

			String scelt=scanner.nextLine();
		  if (scelt.equals("vino")){
			  Bevande bevande=(Bevande) ctx.getBean("vino");
			  System.out.println("ok "+ bevande);
		  }if (scelt.equals("limonata")){
			  Bevande bev=(Bevande) ctx.getBean("limonata");
				System.out.println("ok "+bev);
			}if (scelt.equals("acqua")){
			  Bevande bevi=(Bevande) ctx.getBean("acqua");
				System.out.println("ok "+bevi);
			}


		System.out.println("l'ordine del tavolo 5: "+scelta+" "+"condimenti:  "+sce+" bevande: "+scelt+" in arrivo ");

        scanner.close();
		ctx.close();
	}

}
