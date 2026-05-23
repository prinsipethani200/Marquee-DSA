package Loops.For;

import java.util.Scanner;
//number tringle
public class Pattern1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
