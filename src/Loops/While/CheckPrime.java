package Loops.While;
import java.util.*;

public class CheckPrime {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int i = 2;
        while (i < num1) {
            if (num1 % i == 0) {
                break;
            }
            if (num1 == i)
                System.out.println("Prime");
            else
                System.out.println("Not Prime");
        }
    }
}