package Array;
import java.util.*;

public class ArrayisPalidrome {

    static String isPalidrome(String[] arr, int n) {
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            if (!arr[i].equals(arr[j])) {
                return "Not Palindrome";
            }
            i++;
            j--;
        }

        return "Palindrome";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String[] s = new String[n];

        for (int i = 0; i < n; i++) {
            s[i] = sc.nextLine();
        }

        System.out.println(isPalidrome(s, n));
    }
}