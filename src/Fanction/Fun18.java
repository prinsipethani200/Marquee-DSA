package Fanction;
import java.util.*;

public class Fun18 {
    static boolean isSecondLastEven(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            if (count == 2) {
                int digit = num % 10;
                if (digit % 2 == 0) {
                    return true;
                }
            }
            num = num / 10;
        }
        return false;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(isSecondLastEven(num));
    }

}