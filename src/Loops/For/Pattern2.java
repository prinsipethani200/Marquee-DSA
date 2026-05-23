package Loops.For;

import java.util.Scanner;
//solid-square of index number
public class Pattern2 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            for(int j=0;j<5;j++){
                System.out.print(i+""+j+" ");
            }
            System.out.println();
        }
    }
}