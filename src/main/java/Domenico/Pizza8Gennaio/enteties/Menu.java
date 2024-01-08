package Domenico.Pizza8Gennaio.enteties;

public class Menu {
    private ImpostazioniComuni impostazioniComuni;

    public Menu(ImpostazioniComuni impostazioniComuni){
        this.impostazioniComuni=impostazioniComuni;
    }
    public Menu(){

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
