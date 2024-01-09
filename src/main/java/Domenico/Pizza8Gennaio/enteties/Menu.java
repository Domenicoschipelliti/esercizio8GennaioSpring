package Domenico.Pizza8Gennaio.enteties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;


public class Menu implements CommandLineRunner {
    private ImpostazioniComuni impostazioniComuni;



    @Value("${costo.coperto}")
    private String coperto;

    public Menu(ImpostazioniComuni impostazioniComuni){
        this.impostazioniComuni=impostazioniComuni;
    }
    public Menu(){

    }
    @Override
    public void run(String... args) throws Exception {
        System.out.println("ordine con " + impostazioniComuni.getName() + "  in arrivo al tavolo 4 "+" il costo del coperto è "+ coperto +" Euro a persona");
    }


    public void rispostaOrdine(){
        System.out.println("Abbiamo la pizza "+ impostazioniComuni.getName()+" "+impostazioniComuni.getCalories()+" calorie "+impostazioniComuni.getPrice()+" Euro");
        System.out.println("La pizza "+ impostazioniComuni.getName()+" "+impostazioniComuni.getCalories()+" calorie "+impostazioniComuni.getPrice()+" Euro");
        System.out.println("Questa la consiglio è "+ impostazioniComuni.getName()+" "+impostazioniComuni.getCalories()+" calorie "+impostazioniComuni.getPrice()+" Euro");
        System.out.println("Infine la pizza "+ impostazioniComuni.getName()+" "+impostazioniComuni.getCalories()+"  calorie "+impostazioniComuni.getPrice()+" Euro");
        impostazioniComuni.Ordine();
    }

    @Override
    public String toString() {
        return "Menu{" +
                "impostazioniComuni=" + impostazioniComuni +
                '}';
    }
}
