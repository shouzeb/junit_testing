package Lab_1;

import Lab_1.palindrome_string;
import org.junit.BeforeClass;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.Test;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class palindrome_string_test {
    static palindrome_string str;
    @BeforeClass
    public static void initialize(){
        str=new palindrome_string();
    }
    @Test
    public void isPalindrome(){
        String fn="aba";
        boolean result;
        result=str.checkPalindrome(fn);
        boolean expected=true;
        Assertions.assertEquals(expected,result);
    }
    @Test
    public void isNotPalindrome(){
        String fn="abas";
        boolean result;
        result=str.checkPalindrome(fn);
        boolean expected=false;
        Assertions.assertEquals(expected,result);
    }

}
