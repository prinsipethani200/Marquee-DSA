package Array;

import java.util.Scanner;

public class ArrayOfTriplet {
//    static void Triplet(int n, int[] arr,int rasio){
//        boolean found = false;
//        for(int i = 0 ; i< n ; i++) {
//            for (int j = i + 1; j < n; j++) {
//                for (int k = j + 1; k < n; k++) {
//                    if (arr[j] == arr[i] * rasio && arr[k] == arr[j] * rasio) {
//                        System.out.println("[" + arr[i] + " , " + arr[j] + " , " + arr[k] + "]");
//                        found = true;
//                    }
//                }
//            }
//        }//1 2 6 18 54
//        if (!found) {
//            System.out.println("No Triplet Found!");
//        }
//    }

    static void triplet(int[] arr,int n){

        for(int j = 1 ; j < n ; j++){
            int i = j + 1;
            while(i >= 0){
                int k = j + 1;
                while(k < n){
                    if(arr[j] * arr[j] == arr[i] * arr[k]){
                        System.out.println("["+arr[i]+" "+arr[j]+" "+arr[k]+"]");
                    }
                    k++;
                }
                i--;
            }
        }
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        //int rasio = sc.nextInt();

        //Triplet(n,arr,rasio);
        triplet(arr,n);
    }
}
