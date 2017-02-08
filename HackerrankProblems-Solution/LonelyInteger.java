//Link to the problem  https://www.hackerrank.com/challenges/lonely-integer

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
 
     private static int lonelyInteger(int[] a) {
         if(a.length==1)return a[0];
         for(int i=0;i<a.length;i=i+2){
                          
             if(i>=a.length-1)return a[i];
             
             if(a[i]!=a[i+1])return a[i];
         }
         return -1;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i< n; i=i+1) {
            a[i] = in.nextInt();
        }
        Arrays.sort(a);
        
        
        System.out.println(lonelyInteger(a));
    }

}
