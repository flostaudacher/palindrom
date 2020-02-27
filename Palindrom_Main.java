import java.util.Scanner;

public class Palindrom_Main {
	static Scanner sc = new Scanner(System.in);
	static String wordToCheck="";
	static String endDate=input();
	public static void main(String[] args) {
		String string=input();
		
		
		if(checkPalindrom(string))
            System.out.println(string + " is a palindrome");
        else
            System.out.println(string + " is not a palindrome");
		
	}
	
	private static boolean checkPalindrom(String s) {
		 if(s.length() == 0 || s.length() == 1)
	            return true; 
	        if(s.charAt(0) == s.charAt(s.length()-1))

	        return checkPalindrom(s.substring(1, s.length()-1));

	        return false;
	}
	
	private static String input() {
		wordToCheck = sc.nextLine();
		return wordToCheck;
	}

}
