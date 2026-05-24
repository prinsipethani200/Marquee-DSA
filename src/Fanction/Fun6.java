package Fanction;
import java.util.*;

//decimal to binary
public class Fun6 {
    static String DecimalToBinary(int n) {

        String binary = "";

        while (n > 0) {
            int rem = n % 2;
            binary = rem + binary;
            n = n / 2;
        }

        return binary;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("decimal number: ");
        int num = sc.nextInt();
        String result = DecimalToBinary(num);

        System.out.println("Binary number: " + result);
    }
}
