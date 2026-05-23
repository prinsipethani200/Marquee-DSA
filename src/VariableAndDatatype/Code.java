package VariableAndDatatype;

public class Code {
    static void main() {
        int x = 0;
        int y = 9;
        int z = 8;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(20+30+"Java");
        System.out.println("java"+20+30);
        //System.out.print(System.out.print("java")); // error
        System.out.println('A'+"B");//AB
        System.out.println('A'+'B');//131

        byte b1 = 127;
        //byte b3 = b1 + 3;
        ++b1;
        System.out.println(b1);//-128
        System.out.println(b1+3);//130
        //System.out.println(b3);//erorr

        //final key word fix the value which is never change...
        final byte num1 = 10;//ans
        final byte num2 = 20;//ans
        //byte num1 = 10;//error
        //byte num2 = 20;//error

    }
}
