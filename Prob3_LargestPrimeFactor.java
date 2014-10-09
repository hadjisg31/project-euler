import java.math.BigDecimal;

public class Prob3_LargestPrimeFactor {

        public static void main(String[] args) {

        		/* use BigDecimal to handle numbers greater than 2Billion
        		 * 
        		 */
                BigDecimal i;
                BigDecimal factor = new BigDecimal("600851475143");
                											
                /* Start factoring from 2
                 * Increase the divisor by 1 -- brute force!!
                 * 
                 */
				for(i= new BigDecimal("2");i.compareTo(factor) <= 0;i=i.add(BigDecimal.ONE)){
					
					/* divide the factor by incremental value of i, if the remainder is 0, 
					 * the dividend is divisible by the value of divisor
					 */
					if(factor.remainder(i).intValue()==0) {
						
                        System.out.println("Factors: " + i);
                        
                        /* update the value of factor to the new dividend
                         * 
                         */
                        factor = factor.divide(i);						
					} 
					
                  }
				
		}
}