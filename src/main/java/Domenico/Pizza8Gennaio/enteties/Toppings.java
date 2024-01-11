package Domenico.Pizza8Gennaio.enteties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
public class Toppings implements ImpostazioniComuni{
    @Id
    @GeneratedValue
    @Getter
    private long toppingsId;

    private String name;
    private String calories;

    private int price;

    public Toppings(String name, String calories, int price) {
        this.name = name;
        this.calories = calories;
        this.price = price;
    }

    public Toppings(){
        
    }

    @Override
    public String Ordine() {
        return "pizza con toppings aggiunta all'ordine";
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
        return "Toppings{" +
                "name='" + name + '\'' +
                ", calories='" + calories + '\'' +
                ", price=" + price +
                '}';
    }
}
