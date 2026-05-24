package Fanction;
import java.util.*;

//fun to convert fahrenheit to celesius....
public class Fun5 {
    static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        return celsius;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        double result = fahrenheitToCelsius(fahrenheit);
        System.out.println("Celsius: " + result);
    }
}
