package Loops.While;

import java.util.Scanner;

public class FibonacciSeries {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int a=0;
        int b=1;
        int sum=0;

       System.out.print(0+" ");
        int i=1;
        while(i<num){
            sum=a+b;
            b=a;
            a=sum;
            System.out.print(sum+" ");
            i++;
        }
    }
}
