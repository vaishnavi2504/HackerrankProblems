//Link to the problem  https://www.hackerrank.com/challenges/icecream-parlor

//Not very efficient

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void findIndx(int amt, int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==amt){
                    i++;
                    j++;
                    System.out.println(i+" "+j+"");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        
        for(int i=0;i<t;i++){
            int amt=sc.nextInt();
            int fl=sc.nextInt();
            int[] arr=new int[fl];
            for(int j=0;j<fl;j++){
                arr[j]=sc.nextInt();
            }
            findIndx(amt,arr);
        }
      
    }
}
