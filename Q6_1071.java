/*
 * Name: Pritish Priyadarshi Pradhan
 * Reg No: 2241016412
 * PS LINK:https://cses.fi/problemset/task/1071/
 */

import java.io.BufferedReader;
import java.io.IOException; 
import java.io.InputStreamReader;
  
public class Q6_1071 {
    public static void main(String[] args) throws IOException{
        InputStreamReader io = new InputStreamReader (System.in);   
        BufferedReader br = new BufferedReader (io);             
        int t = Integer.parseInt(br.readLine());   
        for(int i = 0; i < t; i++){
            String[] s=br.readLine().split(" ");         
            int y  = Integer.parseInt(s[0]);
            int x = Integer.parseInt(s[1]);
            spiral(y,x);   
        }
    }
    public static void spiral(int y,int x){
        long ans = 1;
        long max = (long)Math.max(y, x);
        long dValue = max*max - max + 1;      //From observation,diagonal of the spiral can be expressed like this.E.g= row[3]col[3] = 3*3 - 3 + 1 
        if(max % 2 == 0){   // if its even then for row < max, then ans = dValue-(max-y) and if col < max,then ans = dValue+(max-x) 
            if(y < (int)max){
                ans = dValue-(max-y);
            }
            else{
                ans = dValue+(max-x);
            }
        }
        else{   //now it,s odd => if row < max,then ans = dValue+(max-y) and if col < max , then ans = dvalue-(max-x)
            if(y < (int)max){
                ans = dValue+(max-y);
            }
            else{
                ans = dValue-(max-x);
            }
        }
        System.out.println(ans);
    }
}
