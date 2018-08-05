
public class OddAndEven {

	//method to run the elements of an array of integer and print the sum of odds and even numbers
	public static void oddAndEven(Integer[] arr) {
		int num;
		int totalOdd = 0;
		int totalEven = 0;
		Integer[] oddAndEven = new Integer[2];
		for(int i = 0; i < arr.length; i++) {
			num = arr[i];
			if (num % 2 == 0) {
				totalEven = totalEven + num;
			} else {
				totalOdd = totalOdd + num;
				}
			}
		oddAndEven[0] = totalOdd;
		oddAndEven[1] = totalEven;
		System.out.println("The sum of odd numbers is: " + oddAndEven[0]);
		System.out.println("The sum of even numbers is: " + oddAndEven[1]);
		}
	
	public static void main(String[] args) {
		Integer[] randomArray = {24, 56, 35, 62, 23, 40};
		oddAndEven(randomArray);
		System.exit(0);
	}

}
