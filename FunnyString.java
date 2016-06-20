// Link to the problem   https://www.hackerrank.com/challenges/funny-string

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner.*;

public class Solution {
    
    public static boolean isFunny(String s, String r){
        int n=s.length();
        if(s.isEmpty())return false;
        int j=0;
        char[] c=s.toCharArray();
        char[] d=r.toCharArray();
        for(int i=1;i<n;i++){
            if(Math.abs(c[i]-c[i-1])!=Math.abs(d[i]-d[i-1]))return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int l=0;l<n;l++){
            String s=sc.next();
            String rev = new StringBuffer(s).reverse().toString();
            
            if(isFunny(s,rev))System.out.println("Funny");
            else System.out.println("Not Funny");
                                      
        }
    }
    
}
