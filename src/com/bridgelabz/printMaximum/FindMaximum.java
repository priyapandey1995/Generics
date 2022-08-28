package com.bridgelabz.printMaximum;
/**
 * 
 * @author pande
 *
 */

public class FindMaximum {
	
	/**
	 * maximum numbers are found using generic methods
	 * @param a value is set to max
	 * @param b value is compared  
	 * @param c value is  compared
	 * @return maximum is returned
	 */
	
	public static <T extends Comparable<T>> T toPrintMax(T a ,T b,T c) {
		
		T max = a;
		
		if(b.compareTo(max) > 0 ) 
			max = b;
		
		if(c.compareTo(max) > 0 )
			max = c;
		return max;
		
	}

}
