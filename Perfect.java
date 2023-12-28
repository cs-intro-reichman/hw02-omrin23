/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		// checking if args is greater than zero
		if (args.length > 0)
		{
			// putting the given number in an
			// integer N and a sun
			int N = Integer.parseInt(args[0]);
			int sum = 0;

			//creating a String that holds
			//all the divisors
			String divisors = "";

			//running through all the numbers form
			//1 to N - 1
			for (int i = 1; i < N - 1; i++) {
				//checking if N % i == 0
				if (N % i == 0) {
					//adding i to sum and adding to the
					//divisors String
					sum += i;
					divisors += i + " + ";
				}
			}

			//checks if N is equal to sum
			//and print accordingly
			if (N == sum) {
				System.out.println(N + " is a perfect number since " + N + 
				" = " + divisors.substring(0, divisors.length() - 3));
			}
			else {
				System.out.println(N + " is not a perfect number");
			}
		}
	}
}
