package Domenico.Pizza8Gennaio.enteties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
public class Bevande implements ImpostazioniComuni{
    @Id
    @GeneratedValue
    @Getter
    private long bevandeId;
    private String name;
    private String calories;
    private int price;

    public Bevande(String name, String calories, int price) {
        this.name = name;
        this.calories = calories;
        this.price = price;
    }
    public Bevande(){

    }

    @Override
    public String Ordine() {
        return "pizza più  bevande servita a breve";
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
        return "Bevande{" +
                "name='" + name + '\'' +
                ", calories='" + calories + '\'' +
                ", price=" + price +
                '}';
    }
}
