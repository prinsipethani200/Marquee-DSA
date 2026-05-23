package Loops.For;

import java.util.Scanner;
//Reverse-RightTringle
public class Pattern7 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        for(int i=1;i<=5;i++){
            for(int j=1;j<=6-i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

        //option 2
        for(int i=1;i<=5;i++){
            for(int j=1;j<=6-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        }
}
