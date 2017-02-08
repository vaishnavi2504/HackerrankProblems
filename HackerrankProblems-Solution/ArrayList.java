
// https://www.hackerrank.com/challenges/java-arraylist?h_r=next-challenge&h_v=zen


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int d,q,x,y;
    
        ArrayList[] arr=new ArrayList[n];
        for(int i=0;i<n;i++){
            arr[i]=new ArrayList();
            d=in.nextInt();
            for(int j=0;j<d;j++){
                arr[i].add(in.nextInt());
            }
        }
        
        q=in.nextInt();
        for(int k=0;k<q;k++){
            x=in.nextInt();
            y=in.nextInt();
            try{
                System.out.println(arr[x-1].get(y-1));
            }
            catch(Exception e){
                System.out.println("ERROR!");
            }
        }
        
   }
}
    
