package Domenico.Pizza8Gennaio;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class TestPizzeriaEfficenza {
    @BeforeAll //viene usato quando si vuole fare un azione prima di qualsiasi test(quindi sarà il primo ad essere stampato dopo verranno i test)
    public static void testDiStampa(){
        System.out.println("INIZIO TEST...");
    }

    @AfterEach//viene usato per fare qualsiasi azione dopo ogni test quindi finisce un test uscirà questa verifica
    public  void  testDiMezzoDiFine(){
        System.out.println("FINE TEST...");
    }


    @Test
    public void verificaPrezzo(){

    }


    @BeforeEach
    public   void testMezzoFineTe(){
        System.out.println("quasi pronto...");
    }
    @AfterAll
    public static void testFineStampa(){
        System.out.println("fine di tutti i test...");
    }

    @ParameterizedTest
    @ValueSource(strings = {"pizza"})
    public void ricercaPizza(){
        String nome="pizza";
        assertNotNull(nome);
        System.out.println(nome);
    }




}
