//Link https://www.hackerrank.com/challenges/cut-the-sticks

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static int findMin(int[] a){
        int n=a.length;
        int min=100000000;
        for(int x:a){
            if(x<min&&x!=0)min=x;
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
           for(int arr_i=0; arr_i < n; arr_i++){
                arr[arr_i] = in.nextInt();
           }
           int cutlen=0;
           int numcuts=n;
           while(numcuts>1){ 
                cutlen=findMin(arr);
                numcuts=0;
                for(int i=0;i<n;i++){
                    if(arr[i]>0){
                        arr[i]=arr[i]-cutlen;
                        numcuts++;
                    }
                }
                if(numcuts!=0)
                System.out.println(numcuts);		    
           }       
    }
}
