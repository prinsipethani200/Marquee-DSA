package Loops.For;

import java.util.Scanner;
//BinaryTringle
public class Pattern8 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print(0+" ");
                }else{
                    System.out.print(1+" ");
                }
            }
            System.out.println();
        }
    }
}
