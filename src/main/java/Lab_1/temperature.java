package Lab_1;

public class temperature {
    public double celsiusToFahrenheit(double celsius){
        double fahrenheit;
        fahrenheit = (celsius*1.8)+32;
        return fahrenheit;
    }
    public double celsiusToKelvin(double celsius){
        double kelvin;
        kelvin = celsius+273.15;
        return kelvin;
    }
}
