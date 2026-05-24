package Fanction;
import java.util.*;

//in number how many time given digit come...
public class Fun11 {
   static int frequency(int n, int dig) {

        int count = 0;

        while (n > 0) {

            int rem = n % 10;

            if (rem == dig) {
                count++;
            }

            n = n / 10;
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dig = sc.nextInt();
        int result = frequency(n, dig);
        System.out.println("Frequency: " + result);
    }
}
