//https://www.hackerrank.com/challenges/the-love-letter-mystery


import java.io.*;
import java.util.*;

public class Solution {
    
    public int checkTrans(String s){
        char[] c=s.toCharArray();
        int n=c.length;
        int count=0;
        for(int i=0;i<n;i++){  
                while(c[i]>c[n-1-i]){
                    count++;
                    c[i]--;
                }              
                while(c[i]>c[n-1-i]){
                        count++;
                        c[n-1-i]--;
                }  
        }
        return count;
    }
    
    
    public boolean isPalindrome(String s){
        char[] c=s.toCharArray();
        int n=c.length;
        for(int i=0;i<n;i++){
            if(c[i]!=c[n-1-i])return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution sobj=new Solution();
        Scanner sc=new Scanner(System.in);
        int numOfTestCases=sc.nextInt();
        while(numOfTestCases!=0){
            String s=sc.next();
            if(sobj.isPalindrome(s)){
                System.out.println("0");
            }else{
                System.out.println(sobj.checkTrans(s));
            }
            numOfTestCases--;
        }
    }
}
