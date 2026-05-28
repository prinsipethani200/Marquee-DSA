package Fanction;
import java.util.*;

//Binary to Decimal...
public class Fun19 {
    static int binaryToDecimal(int n){
        int ans = 0;
        int power = 0;
        while(n>0){
            int digit = n % 10;
            ans = ans + (digit * (int)Math.pow(2,power));
            power++;
            n = n / 10;
        }
        return ans;
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(binaryToDecimal(num));
    }
}
