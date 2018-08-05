
public class AddUp {

	//method to take two numbers and add each one of them, ex: 1 + 2 + 3
	public static int add(int min, int max) { 
		int i = 1;
		int add = 0;
		while (min <= max) {
			add = min + add;
			min = min + i;
			}
		return add;
		}
	
	public static void main(String[] args) {
		int min = 1;
		int max = 10;
		int total = add(min, max);
		System.out.println("The sum of " + min + " to " + max + " is " + total);
		System.exit(0);
	}

}
