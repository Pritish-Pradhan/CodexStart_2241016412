/*
 * Name: Pritish Priyadarshi Pradhan
 * Reg No: 2241016412
 * PS LINK: https://cses.fi/problemset/task/1070/
 */

import java.io.*;
public class permutations {
    public static void main(String[] args) throws IOException {
        InputStreamReader io = new InputStreamReader (System.in);   //as scanner was giving TLE so just copied how to use BufferReader
        BufferedReader input = new BufferedReader (io);             //Mind you,it's not cheating as I ONLY copied these two lines
        int n = Integer.parseInt(input.readLine());
        input.close();
        giveAns(n);
    }
    public static void giveAns(int n){
        if(n == 2 || n == 3){
            System.out.println("NO SOLUTION");
            return;
        }
        if(n == 4){
            System.out.println(2 + " " + 4 + " " + 1 + " " + 3);
        }
        boolean cont = true;
        StringBuilder sb = new StringBuilder();         //was using System.out to print each integer but it gave TLE
        for(int i = 1; i <= n; i += 2){                 //so used StringBuilder to only print once at the end and magically code got accepted
            sb.append(i + " ");
            if((i == n || i == n-1) && cont){
                i = 0;
                cont = false;
            }
        }
        System.out.println(sb);
    }
}
