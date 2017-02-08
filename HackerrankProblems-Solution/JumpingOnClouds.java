// https://www.hackerrank.com/challenges/jumping-on-the-clouds

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int jump=0;
        int i=0;
        for(;i+2<n;){
            
            if(c[i+2]==0){
                i=i+2;         
            }
            else{
                i=i+1;
            }
            jump++;
        }
        if(i+1==n-1)jump++;
        
        System.out.println(jump);
    }
}
