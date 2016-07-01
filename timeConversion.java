//Link to the problem https://www.hackerrank.com/challenges/time-conversion

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        String hr=time.substring(0,2);
        String min=time.substring(3,5);
        String sec=time.substring(6,8);
        String x=time.substring(8,10);
        int ans;
        if(x.equals("PM")){
            ans=Integer.parseInt(hr);
            ans+=12;
            hr=ans+"";
        }
        else{
            if(hr.equals("12")){
                hr="00";
            }
            else;
        }
        String sol=hr+":"+min+":"+sec;
        System.out.println(sol);
        
    }
}
