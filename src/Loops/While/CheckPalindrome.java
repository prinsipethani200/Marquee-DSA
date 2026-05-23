package Loops.While;
import java.util.*;


public class CheckPalindrome {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int res = 0;
        int num1 = num;
        while (num > 0) {
            int digit = num % 10;
            res = (res * 10) + digit;
            num = num / 10;

        }
        if(num1 == res){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
