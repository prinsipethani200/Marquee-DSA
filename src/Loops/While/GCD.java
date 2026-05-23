package Loops.While;

import java.util.Scanner;

public class GCD {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        while(num1!=num2){
            if(num1>num2){
                num1=num1-num2;
            }
            if(num2>num1){
                num2=num2-num1;
            }
        }
        System.out.println(num1);


//    int dividend=sc.nextInt();
//    int divisor=sc.nextInt();
//    while(divisor!=0){
//        int rem=dividend%divisor;
//        dividend=divisor;
//        divisor=rem;
//    }
//        System.out.println(dividend);


    }
}
