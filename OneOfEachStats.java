import java.util.Random;
/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get two command-line arguments: an int value
 * 	that determines how many families to simulate, and an int value
 *  that serves as the seed of the random numbers generated by the program.
 *  Example usage: % java OneOfEachStats 1000 1
 */
public class OneOfEachStats {
	public static void main (String[] args) {

		// checking if args is greater than zero
		if (args.length > 0) {

			// Gets the two command-line arguments
			int T = Integer.parseInt(args[0]);
			int seed = Integer.parseInt(args[1]);

			// Initailizes a random numbers generator with the given seed value
			Random generator = new Random(seed);

			// creates a random number
			int N = 2, probability;
			double r = 0;

			//creating a count and a avg
			int count = 0;
			double avg = 0.0;

			//creating args of number of families with
			//2, 3, 4 or more children and mode
			int twoChildrenCount = 0, threeChildrenCount = 0, fourOrMoreChildrenCount = 0;
			int max = 0;
			String mode = "";

			//creating 2 bool args that holds
			//whether a boy or a girl were born
			boolean isBoy = false, isGirl = false;

			for (int i = 0; i < T; i++) {
				//setting values in all the args
				isBoy = false;
				isGirl = false;
				count = 0;

				//runnning untill there are a boy
				//and a girl
				while (!isBoy || !isGirl) {

					//adding 1 to the count
					count++;

					//calculating the probability
					r = generator.nextDouble();
					probability = (int) (r * N);

					//checking if it is a girl or a boy
					if (probability == 0) {
						isBoy = true;
					}
					else {
						isGirl = true;
					}
				}

				//checking how many children are in the familiy
				switch (count) {
					case 2:
						twoChildrenCount++;
						break;
					case 3:
						threeChildrenCount++;
						break;
					default:
						fourOrMoreChildrenCount++;
						break;
				}

				//adding the count to avg
				avg += (double) count;
			}

			//calculating the max number of families
			max = Math.max(twoChildrenCount, threeChildrenCount);
			max = Math.max(max, fourOrMoreChildrenCount);

			//setting the correct string of mode
			if (max == twoChildrenCount) {
				mode = "2.";
			}
			else if (max == threeChildrenCount) {
				mode = "3.";
			}
			else {
				mode = "4 or more.";
			}

			//calculating the avg
			avg /= (double) T;

			//printing evertything
			System.out.println("Average: " + avg + " children to get at least one of each gender.");
			System.out.println("Number of families with 2 children: " + twoChildrenCount);
			System.out.println("Number of families with 3 children: " + threeChildrenCount);
			System.out.println("Number of families with 4 or more children: " + fourOrMoreChildrenCount);
			System.out.println("The most common number of children is " + mode);
		}
	}
}
