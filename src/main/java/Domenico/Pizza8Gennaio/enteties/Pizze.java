package Domenico.Pizza8Gennaio.enteties;

public class Pizze implements ImpostazioniComuni{
    private String name;
    private String calories;

    private int price;

    private String pomodoro;
    private String formaggio;

    public Pizze(String name, String calories, int price) {
        this.name = name;
        this.calories = calories;
        this.price = price;
    }

    @Override
    public void Ordine() {
        System.out.println("la pizza sta arrivando...");
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
        return "Pizze{" +
                "name='" + name + '\'' +
                ", calories='" + calories + '\'' +
                ", price=" + price +
                '}';
    }
}
