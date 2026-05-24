package Fanction;
import java.util.*;

//decimal to octal...
public class Fun8 {
    static String decimalToOctal(int num) {

        String octal = "";

        while (num > 0) {

            int rem = num % 8;
            octal = rem + octal;
            num = num / 8;
        }

        return octal;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Decimal number: ");
        int num = sc.nextInt();
        String result = decimalToOctal(num);
        System.out.println("Octal number: " + result);
    }
}
