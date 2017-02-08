//https://www.hackerrank.com/challenges/mini-max-sum

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);        
        long tot=0;
        long[] arr=new long[6];
        for(int i=0;i<5;i++){
            arr[i]=in.nextLong();
            tot+=arr[i];
        }  
       
        long sum=0,max=tot-arr[0];
        long min=max;
        for(int i=1;i<5;i++){
            sum=tot-arr[i];
            if(sum<min)min=sum;
            if(sum>max)max=sum;           
        }
        System.out.print(min+" "+max);
    }
}
