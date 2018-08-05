import java.util.Scanner;

public class LettersAndNumbers {
	
	//method to take an integer and give an answer 
		public static void scanInt(int i) {
			if (0<= i && i <= 9) {
				System.out.println(i);
			}
			else if (10 <= i && i <=35) {
			switch(i) {
				case 10:
					System.out.println("a");
					break;
				case 11:
					System.out.println("b");
					break;
				case 12:
					System.out.println("c");
					break;
				case 13:
					System.out.println("d");
					break;
				case 14:
					System.out.println("e");
					break;
				case 15:
					System.out.println("f");
					break;
				case 16:
					System.out.println("g");
					break;
				case 17:
					System.out.println("h");
					break;
				case 18:
					System.out.println("i");
					break;
				case 19:
					System.out.println("j");
					break;
				case 20:
					System.out.println("k");
					break;
				case 21:
					System.out.println("l");
					break;
				case 22:
					System.out.println("m");
					break;
				case 23:
					System.out.println("n");
					break;
				case 24:
					System.out.println("o");
					break;
				case 25:
					System.out.println("p");
					break;
				case 26:
					System.out.println("q");
					break;
				case 27:
					System.out.println("r");
					break;
				case 28:
					System.out.println("s");
					break;
				case 29:
					System.out.println("t");
					break;
				case 30:
					System.out.println("u");
					break;
				case 31:
					System.out.println("v");
					break;
				case 32:
					System.out.println("w");
					break;
				case 33:
					System.out.println("x");
					break;
				case 34:
					System.out.println("y");
					break;
				case 35:
					System.out.println("z");
					break;
				}
					
			}
			else {
					System.out.println("Invalid input");
			} 
		}

	public static void main(String[] args) {
		System.out.println("Enter a number between 0 and 35: " );
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		scan.close();
		scanInt(i);
		System.exit(0);
		}

}
