package Lab_1;

import Lab_1.prime_number;
import org.junit.BeforeClass;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.Test;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class primeNumberTest {
    static prime_number pm;
    @BeforeClass
    public static void initialize(){

        pm=new prime_number();

    }
    @Test
    public void isOnePrime(){
        int fn=1;
        boolean result;
        result=pm.checkPrime(fn);
        boolean expected=false;
        Assertions.assertEquals(expected,result);

    }
    @Test
    public void isPrime(){
        int fn=3;
        boolean result;
        result=pm.checkPrime(fn);
        boolean expected=true;
        Assertions.assertEquals(expected,result);
    }
    @Test
    public void negativeNotPrime(){
        int fn=-3;
        boolean result;
        result=pm.checkPrime(fn);
        boolean expected=false;
        Assertions.assertEquals(expected,result);
    }
    @Test
    public void isNotPrime(){
        int fn=4;
        boolean result;
        result=pm.checkPrime(fn);
        boolean expected=false;
        Assertions.assertEquals(expected,result);
    }
    @Test
    public void isZeroPrime(){
        int fn=0;
        boolean result;
        result=pm.checkPrime(fn);
        boolean expected=false;
        Assertions.assertEquals(expected,result);
    }

}
