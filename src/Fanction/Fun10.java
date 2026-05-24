package Fanction;
import java.util.*;

//given number is strong or not...
public class Fun10 {
        static int factorial(int n) {

            int fact = 1;

            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }

            return fact;
        }

        public static boolean isStrong(int num) {

            int original = num;
            int sum = 0;

            while (num > 0) {

                int digit = num % 10;
                sum = sum + factorial(digit);
                num = num / 10;
            }

            return sum == original;
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            if (isStrong(num)) {
                System.out.println("Strong Number");
            } else {
                System.out.println("Not Strong Number");
            }
        }
}
