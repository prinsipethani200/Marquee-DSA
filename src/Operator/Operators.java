package Operator;
import java.util.*;
/*
types of operators:
1) Arithmetic : +,-,*,/,%
2) Assignment : =,+=,-+,*=,/=,%=
3) Relational : ==,!=,<,>,<=,>=
4) Logical : &&,||,!
5) Unary : ++,--
6) Bitwise : &,|,^,<<,>>
7) Ternary : condition ? val_if_true : val_if_false
 */

public class Operators {
    static void main() {
        //Arithmetic
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();//50
        int num2 = sc.nextInt();//10

        System.out.println(num1 + num2);//60
        System.out.println(num1 - num2);//40
        System.out.println(num1 * num2);//500
        System.out.println(num1 / num2);//5
        System.out.println(num1 % num2);//0


        //Assignment
        int num = 12; // here 12 is assign to a...
        System.out.println(num += 2);//14

        //Relational
        // It is use to compare the value
        System.out.println(num1 == num2);//false

        //Logical
        System.out.println(5>3 && 8>5);//true

        //Unary
        //use to increment and decrement
        //mostly used in loops...
        int A =1;
        int B = A++ + ++A + A++ +A;// 1+3+3+4 = 11
        System.out.println(B);

        int x = 5;
        System.out.println(x++ + ++x * x++);//5+7*7=54

        int z = 1;
        System.out.println(++z + z++ + --z + z--);//2+2+2+2=8


        //Bitwise
        //It is check binary bits...

        //Ternary

        String result = (num1 % 2 == 0 )? "Even" : "odd";
        System.out.println(result);//even


        int result1 = (num1 > num2) ? num1 : num2;
        System.out.println(result1);//50

        int a = 2;
        int b = 3;
        int c = 8;
        int res = (a>b && a>c) ? a:(b>c && b>a) ? b:c;
        System.out.println(res);//8


        String elg = num1 >18 ? "eligible" : "Not eligible";
        System.out.println(elg);//eligible

        int num0 = 9;
        int num3 = ++num0 + (2+num0);
        int num4 = (2+num0) + ++num0;
        System.out.println(a>num3?a:num3);//22
        System.out.println(num4);//21



    }
}
