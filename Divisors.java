/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	public static void main (String[] args) {
		// checking if args is greater than zero
		if (args.length > 0) {
			// set args value into an int
			int num = Integer.parseInt(args[0]);

			// runs from 1 to the given number and prints every
			// number that is a divisor of the given number
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					System.out.println(i);
				}
			}
		}
	}
}
