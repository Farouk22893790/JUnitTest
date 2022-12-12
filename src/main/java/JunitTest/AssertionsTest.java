package JunitTest;

import JunitClasses.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AssertionsTest {

    Calculator calc;

    @BeforeEach
    public void init()
    {
        calc=new Calculator();
    }




    @Test
    public void assertequals ()
    {

        int sum=calc.add(2,3);
        Assertions.assertEquals(5,sum,"test failed, le numero attendu est different au numero obtenu");
    }



    @Test
    public void assertNotEquals()
    {
        int sum=calc.add(2,3);
        Assertions.assertNotEquals(6,sum,"aaa");
    }



    @Test
    public void assertArrayEqualsTest()
    {
        //Assertions.assertArrayEquals(new int[] {1,2,3},new int[] {1,2,3});
        Assertions.assertArrayEquals(new int[] {1,2,3},new int[] {1,1,3});
    }




    @Test
    public void assertNullTest()
    {
        String nullString=null;
        String notNullString="farouk";
       //Assertions.assertNull(notNullString);
        Assertions.assertNotNull(notNullString);
    }



    @Test
    public void assertTrueTest()
    {
        boolean truevalue=true;
        boolean falsevalue=false;
        Assertions.assertTrue(truevalue);
    }


    @Test
    public void assertFalseTest()
    {
        boolean truevalue=true;
        boolean falsevalue=false;
        Assertions.assertFalse(truevalue);
    }

}
