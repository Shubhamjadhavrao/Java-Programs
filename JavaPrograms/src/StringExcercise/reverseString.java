package StringExcercise;

public class reverseString {

	public reverseString() {

	}

	public static void main(String[] args) {
		String input = "SHUBHAM";
		System.out.println("using StringBuilder:"+ StringBuilder(input));
		System.out.println("using StringBuffer:"+ StringBuffer(input));
		
		System.out.println("String Reverse is:" + stringReverse1(input));

//way 1
	}
public static String StringBuffer(String input) {
		// TODO Auto-generated method stub
	StringBuffer sbr = new StringBuffer(input);
	sbr.reverse();
	System.out.println(sbr);
		
	return input;
	}

//way 2
public static String StringBuilder(String input) {
		// TODO Auto-generated method stub
	StringBuilder input1 = new StringBuilder();
	input1.append(input);
	
	input1.reverse();
	
	System.out.println(input1);
	return input;
	
		
	}

//way3
	public static String stringReverse1(String s) {
		char[] r = s.toCharArray();
		char[] reversedStringr = new char[s.length()];
		int count = 0;

		for (int i = r.length - 1; i >= 0; i--) {
			reversedStringr[count] = r[i];
			count++;
		}
		return new String(reversedStringr);
	}
	
	
	

}
