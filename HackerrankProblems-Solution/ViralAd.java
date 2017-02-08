//https://www.hackerrank.com/challenges/strange-advertising

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int res=0;        
        int ip=5,op;
        while(n!=0){
            op=ip/2;
            res+=op;
            ip=op*3;
            n--;
        }
        System.out.println(res);
    }
}
