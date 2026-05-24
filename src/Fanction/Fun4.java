package Fanction;

import java.util.Scanner;

//fun to count area of circle
public class Fun4 {
    static float area(int redius){
        float pi = 3.14f; //local variable...
        return pi * redius * redius;
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        int red = sc.nextInt();
        System.out.println(area(red));
    }
}
