import java.math.BigDecimal;

public class Prob8_LargestProductSeries {

	public static void main(String[] args) {
		String digitArr[] = {"73167176531330624919225119674426574742355349194934",
				"96983520312774506326239578318016984801869478851843",
				"85861560789112949495459501737958331952853208805511",
				"12540698747158523863050715693290963295227443043557",
				"66896648950445244523161731856403098711121722383113",
				"62229893423380308135336276614282806444486645238749",
				"30358907296290491560440772390713810515859307960866",
				"70172427121883998797908792274921901699720888093776",
				"65727333001053367881220235421809751254540594752243",
				"52584907711670556013604839586446706324415722155397",
				"53697817977846174064955149290862569321978468622482",
				"83972241375657056057490261407972968652414535100474",
				"82166370484403199890008895243450658541227588666881",
				"16427171479924442928230863465674813919123162824586",
				"17866458359124566529476545682848912883142607690042",
				"24219022671055626321111109370544217506941658960408",
				"07198403850962455444362981230987879927244284909188",
				"84580156166097919133875499200524063689912560717606",
				"05886116467109405077541002256983155200055935729725",
				"71636269561882670428252483600823257530420752963450"};
		String digits="";
		String currBlock="";
		String numBlock="";
		
		BigDecimal _newHigh = BigDecimal.ONE;
		BigDecimal _currHigh = BigDecimal.ZERO;
		
		int counter, digit;
		int maxAdjacent = 13;

		//just assign all digits to a single string, really.
		for(int cnt=0;cnt<20;cnt++) {
			digits = digits + digitArr[cnt];
		}
		
		counter=0;
		// loop thru each number of digits string
		while(counter < 1000) {
			
			// make sure counter doesn't exceed 1000, else array exception will happen
			if(counter+maxAdjacent <= 1000) {
				
				numBlock = ""; // reset the number block to empty again	
				// loop from 0 to max adjacent, 4 or 13 as example
				for(int i=0;i<maxAdjacent;i++) {
					
					// again, make sure the array pointer will not exceed 1000
					if((i+counter) < digits.length()) {
						// get the digit from string
						digit = Character.getNumericValue(digits.charAt(i+counter));

						// multiple using BigDecimal function
						_newHigh = _newHigh.multiply(new BigDecimal(digit));
						// Strong number block from 0 to max adjacent
						numBlock = numBlock.concat(String.valueOf(digit));
					}

				}
			}
			// compare if new product is greater than current
			if(_newHigh.compareTo(_currHigh) == 1) {
				currBlock = numBlock;  // save the block digits
				_currHigh = _newHigh;  // save the current highest product
				
				//System.out.println("New high is: " + _currHigh);
				//System.out.println("Block: " + currBlock);
			}
			
			_newHigh = BigDecimal.ONE; //rest the new high product to 1 again;
			++counter;   //increment counter
		}
		
		
		System.out.println("Highest number is: " + _currHigh);
		System.out.println("Number Block is: " + currBlock);
		

	}

}
