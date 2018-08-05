import java.util.Scanner;

public class Palindrome {	
	//Method to check if a word is a palindrome
	public static void checkPalindrome(String s)
	  {
	    // reverse the given String
	    String reverse = new StringBuffer(s).reverse().toString();
	 
	    // check whether the string is palindrome or not
	    if (s.equals(reverse))
	      System.out.println(s + " is a palindrome");
	 
	    else
	      System.out.println(s + " is not a palindrome");
	  } 	

    public static void main(String[] args) {
    	System.out.println("Palindrome checker");
		System.out.println("==================");
		System.out.println("Enter the string to be checked: " );
		Scanner scanner = new Scanner(System.in);
		String word = scanner.nextLine().toLowerCase();
		scanner.close();
		checkPalindrome(word);
		System.exit(0);
	}
	    
}
