package Array;
import java.util.*;

//Subtracting 2 different array of different size, borrow concept
public class ArraySubtraction {
    static int[] subtractArray(int arr[], int brr[], int n,int m) {
        String num1 = "";
        for(int num:arr){
            num1 += num;
        }
        String num2 = "";
        for(int num:brr){
            num2 += num;
        }
        int num3 = Integer.parseInt(num1);
        int num4 = Integer.parseInt(num2);
        int res = num3 - num4;

        String s = String.valueOf(res);

        int[] ans = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            ans[i] = s.charAt(i) - '0';
        }

        return ans;
    }

    static void main() {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[] = new int[n];

        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int b[] = new int[m];
        for(int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        int ans[] = subtractArray(a, b, n,m);

        for(int i = 0; i < (Math.max(n,m)); i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
