package Domenico.Pizza8Gennaio.enteties;

import Domenico.Pizza8Gennaio.Pizza8GennaioApplication;
import Domenico.Pizza8Gennaio.dao.PizzeServiceDao;
import Domenico.Pizza8Gennaio.interfacce.BevandeDao;
import Domenico.Pizza8Gennaio.interfacce.ToppingsDao;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Scanner;

@Component
public class Menu implements CommandLineRunner {
    private ImpostazioniComuni impostazioniComuni;



    @Value("${costo.coperto}")
    private String coperto;

    @Autowired
    PizzeServiceDao pizzeServiceDao;
    @Autowired
    ToppingsDao toppingsDao;
    @Autowired
    BevandeDao bevandeDao;

    public Menu(ImpostazioniComuni impostazioniComuni){
        this.impostazioniComuni=impostazioniComuni;
    }
    public Menu(){

    }
    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(Pizza8GennaioApplication.class);


        Menu ma=(Menu) ctx.getBean("men");

        Pizze m= (Pizze) ctx.getBean("pizze");
        //pizzeServiceDao.savePizzaIntoDatabase(m);

        Toppings me=(Toppings) ctx.getBean("toppings");

        Bevande menu=(Bevande) ctx.getBean("bevande");
        System.out.println(ma);
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
            pizzeServiceDao.savePizzaIntoDatabase(p);
            System.out.println(p);
        } else if (scelta.equals("pizza hawaiana")) {
            Pizze pi=(Pizze) ctx.getBean("pizzaHawaiana");
            pizzeServiceDao.savePizzaIntoDatabase(pi);
            System.out.println(pi);
        } else if (scelta.equals("pizza con salame")) {
            Pizze piz=(Pizze) ctx.getBean("pizzaSalame");
            pizzeServiceDao.savePizzaIntoDatabase(piz);
            System.out.println(piz);
        }
        System.out.println("vuole aggiungere qualcosa alla pizza?");


        String sce=scanner.nextLine();
        if (sce.equals("formaggio")){
            Toppings toppings=(Toppings) ctx.getBean("formaggio");
             toppingsDao.save(toppings);
            System.out.println("ok "+toppings);
        }
        if (sce.equals("prosciutto")){
            Toppings top=(Toppings) ctx.getBean("prosciutto");
            toppingsDao.save(top);
            System.out.println("ok "+top);
        }
        if (sce.equals("cipolla")){
            Toppings topp=(Toppings) ctx.getBean("cipolla");
            toppingsDao.save(topp);
            System.out.println("ok "+topp);
        }
        if (sce.equals("ananas")){
            Toppings toopi=(Toppings) ctx.getBean("ananas");
            toppingsDao.save(toopi);
            System.out.println("ok "+toopi);
        }
        if (sce.equals("salame")){
            Toppings toopp=(Toppings) ctx.getBean("salame");
            toppingsDao.save(toopp);
            System.out.println("ok "+toopp);
        }
        else if (sce.equals("no")) {
            System.out.println("arriva subito la pizza...");
        }
        System.out.println("Vuole per caso bevande?");

        String scelt=scanner.nextLine();
        if (scelt.equals("vino")){
            Bevande bevande=(Bevande) ctx.getBean("vino");
            bevandeDao.save(bevande);
            System.out.println("ok "+ bevande);
        }if (scelt.equals("limonata")){
            Bevande bev=(Bevande) ctx.getBean("limonata");
            bevandeDao.save(bev);
            System.out.println("ok "+bev);
        }if (scelt.equals("acqua")){
            Bevande bevi=(Bevande) ctx.getBean("acqua");
            bevandeDao.save(bevi);
            System.out.println("ok "+bevi);
        }


        System.out.println("l'ordine del tavolo 5: "+scelta+" "+"condimenti:  "+sce+" bevande: "+scelt+" in arrivo ");


        scanner.close();
        ctx.close();
    }

    public int ritorno(ImpostazioniComuni impostazioniComuni){
        this.impostazioniComuni=impostazioniComuni;
        return impostazioniComuni.getPrice();
    }


    public void rispostaOrdine(){
        System.out.println("Abbiamo la pizza "+ impostazioniComuni.getName()+" "+impostazioniComuni.getCalories()+" calorie "+impostazioniComuni.getPrice()+" Euro");
        impostazioniComuni.Ordine();
    }

    @Override
    public String toString() {
        return "Menu{" +
                "impostazioniComuni=" + impostazioniComuni +
                '}';
    }
}
