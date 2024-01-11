package Domenico.Pizza8Gennaio.exceptions;

public class IdNonTrovato extends RuntimeException{
   public IdNonTrovato(long id){
     super("id "+ id +" non trovato");
   }
}
