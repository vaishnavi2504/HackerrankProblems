// https://www.hackerrank.com/challenges/mars-exploration

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static int SOScheck(String s){
        char[] ch=s.toCharArray();
        int count=0;
        for(int i=0;i+2<ch.length;){
            if(!(ch[i]=='S'))count++;
            if(!(ch[i+1]=='O'))count++;
            if(!(ch[i+2]=='S'))count++;
            i+=3;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        System.out.println(SOScheck(S));
    }
}
