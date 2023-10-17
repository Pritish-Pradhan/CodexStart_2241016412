/*
 * Name: Pritish Priyadarshi Pradhan
 * Reg No: 2241016412
 * PS LINK: https://cses.fi/problemset/task/1618
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q7_1618 {
    public static void main(String[] args) throws IOException {
        InputStreamReader io = new InputStreamReader (System.in);   
        BufferedReader br = new BufferedReader (io);             
        int n = Integer.parseInt(br.readLine());
        zeroes(n);
        br.close();  
    }
    public static void zeroes(int n){
        int sum = 0;
        while(n != 0){
            sum = sum + n/5;
            n /= 5;
        }
        System.out.println(sum);
    }
}
