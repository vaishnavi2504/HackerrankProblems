//https://www.hackerrank.com/challenges/ctci-making-anagrams

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static int numberNeeded(String first, String second) {
      char[] c1=first.toCharArray();
      char[] c2=second.toCharArray();
        int numDeletions=0;
        Arrays.sort(c1);
        Arrays.sort(c2);
        int j=0;
        int i=0;
                  
            for(;i<c1.length&&j<c2.length;){
                if(c1[i]>c2[j]){
                    j++;
                    numDeletions+=1;
                }
                else if(c1[i]<c2[j]){
                    i++;
                    numDeletions+=1;
                }
                else{
                    i++;
                    j++;
                }
            }
        while(i<c1.length){
            i++;
            numDeletions+=1;
        }
        
        while(j<c2.length){
            j++;
            numDeletions+=1;
        }
        
        return numDeletions;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
       
        System.out.println(numberNeeded(a,b));
    }
}
