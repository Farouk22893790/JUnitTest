package JunitTest;

import JunitClasses.Calculator;
import org.junit.jupiter.api.*;


public class AnnotationsTest {


    //initialiser une variable calc de la classe Calculator

    Calculator calc;
    @BeforeEach
    public void init()
    {
        calc=new Calculator();
        System.out.println("Initializing the calculator instance");
    }

    @BeforeAll
    public static void beforeAllMethode()
    {
        System.out.println("Establishing connexion to the data base.");
    }

    //méthode 2

    @AfterAll
    public static void AfterAllMethodes()
    {

        System.out.println("closing connexion to the data base.");

    }
    // 3 méthodes de test

    //méthode1

    @Test
    @DisplayName("adding two positive nuumber ")


    public void testMethode1()
    {
     // je vais appeller la classe calculator qui contient la méthode add
       // on utilise la variable calc

        int som=calc.add(10,20);

        System.out.println("la somme est   "+som);

    }


    @Test
    @DisplayName("adding two negative nuumber ")
    public void testMethode2()
    {
        int som=calc.add(-20, -30);

        System.out.println("la somme est    "+som);

    }

    @Test
    @DisplayName("adding two positive and negative number ")
    @Disabled("Not executing")

    public void testMethode3()
    {
        int som=calc.add(-20,30);

        System.out.println("la somme est     "+som);

    }

}
