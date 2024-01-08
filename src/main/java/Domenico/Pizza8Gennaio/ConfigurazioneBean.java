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
       return new Pizze("pizza margherita(mozzarella,pomodoro),Hawaiian pizza(pomodoro,formaggio,prsciutto,ananas),Salami pizza(pomodoro,formaggio,salame)","1100,1199,1200,1111",17);
    }

    @Bean
    Toppings toppings(){
        return new Toppings("formaggio,prosciutto,cipolle,ananas,salame","100,22,10,25,1100",4);
    }

    @Bean
    Bevande bevande(){
        return new Bevande("Limonata,Acqua,Vino","12,0,9",10);
    }

    @Bean
    Menu bevanda(Bevande impostazioniComuni){
        return new Menu(impostazioniComuni);
    }

    @Bean
    Menu condimenti(Toppings impostazioniComuni){
        return new Menu(impostazioniComuni);
    }

    @Bean
    Menu menu(ImpostazioniComuni impostazioniComuni){
        return new Menu(impostazioniComuni);
    }


}
