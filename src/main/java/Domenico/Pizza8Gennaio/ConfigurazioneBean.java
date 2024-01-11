package Domenico.Pizza8Gennaio;

import Domenico.Pizza8Gennaio.enteties.*;
import Domenico.Pizza8Gennaio.interfacce.ImpostazioniComuni;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

@Configuration //grazie a questa annotazione possimao far capire a Spring che questa sarà di sua gestione ed è obbligatoria per la rilevanza
@PropertySource("application.properties")//questa annotazione aiuta a far capire a spring in quale percorso pigliare la parola costo.coperto con il suo valore
public class ConfigurazioneBean {


    @Bean//in caso di indecisione da parte di spring l'annotazione primary darà il consenso di usare questa
    @Primary
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
    Pizze pizzaMargherita(){
        return new Pizze("pizza margherita(mozzarella,pomodoro)","29",3);
    }

    @Bean
    Pizze pizzaHawaiana(){
        return new Pizze("Hawaiian pizza(pomodoro,formaggio,prosciutto,ananas)","40",6);
    }

    @Bean
    Pizze pizzaSalame(){
        return new Pizze("Salami pizza(pomodoro,formaggio,salame)","1000",10);
    }

   
    @Bean
    Toppings formaggio(){
        return new Toppings("formaggio","100",1);
    }

    @Bean
    Toppings prosciutto(){
        return new Toppings("prosciutto","10",2);
    }

    @Bean
    Toppings salame(){
        return new Toppings("salame","9",3);
    }

    @Bean
    Toppings ananas(){
        return new Toppings("ananas","5",4);
    }

    @Bean
    Toppings cipolla(){
        return new Toppings("cipolla","3",4);
    }

    @Bean
    Bevande limonata(){
        return new Bevande("limonata","20",1);
    }

    @Bean
    Bevande vino(){
        return new Bevande("vino","10",7);
    }

    @Bean
    Bevande acqua(){
        return new Bevande("acqua","0",2);
    }



    @Bean
    Menu men(ImpostazioniComuni impostazioniComuni){
        return new Menu(impostazioniComuni);
    }








}
