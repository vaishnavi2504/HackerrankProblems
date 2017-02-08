// https://www.hackerrank.com/challenges/strange-code
// Works only upto the max value of long 

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long t = in.nextLong();
        t--;
		//Lower index
		long l=0;
		//Higher index
		long h=2;
		long cycle=3;
		for(int i=0;i<t;i++){
  			if(h<t){
  				l=l+cycle;
  				cycle=2*cycle;
  				h=h+cycle;
  			}
  			else{		
    			 long ans=cycle;
           while(l<t){
              ans--;
              l++;
           }
            System.out.println(ans);
            return;
  	}
    }
  }
}

