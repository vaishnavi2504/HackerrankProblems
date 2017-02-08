//https://www.hackerrank.com/challenges/sock-merchant

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count=0;
        int n = in.nextInt();
        int c[] = new int[n];
        Map<Integer,Integer> hm=new HashMap<>();
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
            if(!hm.containsKey(c[c_i])){
                hm.put(c[c_i],1);
            }else{
                hm.put(c[c_i],hm.get(c[c_i])+1);
            }
        }
        for(int x:hm.keySet()){
            if(hm.get(x)>=2){
                count+=hm.get(x)/2;
            }
        }
        System.out.println(count);
    }
}
