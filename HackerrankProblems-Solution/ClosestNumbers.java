// https://www.hackerrank.com/challenges/closest-numbers
//Edited: 10/30/2016

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int[] res=new int[n-1];
        for(int i=0;i<n;i++)arr[i]=sc.nextInt();        
        Arrays.sort(arr);  
        
        for(int i=0;i+1<n;i++)res[i]=arr[i+1]-arr[i];        
        Arrays.sort(res);
        
        List<Integer> st=new ArrayList<>();
        int min=res[0];
        for(int i=0;i+1<n;i++){
            if(arr[i+1]-arr[i]==min){
                st.add(arr[i]);
                st.add(arr[i+1]);
            }
        }        
        for(int x: st){
            System.out.print(x+" ");
        }
    }
}
