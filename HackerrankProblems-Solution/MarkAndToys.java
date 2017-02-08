//Link to the problem https://www.hackerrank.com/challenges/mark-and-toys

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner stdin=new Scanner(System.in);
        int n=stdin.nextInt(),k=stdin.nextInt();
        int prices[]=new int[n];
        for(int i=0;i<n;i++) prices[i]=stdin.nextInt();
        
        int answer = 0,sum=0;
        Arrays.sort(prices);
        for(int x:prices){
            if(sum<k){
                sum=sum+x;
                if(sum<k)answer++;
                else System.out.println(answer);
            }
        }
        
    }
}
