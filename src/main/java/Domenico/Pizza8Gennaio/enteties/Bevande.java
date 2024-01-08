package Domenico.Pizza8Gennaio.enteties;

public class Bevande implements ImpostazioniComuni{
    private String name;
    private String calories;
    private int price;

    public Bevande(String name, String calories, int price) {
        this.name = name;
        this.calories = calories;
        this.price = price;
    }

    @Override
    public void Ordine() {
        System.out.println("pizza più  bevande servita a breve");
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getCalories() {
        return calories;
    }

    public void setCalories(String calories) {
        this.calories = calories;
    }

    @Override
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
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
