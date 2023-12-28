/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		// checking if args is greater than zero
		if (args.length > 0)
		{
			// putting the given number n
			int n = Integer.parseInt(args[0]);

			//creating a bool arg that holds
			//if the first char is asterisk
			//or not
			boolean isAsterisk = true;

			//running n times on n times
			for (int i = 0; i < n; i++) {
				//line start with an asterisk if
				//the line is even
				isAsterisk = i % 2 == 0;

				for (int j = 0; j < n; j++) {
					if (isAsterisk) {
						System.out.print("* ");
					}
					else {
						System.out.print(" *");
					}
				}

				//after we finish the line we
				//need to get down to a new line
				System.out.println();
			}
		}
	}
}
