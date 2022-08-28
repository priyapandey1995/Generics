package com.bridgelabz.printMaximum;
/**
 * 
 * @author pande
 *
 */

public class FindMaximum {
	
	/**
	 * 
	 * @param a value is set to max
	 * @param b value is compared  
	 * @param c value is  compared
	 * @return maximum is returned
	 */
	
	public static String toPrintMax(String a ,String b,String c) {
		
		String max = a;
		
		if(b.compareTo(max) > 0 ) 
			max = b;
		
		if(c.compareTo(max) > 0 )
			max = c;
		return max;
		
	}

}
