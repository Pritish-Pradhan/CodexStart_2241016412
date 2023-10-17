/*
 * Name: Pritish Priyadarshi Pradhan
 * Reg No: 2241016412
 * PS LINK: https://cses.fi/problemset/task/1072
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q9_1072 {
    public static void main(String[] args) throws IOException {
        InputStreamReader io = new InputStreamReader (System.in);   
        BufferedReader br = new BufferedReader (io);             
        int n = Integer.parseInt(br.readLine());
        for(long i = 1; i <= (long)n; i++){
            knight(i);
        }
        br.close();  
    }
    public static void knight(long n){
        long possible = (long)(n*n*(n*n-1))/2;     //choosing 2 squares in an n*n chessboard is n*n C 2
        if(possible == 0){
            System.out.println(0);
            return;
        }
        long box23 = (n-1)*(n-2);            //no. of 2*3 box in n*n chessboard
        long box32 = (n-2)*(n-1);            //no. of 3*2 box in n*n chessboard
        long ans = possible - 2*box23 - 2*box32;
        System.out.println(ans);
    }
}
