package VariableAndDatatype;
import java.util.Scanner;

//A var in java is a container used to store data...
//syntax : datatype var_name = value;


public class Variable {
    static void main() {
        int a = 20; // int == datatype , a == variable , 20 == value...
        System.out.println(a); //20

        //user input...
        // to take user input import Scanner class and create a object...

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n);
    }
}
