package JunitTest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.RepetitionInfo;


     public class RepeatedTestMethod {



    @Test
    @org.junit.jupiter.api.RepeatedTest(1)
    public void repeadTestMethod()

    {
        System.out.println("I am executing this test multiple times1");
    }





    @Test
    @org.junit.jupiter.api.RepeatedTest(value = 2, name = "{displayName} - {currentRepetition}/{totalRepetitions}")
    public void repeadTestMethod1()

    {
        System.out.println("I am executing this test multiple times2");
    }



    @Test
    @org.junit.jupiter.api.RepeatedTest(value = 4, name = org.junit.jupiter.api.RepeatedTest.LONG_DISPLAY_NAME)
    public void repeadTestMethod2() {
        System.out.println("I am executing this test multiple times3");
    }




    @Test
    @org.junit.jupiter.api.RepeatedTest(value = 4, name = org.junit.jupiter.api.RepeatedTest.SHORT_DISPLAY_NAME)

    public void repeadTestMethod3() {
        System.out.println("I am executing this test multiple times4");
    }



   // @Test
   // @org.junit.jupiter.api.RepeatedTest(4)
   // public void repeatedTesMethod4(RepetitionInfo repetitioninfo) {
     //   System.out.println(repetitioninfo.getCurrentRepetition());
        //System.out.println(repetitioninfo.getTotalRepetitions());
    }

