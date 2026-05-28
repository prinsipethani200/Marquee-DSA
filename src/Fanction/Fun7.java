package Fanction;
import java.util.*;

//decimal to hexa...
public class Fun7 {
    static String DecimalToHex(int num) {
        String hex = "";
        while (num > 0) {
            int rem = num % 16;
            if (rem < 10) {
                hex = rem + hex;
            } else {
                hex = (char) (rem + 55) + hex;
            }
            num = num / 16;
        }
        return hex;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("decimal number: ");
        int num = sc.nextInt();
        String result = DecimalToHex(num);
        System.out.println("Hexadecimal number: " + result);
    }
}