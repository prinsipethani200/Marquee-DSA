package Loops.While;
import java.util.*;

public class Factorial {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        int fact = 1;
        int i = 1;
        while (i <= num1) {
            fact = fact * i;
            i++;
        }
        System.out.println(fact);
    }
}

