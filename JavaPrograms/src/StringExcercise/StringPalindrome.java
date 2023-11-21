package StringExcercise;

import java.util.Scanner;

public class StringPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		System.out.println(isPalindrome(s1));
	}

	public static String isPalindrome(String s1) {
		 String s = "";
		 for(int i= s1.length()-1;i>=0; i--) 
			 s = s+s1.charAt(i);
		 if(s.equals(s1)) 
			 return "Enter string is palindrome";
		 else
			 return "Enter string is not palindrome";
		 }
			 
		}		
		


