import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Set<Character> base=new HashSet<Character>();
        
        
            char[] cnt=new char[26];
            for(char c='a';c<='z';c++){
                base.add(c);
            }
        
            for(int v=0;v<n;v++){
                Set<Character> curr=new HashSet<Character>();
                String str=sc.next();
                char[] ip=str.toCharArray();
                for(int k=0;k<ip.length;k++){
                    curr.add(ip[k]);
                }
                
                //adds intersection of 2 sets
                base.retainAll(curr);
                
            }
        
            System.out.println(base.size());
    }
}
