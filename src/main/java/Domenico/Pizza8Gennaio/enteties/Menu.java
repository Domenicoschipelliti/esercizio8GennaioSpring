package Domenico.Pizza8Gennaio.enteties;

public class Menu {
    private ImpostazioniComuni impostazioniComuni;

    public Menu(ImpostazioniComuni impostazioniComuni){
        this.impostazioniComuni=impostazioniComuni;
    }

    public void rispostaOrdine(){
        System.out.println("l'ordine con pizza "+ impostazioniComuni.getName()+impostazioniComuni.getCalories()+impostazioniComuni.getPrice()+"verrà tra poco");
        impostazioniComuni.Ordine();
    }

    @Override
    public String toString() {
        return "Menu{" +
                "impostazioniComuni=" + impostazioniComuni +
                '}';
    }
}
