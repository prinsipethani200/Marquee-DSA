package Loops.For;

import java.util.Scanner;

public class Pattern12 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print((char)(64+j)+" ");
        }
        System.out.println();
    }

//        A
//        A B
//        A B C
//        A B C D


        for(int i=n;i>=0;i--){
            for(int j=1;j<=i;j++){
                System.out.print((char)(64+j)+" ");
            }
            System.out.println();
        }
//        A B C D E
//        A B C D
//        A B C
//        A B
//        A

    }
}
