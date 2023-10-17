/*
 * Name: Pritish Priyadarshi Pradhan
 * Reg No: 2241016412
 * PS LINK: https://cses.fi/problemset/task/1754
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q8_1754 {
    public static void main(String[] args) throws IOException {
        InputStreamReader io = new InputStreamReader (System.in);   
        BufferedReader br = new BufferedReader (io);             
        int t = Integer.parseInt(br.readLine());   
        for(int i = 0; i < t; i++){
            String[] s=br.readLine().split(" ");         
            int left  = Integer.parseInt(s[0]);
            int right = Integer.parseInt(s[1]);
            coin(left,right);
        }    
        br.close();
    }
    public static void coin(int left,int right){
        if(Math.abs(left-right) > (int)Math.min(left, right) || (left+right) % 3 != 0){     //from observation it's clear that sum should be divisible by 3
            System.out.println("NO");                       //and their difference could be atmost the minimum b/w two numbers.
            return;                                             //E.g : 8,4 ; 9,18 .....where only number is substacted by 2 and the other by 1 
        }                                                        //if the difference is greater, then it will lead to no possible solution and for difference less than that it is possible but again we have to check if their sum is divisible by 3 
        System.out.println("YES");
    }
}
