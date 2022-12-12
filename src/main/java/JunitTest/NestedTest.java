package JunitTest;

import JunitClasses.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class NestedTest {
    Calculator calc;

    @BeforeEach
    public void init()
    {
        calc= new Calculator();
    }


    @Nested

    class positivesNumbers
    {

        @Test
        public void addSmallPositiveNumber()
        {
            int som = calc.add(4,5);
            System.out.println(som);
        }


        @Test

        public void addBigPositiveNumber()
        {
            int som = calc.add(1000,1011);
            System.out.println(som);
        }



    }

    @Nested

    class NegativesNumbers
    {
        @Test

        public void addSmallNegativeNumber()
        {
            int som = calc.add(-4,-5);
            System.out.println(som);
        }


        @Test

        public void addBigNegativeNumber()
        {
            int som = calc.add(-3000,-4000);
            System.out.println(som);
        }



    }


    @Nested
    class zeroNumbers
    {
        @Test

        public void addNegativeZeroNumber()
        {
            int som = calc.add(-0,-0);
            System.out.println(som);
        }


        @Test

        public void addPositiveZeroNumber()
        {
            int som = calc.add(0,0);
            System.out.println(som);
        }


    }





}
