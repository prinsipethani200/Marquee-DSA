package Loops.While;
import java.util.*;

public class Battery {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int battery = sc.nextInt();
        int count = 0;
        while(battery < 100){
            count ++;
            battery+=10;
        }
        System.out.println(count);
    }
}
