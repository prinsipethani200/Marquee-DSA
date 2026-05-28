package Array;
import java.util.*;

//Given two array , return the array which is result of substraction of indvidual element in an array
public class ArrayOfSubtraction {
    static int[] subtractArray(int a[], int b[], int n) {

        int ans[] = new int[n];

        for(int i = 0; i < n; i++) {
            ans[i] = a[i] - b[i];
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

        int ans[] = subtractArray(a, b, n);

        for(int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
