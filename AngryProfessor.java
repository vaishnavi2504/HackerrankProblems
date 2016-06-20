import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static boolean chkCancel(int[] arr, int k){
        int count=0;
        for(int x: arr){
            if(x<=0)count++;
        }
        if(count>=k)return true;
        else return false;
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
            for(int a0 = 0; a0 < t; a0++){
                int n = in.nextInt();
                int k = in.nextInt();
                int a[] = new int[n];
                for(int a_i=0; a_i < n; a_i++){
                    a[a_i] = in.nextInt();
                }
                if(chkCancel(a,k))System.out.println("NO");
                else System.out.println("YES");

            }
    }
}
