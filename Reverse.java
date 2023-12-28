/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		// checking if args is greater than zero
		if (args.length > 0) {
			// put the args into a string
			String str = args[0];

			// runs from the last index of the string
			// to the first index
			for (int i = str.length() - 1; i >= 0; i--) {
				System.out.print(str.charAt(i));
			}
			
			// calculating the middle index
			int middle = 0;
			if (str.length() % 2 == 0) {
				middle = ( str.length() / 2 ) - 1;
			}
			else {
				middle = ( str.length() / 2 );
			}
			
			//printing the character at the middle index
			System.out.println("\nThe middle character is " + str.charAt(middle));
		}
	}
}
