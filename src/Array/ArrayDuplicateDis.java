package Array;
import java.util.*;

//You have been given an array arr that might contain duplicate elements. Your task is to find the maximum possible distance between occurrences of two repeating elements i.e. elements having the same value. If there are no duplicate elements in the array, print 0
public class ArrayDuplicateDis {
    static int maxDistance(int arr[], int n) {

        int max = 0;

        for(int i = 0; i < n; i++) {

            for(int j = i + 1; j < n; j++) {

                if(arr[i] == arr[j]) {

                    int dis = j - i;

                    if(dis > max) {
                        max = dis;
                    }
                }
            }
        }

        return max;
    }

    static void main() {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(maxDistance(arr, n));
    }
}
