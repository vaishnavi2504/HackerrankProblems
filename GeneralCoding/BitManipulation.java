//Repository of Bit Manipulation code


//Solution for bit manipulation problem from page 58 of cracking coding interview t swap even and odd bits

	public static swapBits(int n){
		//seperate even bits
		unsigned int ebit = n&0xAAAAAAAAA;
		//seperate odd bits
		unsigned int obit = n&0x555555555;
		
		//right shift even bits by 1 bit
		ebit= ebit>>1;
		
		//Left shift odd bit by 1 bit
		obit= obit<<1;
		
		return (ebit|obit);
		
		
		
	}
//Method to count the number of bits set in a given integer

	public static int numOfBitsset(int a){
  		int count=0;
  		while(a!=0){
  			count+=a&0x01;
  			a= a >> 1;
  		}
  		return count;
	}


//Method the counts the no. of bits required to transform from one int to another int
public static int numOfBits(int a, int b){
		int counter = 0;

		while (a != b)
		{
			counter = counter + ((a & 0x01) ^ (b & 0x01));
			a = a >> 1;
			b = b >> 1;
		}
		return counter;
		
}
