public class palindrome {

	/* this palindrome solution is only capable of solving max of integer, where r_palin = 9999
	 *  
	 */
	public static void main(String[] args) {
		
		// set the maximum factor for 3 digits
		int r_palin=999;
		// just copy the value, change once only!
		int l_palin=r_palin;
		// limit the lower value of factor to maximum - 100, assumptions!!
		int factor_limit=100;
		int max_palin=0;
		int found_palin=0;
		int i = r_palin;
		int j=l_palin;
		
		/* loop while palindrome is not found yet
		 *   eventually it will!!
		 */

		while(found_palin!=1) {
			
			// get the current value of i multiply to j to test palindrome
			max_palin=i*j;
			
			/* Test if the current value of i multiple to j is a palindrome
			 * and assign the result
			 */
			found_palin = testPalin(max_palin);
			
			// decrease the value of j, from 999 down to 999-100 (remember the lower factor value limit)
			--j;
			
			//assume lower factor is higher factor minus 100 only
			if(j<(r_palin-factor_limit)) {
				
				//Reset j to original higher value and loop again
				j=l_palin;
				//decrement i by 1
				--i;
			}
		
		}

		// resetting value of j back, since the last line above --j is not used.
		++j;
		
		// print the values
		System.out.println("Palindrome value: " + max_palin);
		System.out.println("Factor Left: " + j);		
		System.out.println("Factor Right: " + i);

	}
	
	// function to return palindrome test logic
	public static int testPalin(int palin_val) {

		// get the length of palindrome to test
		int len_palin=Integer.toString(palin_val).length();
		// get the actual value in string
		String palinVal=Integer.toString(palin_val);
		int i,j;
		// set the test return to TRUE, assumptions!
		int palinTest=1;

		/* get the half length of palindrome to test
		 * subtract 1, since array in java starts with 0 to length-1
		 * 
		 */
		j = ((len_palin/2)+1) -1; 
		
		/* Loop back from middle down to 0, where start is middle-1, java starts at 0
		 * i is decreasing, and j is increasing
		 */
		for(i=(len_palin/2)-1;i>=0;i--) {
			
			/* compare the value of each character in palindrome to test
			 * example is 1221, the first loop compare [2] and [2] (the loop starts at the middle), 
			 * then if the value doesn't match it will loop to the outer
			 * value to compare where, [1] is equal to [1].  
			 * any unmatch character for each comparison will negate the return to FALSE
			 */
			
			if(palinVal.charAt(i)!=palinVal.charAt(j)) {
				palinTest=0;
			}
			
			// increment the right part of the palindrome to test
			++j;
		}
		
		// return the result of comparison
		return palinTest;
	}
		
	
}