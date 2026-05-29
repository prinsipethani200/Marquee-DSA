package Array;

import java.util.Scanner;

public class ArrayOfTriplet {
    static void Triplet(int n, int[] arr,int rasio){
        boolean found = false;
        for(int i = 0 ; i< n ; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[j] == arr[i] * rasio && arr[k] == arr[j] * rasio) {
                        System.out.println("Triplet = [" + arr[i] + " , " + arr[j] + " , " + arr[k] + "]");
                        found = true;
                    }
                }
            }
        }
        if (!found) {
            System.out.println("No Triplet Found!");
        }
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int rasio = sc.nextInt();

        Triplet(n,arr,rasio);
    }
}
