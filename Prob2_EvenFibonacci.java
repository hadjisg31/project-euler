
public class Prob2_EvenFibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long i,j,max_cnt;
		long fib_total;
		
		fib_total = 0;
		j = 0;
		max_cnt = 4000000;
		
		for(i=1;i<max_cnt;i=i) {
			
			// get the current value of i
			j = j+i;
			System.out.println("current i: " + j);

			if(((j % 2)==0) && (j<max_cnt)) {
				fib_total = fib_total + j;
			}
			
			i = i + j;
			System.out.println("current i: " + i);

			if(((i % 2)==0) && (i<max_cnt)) {
				fib_total = fib_total + i;
			}
		}
		
		System.out.println("Total even value is " + fib_total);
		
	}

}
