import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class primeNumberTest {
    prime_number pm;
    @BeforeAll
    public void initialize(){
        pm=new prime_number();
    }
    @Test
    public void isOnePrime(){
        int fn=1;
        boolean result;
        result=pm.checkPrime(fn);
        boolean expected=true;
        Assertions.assertEquals(expected,result);

    }

}
