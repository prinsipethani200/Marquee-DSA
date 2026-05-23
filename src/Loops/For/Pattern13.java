package Loops.For;

import java.util.Scanner;

public class Pattern13 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=2*n-1;i++){
            for(int j=1;j<=2*n-1;j++){
                int a=i;
                int b=j;
                if(i>n) a=2*n-i;
                if(j>n) b=2*n-j;
                System.out.print(Math.min(a,b)+" ");
            }
            System.out.println();
        }
//        spiral
//        1 1 1 1 1 1 1 1 1
//        1 2 2 2 2 2 2 2 1
//        1 2 3 3 3 3 3 2 1
//        1 2 3 4 4 4 3 2 1
//        1 2 3 4 5 4 3 2 1
//        1 2 3 4 4 4 3 2 1
//        1 2 3 3 3 3 3 2 1
//        1 2 2 2 2 2 2 2 1
//        1 1 1 1 1 1 1 1 1


    }
}
