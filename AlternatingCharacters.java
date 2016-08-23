/*
@author Vaishnavi Bhat

Link to the problem-  https://www.hackerrank.com/challenges/alternating-characters
**/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static int numDel(String s){
        int count=0;
        for(int i=0;i+1<s.length();i++){
            if(s.charAt(i)==s.charAt(i+1))count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int v=0;v<t;v++){
            String ip=sc.next();
            System.out.println(numDel(ip));
        }
    }
}
