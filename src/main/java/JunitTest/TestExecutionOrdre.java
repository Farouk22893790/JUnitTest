package JunitTest;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;


//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//@TestMethodOrder(MethodOrderer.Alphanumeric.class)
@TestMethodOrder(MethodOrderer.Random.class)
public class TestExecutionOrdre {


    @Test
   // @Order(4)
    public void test1()
    {
        System.out.println("this is méthode number 1");
    }



    @Test
   // @Order(3)

    public void test2()
    {
        System.out.println("this methode number 2");
    }




    @Test
    //@Order(2)
    public void test3()
    {

        System.out.println("this is methode number 3");
    }




    @Test
    //@Order(1)

    public void test4()
    {

        System.out.println("this is methode number 3");
    }

}
