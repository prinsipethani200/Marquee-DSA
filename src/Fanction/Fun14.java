package Fanction;
import java.util.*;

public class Fun14 {
    public static void function(int a,int b){
        if(a==2){
            return;
        }
        else{
            System.out.println(a+b);
        }
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        function(num1,num2);
    }
}
