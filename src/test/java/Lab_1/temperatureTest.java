package Lab_1;

import Lab_1.temperature;
import org.junit.BeforeClass;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class temperatureTest {
    static temperature temp;
    @BeforeAll
    public static void initialize(){
        temp=new temperature();
    }
    @Test
    public void toFahrenheit(){
        double fn=20.3;
        double result;
        result=temp.celsiusToFahrenheit(fn);
        result=Math.round(result * 100.0) / 100.0;
        double expected=68.54;
        Assertions.assertEquals(expected,result);

    }
    @Test
    public void toKelvin(){
        double fn=20.3;
        double result;
        result=temp.celsiusToKelvin(fn);
        result=Math.round(result * 100.0) / 100.0;
        double expected=293.45;
        Assertions.assertEquals(expected,result);

    }
    @Test
    public void toFarhAtZero(){
        double fn=0;
        double result;
        result=temp.celsiusToFahrenheit(fn);
        result=Math.round(result * 100.0) / 100.0;
        double expected=32;
        Assertions.assertEquals(expected,result);

    }
    @Test
    public void toKelvinAtZero(){
        double fn=0;
        double result;
        result=temp.celsiusToKelvin(fn);
        result=Math.round(result * 100.0) / 100.0;
        double expected=273.15;
        Assertions.assertEquals(expected,result);

    }

}
