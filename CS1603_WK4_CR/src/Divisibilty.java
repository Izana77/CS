import java.util.Scanner; // Import the Scanner class

public class Divisibilty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner myObj = new Scanner(System.in);	// Create a Scanner object
		System.out.println("Input a positive integer: ");
		
		int x = myObj.nextInt(); // Read user input (Integer)
		
		if ((x % 2) == 0 && (x % 3) == 0) {
			System.out.println("This is divisible by 2 and 3");
		}
		else
			System.out.println("This is not divisible by 2 and 3");
	}
}