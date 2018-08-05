
public class HeadAndTails {
	
	//Method to random sort head or tails for a given number of times
	//As random returns double, in order to make it more fun, I used
	//a rounding of 0.5 to tails
	public static void headAndTails(int times) {
		int tails = 1;
		for(int i = 0; i< times; i++) {
			double randomNumber = Math.random();
			if (randomNumber == tails || randomNumber > 0.5) {
				System.out.println("Tails");
			} else {
				System.out.println("Head");
			}
			//System.out.println(randomNumber); 
		}
	}

	public static void main(String[] args) {
		int times = 10;
		headAndTails(times);
		System.exit(0);
	}

}
