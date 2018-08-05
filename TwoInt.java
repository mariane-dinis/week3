import java.util.Scanner;

public class TwoInt {
	
	//method to calculate if the first number is lesser than the second. 
	//If not, it prompts the user to input a new value and checks again 
	public static int checkNum(int firstNum, int secondNum) {
		Scanner scan = new Scanner(System.in);
		while(firstNum > secondNum) {
			System.out.println("The first number is not lesser than the second. Please try again." );
			String first = scan.nextLine();
			firstNum = Integer.parseInt(first);
		}
		return firstNum;
	}
	
	//method to calculate odd numbers within a certain range
	public static void odd(int firstNum, int secondNum) {
		final int step = 1;
		System.out.println("The odd numbers within the range between " + firstNum + " and " + secondNum + " are:" );
		while (firstNum< secondNum) {
			int oddNum = firstNum + step;
			if (oddNum % 2 != 0) {
				System.out.println(oddNum);
				} else {
					System.out.println(firstNum);
					
				}
			firstNum = oddNum + step;
		} 
	}
	
	//method to calculate the sum of the even numbers within a certain range
	public static void even(int firstNum, int secondNum) {
		final int step = 2;
		int total = 0;
		while (firstNum< secondNum) {
			int evenNum;
			if (firstNum % 2 == 0) {
				evenNum = firstNum;
				//System.out.println(evenNum);
				
			} else {
				evenNum = firstNum + step;
				//System.out.println(evenNum);
			}
			firstNum = evenNum + step;
			total+= evenNum;
		}

		System.out.println("The sum of even numbers within the range above is: " + total);
	}
	
	//method to output numbers from a certain range and its squares
	public static void square(int min, int max) {
		int step = 1;
		System.out.println("The squares of the numbers between " + min + " and " + max + " are:");
		while(min <= max) {
			int square = (int) Math.pow(min, 2);
			System.out.println(min + " = " + square);
			min+=step;
		}
	}
	
	//method to calculate odd numbers within a certain range and their squares
	public static void oddSquare(int firstNum, int secondNum) {
		final int step = 1;
		System.out.println("The square of odd numbers within the range between " + firstNum + " and " + secondNum + " are:" );
		while (firstNum< secondNum) {
			int oddNum = firstNum + step;
			if (oddNum % 2 != 0) {
				System.out.println(oddNum + " = " + oddNum * oddNum);
				} else {
					System.out.println(firstNum + " = " + firstNum * firstNum);
					
				}
			firstNum = oddNum + step;
		} 
	}
	
	//method to receive a string and uppercase it, printing the result
	public static void upper(String s) {
		int i=0;
		while(i<1) {
			System.out.println(s.toUpperCase());
			i++;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Please input two integers. The first one must be lesser than the second one. ");
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please input the first one: ");
		String first = scan.nextLine();
		int firstNum = Integer.parseInt(first);
		
		System.out.println("Now, the second one: ");
		String second = scan.nextLine();
		int secondNum = Integer.parseInt(second);
		firstNum = checkNum(firstNum, secondNum);
		//scan.nextLine();
		System.out.println("Now write something for a surprise at the end: ");
		String s = scan.nextLine();
		scan.close();

		
		//System.out.println(firstNum);
		//System.out.println(secondNum);
		odd(firstNum, secondNum);
		even(firstNum, secondNum);
		square(1,10);
		oddSquare(firstNum, secondNum);
		upper(s);
		
		System.exit(0);
	}

}
