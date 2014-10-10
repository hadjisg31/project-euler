public class Prob7_10001stPrime {

	/**
	 * determine what is the 10001st prime number
	 */
	public static void main(String[] args) {
	
		int primeVal=0;
		int primeCountLimit=10001; // adjust limit if necessary, try 6 for 13 prime number as result
		int primeNumCount=1;
		int primeCounter=2;
		
		while (primeNumCount <= primeCountLimit) {
			
			if(isPrime(primeCounter)) {
				
				// increase prime number counter till primeCountLimit.
				++primeNumCount;
			}
			
			++primeCounter;

		}
		
		// just remove the increment number from last operation
		--primeCounter;
		
		System.out.println("10001st prime number is: " + primeCounter);
			
	}
	
	private static boolean isPrime(int primeNum) {
		
		// by default 2 is a prime number
		if (primeNum == 2) {	
			return true;
		}
		
		// check the evensies value
		if(primeNum % 2 == 0) {
			return false;
		} 
		
		// check the oddsies value
		for(int cnt=3;cnt*cnt<=primeNum;cnt+=2) {
	        if(primeNum % cnt == 0)
	            return false;
	    }
		
	    return true;		
		
	}

}
