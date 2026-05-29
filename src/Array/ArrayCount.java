package Array;
import java.util.*;

//Write a program to count all elements in array less than X...
public class ArrayCount {
    static int countLess(int arr[], int n, int x) {
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] < x) {
                count++;
            }
        }
        return count;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        System.out.println(countLess(arr, n, x));
    }
}
