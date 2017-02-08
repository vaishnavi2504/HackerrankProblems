//https://www.hackerrank.com/challenges/ctci-ransom-note

import java.util.*;

public class Solution {
    Map<String, Integer> magazineMap;
    Map<String, Integer> noteMap;
    
    public Solution(String magazine, String note) {
        magazineMap=new HashMap<>();
        noteMap=new HashMap<>();
        
        String[] m=magazine.split("\\s+");
        String[] n=note.split("\\s+");    
                
        for(String b: m){
            if(!magazineMap.containsKey(b))magazineMap.put(b,1);
            else magazineMap.put(b,magazineMap.get(b)+1);
        }
        
        for(String a: n){
            if(!noteMap.containsKey(a))noteMap.put(a,1);
            else noteMap.put(a,noteMap.get(a)+1);
        }
        
    }
    
    public boolean solve() {
        for(String x:noteMap.keySet()){
          int a=(int)noteMap.get(x);
          int b=(int)magazineMap.get(x);
            if(!(b>=a))return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        // Eat whitespace to beginning of next line
        scanner.nextLine();
        
        Solution s = new Solution(scanner.nextLine(), scanner.nextLine());
        scanner.close();
        
        boolean answer = s.solve();
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");
      
    }
}
