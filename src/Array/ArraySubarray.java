package Array;
import java.util.*;

public class ArraySubarray {

    static void print(int[] arr, int i, int j) {
        for (int k = i; k <= j; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println();
    }
    public static void printSubarrays(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                print(arr, i, j);
            }
        }

        int[] nums = {1, 2, 3};
        printSubarrays(nums);

        sc.close();
    }
}