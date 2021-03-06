package Lab_1;

import Lab_1.even_odd;
import org.junit.BeforeClass;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.Test;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class even_odd_test {

    static even_odd even_odd_;
    @BeforeClass
    public static void initialize(){
        even_odd_=new even_odd();
    }
    @Test
    public void isEven(){
        int fn=2;
        boolean result;
        result=even_odd_.isEven(fn);
        boolean expected=true;
        Assertions.assertEquals(expected,result);
    }
    @Test
    public void isNotEven(){
        int fn=3;
        boolean result;
        result=even_odd_.isEven(fn);
        boolean expected=false;
        Assertions.assertEquals(expected,result);
    }
    @Test
    public void isOdd(){
        int fn=3;
        boolean result;
        result=even_odd_.isOdd(fn);
        boolean expected=true;
        Assertions.assertEquals(expected,result);
    }
    @Test
    public void isNotOdd(){
        int fn=4;
        boolean result;
        result=even_odd_.isOdd(fn);
        boolean expected=false;
        Assertions.assertEquals(expected,result);
    }
    @Test
    public void zeroIsEven(){
        int fn=0;
        boolean result;
        result=even_odd_.isEven(fn);
        boolean expected=true;
        Assertions.assertEquals(expected,result);
    }

}
