package Lab_1;

import Lab_1.array_average;
import org.junit.BeforeClass;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.Test;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class array_average_test {
    static array_average array_average_;

    @BeforeClass
    public static void initialize(){
        array_average_=new array_average();
    }

    @Test
    public void positiveNumberAverge(){
        int[] fn={2,3,4,7};
        double result;
        result=array_average_.arrayAverage(fn);
        result=Math.round(result * 100.0) / 100.0;
        double expected=4;
        Assertions.assertEquals(expected,result);
    }
    @Test
    public void negativeNumberAverge(){
        int[] fn={-2,-3,-4,-7};
        double result;
        result=array_average_.arrayAverage(fn);
        result=Math.round(result * 100.0) / 100.0;
        double expected=-4;
        Assertions.assertEquals(expected,result);
    }
    @Test
    public void emptyArray(){
        int[] fn={};
        double result;
        result=array_average_.arrayAverage(fn);
        result=Math.round(result * 100.0) / 100.0;
        double expected=0;
        Assertions.assertEquals(expected,result);
    }


}
