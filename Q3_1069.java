/*
 * Name: Pritish Priyadarshi Pradhan
 * Reg No: 2241016412
 * PS LINK: https://cses.fi/problemset/task/1069
 */

import java.util.Scanner;

public class Repetetion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.next();
        
        sc.close();
        findLongest(line);
    }
    public static void findLongest(String line){
        int i = 1;
        int cnt = 1;
        int max = 1;
        while(i < line.length()){
            if(line.charAt(i) == line.charAt(i-1)){         //check if char at i == previous char
                cnt++;                                      //if true add it to frequency count
            }
            else{                                           //when the char at i is different store the value of cnt and compare with max
                if(cnt > max){
                    max = cnt;
                }
                cnt = 1;                                    //reset the value of cnt
            }
            i++;
        }
        if(cnt > max){                                      //if the substring doesnot terminate due to same char at end check cnt with max
            max = cnt;
        }
        System.out.println(max);
    }
}
