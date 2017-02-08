import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    
    public static boolean isPalindrome(String a){
        char[] c=new char[26];
        for(int i=0;i<a.length();i++){
            char x=a.charAt(i);
            c[x-'a']++;
        }
        int oddcnt=0;
        for(char v:c){
            if(oddcnt>1)return false;
            if(v%2==1)oddcnt++;
        }
        return true;
        
    }

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        String ip = myScan.nextLine();
       
        if(isPalindrome(ip))System.out.println("YES");        
        else System.out.println("NO");
        
    }
}
