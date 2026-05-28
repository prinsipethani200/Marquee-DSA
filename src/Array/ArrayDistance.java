package Array;
import java.util.*;

//Write a program to find out the shortest distance between two even positive integers in an array arr and print the distance. If there is one or zero even positive integer in the array then return -1.
public class ArrayDistance {
    static int shortestDistance(int arr[], int n) {

        int prev = -1;
        int min = Integer.MAX_VALUE;
        int count = 0;

        for(int i = 0; i < n; i++) {

            if(arr[i] > 0 && arr[i] % 2 == 0) {

                count++;

                if(prev != -1) {
                    int dis = i - prev;

                    if(dis < min) {
                        min = dis;
                    }
                }

                prev = i;
            }
        }

        if(count <= 1) {
            return -1;
        }

        return min;
    }

    static void main() {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(shortestDistance(arr, n));
    }
}
