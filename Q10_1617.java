/*
 * Name: Pritish Priyadarshi Pradhan
 * Reg No: 2241016412
 * PS LINK: https://cses.fi/problemset/task/1617
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Q10_1617 {
    public static void main(String[] args) throws IOException {
        InputStreamReader io = new InputStreamReader (System.in);   
        BufferedReader br = new BufferedReader (io);             
        int n = Integer.parseInt(br.readLine());
        bitString(n);
    }
    public static void bitString(int n){
        BigInteger base = new BigInteger("2");      //as in int and long it can't be stored
        BigInteger ans = base.pow(n);
        BigInteger modulo = new BigInteger("1000000007");
        ans = ans.mod(modulo);
        System.out.println(ans);
    }
}
