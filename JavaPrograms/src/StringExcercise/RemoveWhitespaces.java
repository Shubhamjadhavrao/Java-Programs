package StringExcercise;

public class RemoveWhitespaces {
	public static void main(String[] args) {
		String s1 = "MS DHONI";
		removeSpaces(s1);
	}

	public static void removeSpaces(String s1) {
	
		s1 = s1.trim().replaceAll(" ", "");
		System.out.println("After remove spaces:"+s1);
	}

}
