
//Link to problem https://www.hackerrank.com/challenges/save-the-prisoner
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        
        
        for(int v=0;v<t;v++){
            int npri=sc.nextInt();
            int nswe=sc.nextInt();
            int sid=sc.nextInt();
            while(nswe!=0){
                if(sid<npri){
                    sid++;
                    nswe--;
                }
                else {
                    sid=1;
                    nswe--;
                }
                        
            }
            System.out.println(sid-1);
        }
    }
}
