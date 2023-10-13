/*
 * Name: Pritish Priyadarshi Pradhan
 * Reg No: 2241016412
 * PS LINK: https://cses.fi/problemset/task/1083
 */

import java.util.*;
public class Q2_1083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n-1];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        CyclicSort(arr);
        MissingAlgorithm(arr,n);
    }
    public static void MissingAlgorithm(int[] arr,int n){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != (i+1)){
                System.out.println(i+1);
                return;
            }
        }
       System.out.println(n);
    }
    public static void CyclicSort(int[] arr){
        int index = 0;
        while(index < arr.length){
            int cIndex = arr[index] - 1;    //correct index of the array element after sorting
            if(arr[index] < arr.length && arr[index] != arr[cIndex]){
                int temp = arr[index];
                arr[index] = arr[cIndex];
                arr[cIndex] = temp;
            }
            else{
                index++;
            }
        }
    }
}
