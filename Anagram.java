// Link to Question https://www.hackerrank.com/challenges/anagram

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static int frqCheck(String s){
       int n=s.length();
        if(n%2==1)return -1;
       char[] c1=new char[26];
       char[] c2=new char[26];
       
        for(int i=0;i<n/2;i++){
            char x=s.charAt(i);
            c1[x-'a']++;
        }
        
         for(int i=n/2;i<n;i++){
            char x=s.charAt(i);
             c2[x-'a']++;
        }
        int count=0;
        for(int z=0;z<26;z++){
            count+=Math.abs(c1[z]-c2[z]);
        }
       return count/2;
    }
    
   
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int v=0;v<n;v++){
            String str=sc.next();
            System.out.println(frqCheck((str)));
        }
        
        
    }
}
