package Fanction;
import java.util.*;

//decimal to any base...
public class Fun9 {
    static String decimaltoany(int num, int base) {

        String result = "";

        while (num > 0) {

            int rem = num % base;

            if (rem < 10) {
                result = rem + result;
            } else {
                result = (char)(rem + 55) + result;  // res = (char)(rem - 10 +'A') + res;
            }

            num = num / base;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Decimal number: ");
        int num = sc.nextInt();
        System.out.print("Enter base: ");
        int base = sc.nextInt();
        String ans = decimaltoany(num, base);
        System.out.println("Converted number: " + ans);
    }
}
