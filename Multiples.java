
public class Multiples {

	//method to take two numbers and check if they are multiples of a given one
	//and print each multiple in the range
	public static void multiples(int min, int max, int i) { 
		while (min <= max) {
			if (min % i == 0){
				System.out.println(min);
				min = min + i;
			}
		}
	}
	
	public static void main(String[] args) {
		int min = 10;
		int max = 95;
		int mult = 5;
		System.out.println("The multiples of " + mult + " in the range between " + min + " and " + max + " are:");
		multiples(min, max, mult);
		System.exit(0);
	}
}
