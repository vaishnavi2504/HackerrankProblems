// Pgm to identify the number of bits set in a given number

public class Test{
  public static void main(String[] args){
    int n=5;
    int count=0;
    while(n!=0){
      n=n&(n-1);
      count++;
    }
    System.out.println(count);
  }
}
