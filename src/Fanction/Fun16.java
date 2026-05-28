package Fanction;
import java.util.*;

public class Fun16 {
    public static int countDig(int num){
        int count = 0;
        int num1 = num;
        while (num > 0) {
            int digit = num % 10;
            count++;
            num = num / 10;
        }
        return count;
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(countDig(num));
    }
}
