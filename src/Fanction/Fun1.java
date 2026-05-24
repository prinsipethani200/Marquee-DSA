package Fanction;
import java.util.*;

/*Function: block of code...
  Syntax: modifier ret_type fun_name(parameter){
            fun_body
            }

   why fun?
   -code reusability
   -Modularity
   -easy to debug


   instance methods: to call this fun required an object...
   static methods: they can call directly using class name...
*/

//Table Function...
public class Fun1 {
    static void table(int N){
        for(int i = 1; i <= 10; i++){
            System.out.println(N+" * "+i+" = "+(N*i));
        }
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        table(num);
    }
}
