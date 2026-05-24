package Fanction;

import java.util.Scanner;


//fun to chech char is vowel or not...
public class Fun2 {
    static boolean isVowel(char ch){
        if(ch =='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' ||
                ch=='a'||  ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            return true;
        }else
            return false;
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        char chr = sc.next().charAt(0);
        System.out.println(isVowel(chr));
    }
}
