package TestSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import Lab_1.*;


@RunWith(org.junit.runners.Suite.class)


@org.junit.runners.Suite.SuiteClasses({
        array_average_test.class,
        palindrome_string_test.class,
        temperatureTest.class,
        primeNumberTest.class,
        even_odd_test.class
})

public class Suite_ {
}
