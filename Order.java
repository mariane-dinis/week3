import java.util.Scanner;
import java.util.Arrays;

public class Order {
	
	//method to take an integer to be the size of the array 
	//and prompt the user to input integers in such array
	//returns the array
	public static Integer[] inputNum(int i){
		Integer[] arrayNum = new Integer[i];  
		Scanner scanner = new Scanner(System.in);
		for(int j = 0;j< i ;j++){
			System.out.println("Insert an integer number: ");
			int num = scanner.nextInt();
			arrayNum[j] = num;
		}
		scanner.close();
		return arrayNum;	
	}
	
	//method to print an array
	public static void printArray(Integer[] arr) {
		for (int i=0; i<arr.length; i++) {
	        System.out.print(arr[i]+" ");
	    }
	}
	
	//method to sort an array in ascending order
	//and print the result
	//note: sort is a void method
	public static void sortArray(Integer[] arr) {
		Arrays.sort(arr);
		printArray(arr);
	}
	
	public static void main(String[] args) {
		int repeat = 3;
		Integer[] randomArray = inputNum(repeat);
		sortArray(randomArray);	
		System.exit(0);
	}
}
