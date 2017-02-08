import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static int numDel(String a, String b){
      char[] c1=new char[26];
      char[] c2=new char[26];
        for(int i=0;i<a.length();i++){
           char c=a.charAt(i);
           c1[c-'a']++;
        }
        
        for(int i=0;i<b.length();i++){
           char c=b.charAt(i);
           c2[c-'a']++;
        }
        
        int count=0;
        for(int i=0;i<26;i++){
          count+=Math.abs(c1[i]-c2[i]);
        }
        return count;
    }    

    public static void main(String[] args) {
    
        String s1=sc.next();
        String s2=sc.next();
        
        System.out.println(numDel(s1,s2));
       
    }
}
