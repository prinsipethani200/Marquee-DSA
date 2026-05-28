package Array;
import java.util.*;

//Given two array of similar size , run a single loop and return a array which is summation of same index element,0 <= element < 5
public class ArraySum {
    static int[] sumArray(int a[], int b[], int n) {

        int ans[] = new int[n];

        for(int i = 0; i < n; i++) {
            ans[i] = a[i] + b[i];
        }

        return ans;
    }

    static void main() {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a[] = new int[n];
        int b[] = new int[n];

        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        int ans[] = sumArray(a, b, n);

        for(int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
