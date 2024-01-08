package Domenico.Pizza8Gennaio;

import Domenico.Pizza8Gennaio.enteties.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration//grazie a questa annotazione possimao far capire a Spring che questa sarà di sua gestione ed è obbligatoria per la rilevanza
public class ConfigurazioneBean {
    @Bean
    @Primary//in caso di indecisione da parte di spring l'annotazione primary darà il consenso di usare questa
    Pizze pizze(){
       return new Pizze("pizza margherita","90",5);
    }

    @Bean
    Toppings toppings(){
        return new Toppings("pizza margherita con prosciutto","100",27);
    }

    @Bean
    Bevande bevande(){
        return new Bevande("birra","12",1);
    }


    @Bean
    Menu menu(ImpostazioniComuni impostazioniComuni){
        return new Menu(impostazioniComuni);
    }


}
