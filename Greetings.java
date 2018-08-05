import java.util.Scanner;

public class Greetings {
	
	//method to take an integer and give an answer 
	public static void scanInt(int i) {
		if (1<= i && i <= 17)
			i = 1;
		if (18 <= i && i <=24)
			i = 2;
		switch(i) {
			case 1:
				System.out.println("Good Day");
				break;
			case 2:
				System.out.println("Good Evening");
				break;
			default:
				System.out.println("Invalid input");
				break;
		} 
		
	}
		
	public static void main(String[] args) {
		System.out.println("Enter a number between 1 and 24: " );
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		scan.close();
		scanInt(i);
		System.exit(0);
		}
}
