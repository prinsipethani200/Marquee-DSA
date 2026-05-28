package Fanction;
import java.util.*;

public class Fun15 {
    public static int sumOfEvenNumber(int start,int end){
        int cunt = 0;
        for(int i = start ; i <= end; i++){
            if(i%2 == 0){
                cunt += i;
            }
        }
        return cunt;
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(sumOfEvenNumber(num1,num2));
    }
}
