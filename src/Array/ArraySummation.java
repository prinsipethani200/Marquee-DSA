package Array;
import java.util.*;

public class ArraySummation {
    static int[] sumOfArray(int[] arr1,int[] arr2,int n){
    int[] res = new int[n];
    for(int i =0 ;i<n;i++){
        res[i] = arr1[i] + arr2[i];
    }
    return res;
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i = 0 ; i < n; i++){
            arr1[i] = sc.nextInt();
        }
        int[] arr2 = new int[n];
            for(int i = 0 ; i < n; i++){
                arr2[i] = sc.nextInt();
            }

        int[] result = sumOfArray(arr1, arr2, n);
        for (int i = 0; i < n; i++) {
            System.out.print(result[i]+" ");
        }
    }
}
