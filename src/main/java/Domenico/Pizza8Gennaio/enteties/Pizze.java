package Domenico.Pizza8Gennaio.enteties;

import Domenico.Pizza8Gennaio.interfacce.ImpostazioniComuni;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
public class Pizze implements ImpostazioniComuni {
    @Id
    @GeneratedValue
    @Getter
    private long id;
    private String name;
    private String calories;

    private int price;



    public Pizze(String name, String calories, int price) {
        this.name = name;
        this.calories = calories;
        this.price = price;
    }
    public Pizze(){

    }

    @Override
    public String Ordine() {
        System.out.println("la pizza sta arrivando...");
        return "";
    }

    @Override
    public String getName() {
        return name;
    }



    @Override
    public String getCalories() {
        return calories;
    }



    @Override
    public int getPrice() {
        return price;
    }



    @Override
    public String toString() {
        return "Pizze{" +
                "name='" + name + '\'' +
                ", calories='" + calories + '\'' +
                ", price=" + price +
                '}';
    }
}
