package Fanction;
import java.util.*;
public class Fun17 {
    static String stringC(String ch){
        return "HEllo "+ch;
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        String ch = sc.nextLine();
        System.out.println(stringC(ch));
    }
}
