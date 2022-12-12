package JunitTest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

public class ConditionalTest {


    /**
     * 1.Condition on Operating system
     * 2.Condition on particular JRE
     **/
    @Test
    @EnabledOnOs(OS.WINDOWS) //Si je mets .MAC ça marche pas

    public void conditionOnWindows()
    {
        System.out.println("Execute this test only in WINDOWS machine");
    }



    @Test
    @EnabledOnJre(JRE.JAVA_18)

    public void conditionOnJRE()
    {
        System.out.println("Execute this test only for Java 17");
    }

}
