
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  If the probability is 0 it is a boy, otherwise it is a girl
 */
public class OneOfEach {
	public static void main (String[] args) {
		// creates a random number
		int N = 2, probability;
		double r = 0;

		//creating a count
		int count = 0;

		//creating 2 bool args that holds
		//whether a boy or a girl were born
		boolean isBoy = false, isGirl = false;

		//runnning untill there are a boy
		//and a girl
		while (!isBoy || !isGirl) {

			//adding 1 to the count
			count++;

			//calculating the probability
			r = Math.random();
		 	probability = (int) (r * N);

			//checking if it is a girl or a boy
			if (probability == 0) {
				System.out.print("b ");
				isBoy = true;
			}
			else {
				System.out.print("g ");
				isGirl = true;
			}
		}

		//printing how many children there are
		System.out.println("\nYou made it... and you now have " + count + " children.");
		
	}
}
