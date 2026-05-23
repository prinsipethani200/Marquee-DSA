package Loops.For;

import java.util.Scanner;

public class Pattern3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char ch = 'A';
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || i==n-1 || j==0 || j==n-1){
                    System.out.print(ch++);
                }
                else{
                    System.out.print("$");
                }
            }
            System.out.println();
        }
    }
}
/*
5
ABCDE
F$$$G
H$$$I
J$$$K
LMNOP
 */