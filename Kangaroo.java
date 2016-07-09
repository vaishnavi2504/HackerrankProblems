//Link to the problem  https://www.hackerrank.com/challenges/kangaroo


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        int diff=100;
        int a=x1,b=x2;
        if(x1!=x2&&v1==v2){
            System.out.println("NO");
                return;
        }
//Link to the problem  https://www.hackerrank.com/challenges/kangaroo        while(diff!=0){
            diff=Math.abs(a-b);
            a+=v1;
            b+=v2;
            if(Math.abs(a-b)>diff){
                System.out.println("NO");
                return;
            }
            if(Math.abs(a-b)==0){
                System.out.println("YES");
                return;
            }
        }
        
    }
}
