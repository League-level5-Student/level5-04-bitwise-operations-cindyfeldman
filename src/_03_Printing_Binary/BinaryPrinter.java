package _03_Printing_Binary;

public class BinaryPrinter {
	//Complete the methods below so they print the passed in parameter in binary.
	//Use bit shifting and bit masking to print the binary numbers.
	//Do not use the Integer.toBinaryString method!
	//Don't be afraid to use the methods that are already complete to finish the others.
	//Create a main method to test your methods.
	public static void main(String[] args) {
		printByteBinary((byte) 10110010);
		printShortBinary((short) 22121);
		printIntBinary(44);
		printLongBinary(254092);
	}
	public static void printByteBinary(byte b) {
		StringBuffer s = new StringBuffer();
		while(b>0) {
			s.append(b%2);
			b = (byte) (b/2);
		
		}
		System.out.println(s.reverse());
		
	}
	
	public static void printShortBinary(short s) {
		StringBuffer t = new StringBuffer();
		while(s>0) {
				t.append(s%2);
			s = (short) (s/2);
		
		}
		System.out.println(t.reverse());
		
	}
	
	public static void printIntBinary(int i) {
		StringBuffer s = new StringBuffer();
		while(i>0) {
			s.append(i%2);
			i = i/2;
		
		}
		System.out.println(s.reverse());
		
	}
	
	public static void printLongBinary(long l) {
		StringBuffer s = new StringBuffer();
		while(l>0) {
			s.append(l%2);
			l = l/2;
		
		}
		System.out.println(s.reverse());
		
	}
	}

