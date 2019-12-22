package _01_Bit_Shifting;

public class BitShifter {
	public static void main(String[] args) {
		// 1. Jot down the value of num in binary.
		int num = 190;
		int numShifted = 255;
		StringBuffer b = new StringBuffer();
		
		while(num>0) {
			b.append(num%2);
			num = num/2;
		}
				System.out.println(b);
		// 2. Print the value of numShifted, and convert that value to binary.

		// 3. Compare the two binary values. Can you figure out what the << operator is for?
		StringBuffer t = new StringBuffer();
		
		while(numShifted>0) {
			t.append(numShifted%2);
			numShifted = numShifted/2;
		}	System.out.println(t);
				
		// 4. Try shifting num 3 places.
		
		// FYI: Binary values can be shifted to the right as well using the >> operator.	
	}
}
