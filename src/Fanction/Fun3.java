package Fanction;

import java.util.Scanner;

// fun of addition of three no...
public class Fun3 {
    static int add(int a,int b,int c){
        return a+b+c;
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        System.out.println(add(num1,num2,num3));
    }
}
