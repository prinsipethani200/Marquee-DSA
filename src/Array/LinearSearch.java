package Array;
import java.util.*;

public class LinearSearch {
    static boolean isPresent(int target,int arr[]){
        boolean isHere = true;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == target){
                return isHere;
            }
        }
        return false;
    }

    static int indexOfVal(int target,int arr[]){
        int a = 0;
        for(int i = 0 ;i < arr.length; i++){
            if(arr[i] == target){
               return i;
            }
        }
        return -1;
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i = 0 ;i < n;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(isPresent(target,arr));
        System.out.println(indexOfVal(target,arr));

    }
}
