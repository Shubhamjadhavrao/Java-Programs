package StringExcercise;

public class ReplaceChar {
	public static void main(String[] args) {
		String s = "saiyavardhan";
		replace(s);
	}

	public static void replace(String s) {
		System.out.println("After char replacement:"+ s.replaceAll("i", "t"));
		
	}

}
