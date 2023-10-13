/*
 * Name: Pritish Priyadarshi Pradhan
 * Reg No: 2241016412
 * PS LINK: https://cses.fi/problemset/task/1068
 */

import java.util.Scanner;

public class Q1_1068{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        sc.close();
        WeirdAlgorithm(n);
    }
    public static void WeirdAlgorithm(long n){
        System.out.print(n + " ");
        //Initialising a loop until n == 1
        while(n != 1){
            //if remainder is 0 then n is even otherwise odd
            if(n%2 == 0){
                n /= 2;
            }
            else{
                n *= 3;
                n += 1;
            }
            System.out.print(n + " ");
        }
    }
}