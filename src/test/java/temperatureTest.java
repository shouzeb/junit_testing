import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class temperatureTest {
    temperature temp;
    @BeforeAll
    public void initialize(){
        temp=new temperature();
    }
    @Test
    public void isOnePrime(){
        int fn=1;
        double result;
        result=temp.checkPrime(fn);
        double expected=0.0;
        Assertions.assertEquals(expected,result);

    }

}
