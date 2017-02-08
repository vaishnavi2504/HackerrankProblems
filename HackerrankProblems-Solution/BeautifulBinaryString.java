/** Link to the problem https://www.hackerrank.com/challenges/beautiful-binary-string
  @author: Vaishnavi Bhat
  Date 09/08/2016
**/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String B = in.next();
        char[] ch=B.toCharArray();
        int count=0;
        for(int i=0;i+2<ch.length;){
            if(ch[i]=='0'&&ch[i+1]=='1'&&ch[i+2]=='0'){
                ch[i+2]='1';
                count++;
                i=i+3;
            }
            else
                i=i+1;
        }
       System.out.println(count);
    }
}
