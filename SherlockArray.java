//Link to the problem-- https://www.hackerrank.com/challenges/sherlock-and-array

// Yet to fix 2 test cases

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static boolean sherlock(int[] arr,int idx){
        int n=arr.length;
        int l=idx-1,r=idx+1,rsum=0,lsum=0;
        while(l>-1){
            lsum+=arr[l--];
        }
        while(r<n){
            rsum+=arr[r++];
        }
        
        
          if(lsum==rsum)return true;
          if(idx<n){
              return sherlock(arr,idx+1);
          }
           else
               return false;
        
    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int v=0;v<t;v++){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
               if(sherlock(arr,0))System.out.println("YES");
               else System.out.println("NO");
            
            
        }
    }
}
