package StringExcercise;

public class FirstOccurence {
	public static void main(String[] args) {
		String str = "Shubham";
		 findFirstOccurence(str);
	}

	public static int findFirstOccurence(String str) {
		str = str.substring(4,6);
		int result = str.indexOf("b");
		System.out.println("Given substring is:"+result);
		return result;
		
		
	}

}
