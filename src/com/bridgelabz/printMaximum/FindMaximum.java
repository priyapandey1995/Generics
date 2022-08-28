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
	 * @return maximum of three integer is returned
	 */
	
	public static Integer toPrintMax(Integer a ,Integer b,Integer c) {
		
		Integer max = a;
		
		if(b.compareTo(max) > 0 ) 
			max = b;
		
		if(c.compareTo(max) > 0 )
			max = c;
		return max;
		
	}

}
