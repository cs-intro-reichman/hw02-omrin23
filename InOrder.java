/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		// creates a random number
		int N = 10, firstNum = 0, secondNum = 0;
		double r = Math.random();
		firstNum = (int) (r * N);
		secondNum = firstNum;
		
		//running till secondNum is smaller than firstNum
		do {
			firstNum = secondNum;
			System.out.print(firstNum + " ");
			r = Math.random();
			secondNum = (int) (r * N);
		}
		while (secondNum >= firstNum);
		System.out.println();
	}
}
