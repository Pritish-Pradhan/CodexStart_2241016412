/*
 * Name: Pritish Priyadarshi Pradhan
 * Reg No: 2241016412
 * PS LINK: https://cses.fi/problemset/task/1094
 */

import java.util.Scanner;

public class Q4_1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        minOperation(arr,n);
    }
    
    public static void minOperation(int[] arr, int n){
        long min = 0;
        for(int i = 1; i < n; i++){
            if(arr[i] < arr[i-1]){              //observe that if the element is not equal to element in previous index
                min = min + (arr[i-1] - arr[i]);    //Then min operations required will be their difference as in each operation only 1 can be added
                arr[i] = arr[i-1];                  //After operations set them equal as arr[i]'s value need to be updated
            }
        }
        System.out.println(min);
    }
}
