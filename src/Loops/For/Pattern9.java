package Loops.For;

import java.util.Scanner;
//typeRT...
public class Pattern9 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
