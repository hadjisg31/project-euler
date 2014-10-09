package projectEuler;

public class Prob5_SmallestMultiple {


/* get the smallest number where divisible by 1-20, without remainder when divided
 * 
 */

	public static void main(String[] args) {
		
		int counter=0;
		/* start somewhere big for number divisible by 1-20 without remainder.
		 * for number divisible by 1-10, reset the value to 1 is fine.  Speeds up the loop time. 
		 */
		int multCounter=200000000;
		int isDivisible=0;
		// divisible counter
		int looper_limit=20;
		
		while(isDivisible==0) {

			// presents divisible flag to TRUE=1.
			isDivisible=1;
			
			// Increase the multiple value
			++multCounter;

			/* Test the multiple counter from 1 to 20
			 * 
			 */
			for(counter=1;counter<=looper_limit;counter++){
				
				// check multiple value if modulo returns 0, means no remainder when divided
				if((multCounter % counter)!=0) {
					// if not 0, return FALSE
					isDivisible=0;
					// Break the loop to save time
					break;
				}
				
			}
			
		}	
			
		// Outputs the answer
		System.out.println("Smallet positive number is: " + multCounter);

	}

}
