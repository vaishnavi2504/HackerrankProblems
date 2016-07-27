// https://www.hackerrank.com/challenges/camelcase

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int camelCaseCount(String str1){
        String sub="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int count=0;
        for(int i=0;i<str1.length();i++){
			if(sub.contains(str1.substring(i,i+1)))count++;
		}
        return count+1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(camelCaseCount(s));
    }
}
