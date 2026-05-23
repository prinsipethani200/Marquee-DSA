package Loops.For;

import java.util.Scanner;

public class IsPrime {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        for(int i = 2; i < num1; i++){
            if(num1 % i == 0){
                System.out.println("Not Prime");
                break;
            }
            else{
                System.out.println("Prime");
                break;
            }
        }
    }
}
