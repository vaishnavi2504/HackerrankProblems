//https://www.hackerrank.com/contests/w30/challenges/find-the-minimum-number/submissions/code/1300951611

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static String genFunction(int n){
        StringBuilder res=new StringBuilder();            
        if(n==2){
            res.append("min(int, int)");
            return res.toString();
        }else{
            StringBuilder s=new StringBuilder();
            s.append("min(int, ");
            s.append(genFunction(n-1));
            s.append(")");
            return s.toString();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String ans=genFunction(n);
        System.out.println(ans);
    }
}
