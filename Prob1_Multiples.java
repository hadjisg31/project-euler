
public class Prob1_Multiples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		int div_total;
		
		div_total = 0;
		
		for(i=0;i<1000;++i) {
			
			if(((i % 3) == 0) || ((i % 5) == 0)) {
				
				div_total += i;
			
			}
			
		}
		
		System.out.println("Total value is " + div_total);
				
	}

}
