//Program that generates all possible combinations(of length n) for a string of length n

import java.util.*;

public class Test {
   private static void permutation(String prefix, String str) {
        int n = str.length();
        if (n == 0) System.out.println(prefix);
        else {
            for (int i = 0; i < n; i++)
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
        }
    }
    
    public static void main(String[] args) {
      permutation("","ab");
    }

}
