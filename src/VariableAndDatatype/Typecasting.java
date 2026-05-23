package VariableAndDatatype;

/*Type casting in Java is the process of converting a value from one data type to another.
type : 1) implicit: This happens automatically when assigning a value of a smaller type to a larger type.
     : 2) Explicit: It must be done manually by placing the target type in parentheses in front of the value.

 Order: double
        float
        long
        int
        char
        short
        byte.
*/
public class Typecasting {
    static void main() {
        double d1 = 99.999999;
        int d2 = (int) d1;
        System.out.println(d1);//99.999999
        System.out.println(d2);//99

        int a = 66;
        char ch = (char) a;
        System.out.println(ch);//B

        byte b = (byte) -129;
        System.out.println(b);//127

    }
}
