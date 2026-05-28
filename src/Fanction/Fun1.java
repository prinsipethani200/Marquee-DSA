package Fanction;
import java.util.*;

//what is fun?
//why do we need fun?
//what are components of fun?
/*Syntax: modifier ret_type fun_name(parameter){
    fun_body
    return value;
}
*/
//sequential flow of fun...
//context of the fun... (gloabl scope,local,...this...)
//call stack or heap memory(lvt,how obj store,stack frame,which is fast,consistence)
//pass by value or pass by reference...
//what are para. fun?
//what are arg in fun?
//para & arg independent or dependent...
//public static void add(){ fun body }   ..non-parametrize fun
//public static void add(int a ,int b){ fun body }  ..parametrize fun
//recursive fun... (a fun calling itself within its own body...)
//fun overloading...
//fun overriding...(@override)
//oop...

/*Function: block of code...
  Syntax: modifier ret_type fun_name(parameter){
            fun_body
            return value;
            }

   why fun?
   -code reusability
   -redability
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
