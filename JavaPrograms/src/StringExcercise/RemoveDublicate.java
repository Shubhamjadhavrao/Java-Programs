package StringExcercise;

public class RemoveDublicate {
	public static void main(String[] args) {
		String str = "AABCB";
		
		String result=removeDubliucates(str);
		
		System.out.println("Original String:" + str);
		System.out.println("After removing dublicate:" + result);
	}

	public static String removeDubliucates(String s) {
		
		StringBuilder result = new StringBuilder();
		
		for(int i= 0; i < s.length();i++) {
			char givenChar = s.charAt(i);
//			
			if(result.indexOf(String.valueOf(s.charAt(i))) == -1){
				result.append(givenChar);
			}
		}
		return result.toString();
		
		
	}

}
