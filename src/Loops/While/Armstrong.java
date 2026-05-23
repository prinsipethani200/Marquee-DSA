package Loops.While;

import java.util.Scanner;

public class Armstrong {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        int n=num;
        while(num>0){
          int digit=num%10;
          sum+=(digit*digit*digit);
          num/=10;
        }
        if(sum==n){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not armstrong");
        }

    }
}
