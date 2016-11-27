//https://www.hackerrank.com/challenges/equality-in-a-array

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       int n=in.nextInt();
       int[] arr=new int[n];
        Map<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
            if(!hm.containsKey(arr[i]))hm.put(arr[i],1);
            else{
                hm.put(arr[i],hm.get(arr[i])+1);
            }
        }
        int max=0;
        for(int x:hm.keySet()){
            if(hm.get(x)>max)max=hm.get(x);
        }
        System.out.println(n-max);
        
    }
}
