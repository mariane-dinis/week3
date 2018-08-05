import java.util.Scanner;

public class Frame {

	//method to calculate the frame type price
	public static double frameType(String frameType, double lenght, double width) {
		double fancyPrice = 0.25; //per inch
		double regularPrice = 0.10; //per inch
		double frameSize = (lenght * 2) + (width * 2);
		double price = 0;
		if (frameType.equals("fancy")) {
			price = frameSize * fancyPrice ;
		} else {
		    price = frameSize * regularPrice;
		}
		return price;
	}
	
	//method to calculate the extra price, depending on the colour frame
	public static double colour(String colour, double lenght, double width) {
		double colourPrice = 0.10; //per inch
		double price = 0;
		if (!colour.equals("white")) {
			price = ((lenght * colourPrice)* 2) + ((width * colourPrice)* 2);
		} 
		return price;
	}
	
	//method to calculate the optional crowns
	public static double crowns(int crowns) {
		double crownPrice = 0.35;
		double price;
		if (crowns == 0) {
			price = 0;
		} else {
			price = crowns * crownPrice;
		} 
		return price;
	}
	
	//method to calculate the total price
	public static double quote(double priceFrameType, double colourPrice, double crownPrice) {
		double priceTotal = priceFrameType + colourPrice + crownPrice;
		return priceTotal;
	}
	
	public static void main(String[] args) {
		System.out.println("********************************");
		System.out.println("* Welcome to the Framing Store *");
		System.out.println("********************************");
		System.out.println("Please inform the frame you want to get our price quote:");
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1. What is the length of the picture, in inches?");
		double length = scan.nextDouble();
		
		System.out.println("2. What is the width of the picture, in inches?");
		double width = scan.nextDouble();
		
		System.out.println("3. What is the type of the frame?");
		String frameType = scan.next().toLowerCase();
		
		System.out.println("4. What is the colour of the frame?");
		String colour = scan.next().toLowerCase();
		
		System.out.println("5. How many crowns do you want?");
		int crowns = scan.nextInt();
		scan.close();
		
		double priceFrameType = frameType(frameType, length, width);
		//System.out.println(priceFrameType);
		double priceColour = colour(colour,length, width);
		//System.out.println(priceColour);
		double crownPrice = crowns(crowns);
		//System.out.println(crownPrice);
		double quote = quote(priceFrameType, priceColour, crownPrice);
		System.out.println("Our quote for this frame is AUD " + quote);
		System.exit(0);
	}

}
