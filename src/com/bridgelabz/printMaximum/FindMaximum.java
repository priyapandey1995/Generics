package com.bridgelabz.printMaximum;


/**
 * 
 * @author pande
 *
 * @param <T> generic type 
 * Generic class is used to find the max of numbers
 */
public class FindMaximum<T extends Comparable> {
	
	T a;
	T b;
	T c;
	
	//Constructor
	public FindMaximum(T a, T b,T c){
		this.a = a;
		this.b = b;
		this.c = c;
		
	}
	
	/**
	 * maximum numbers are found using generic methods
	 * @param a value is set to max
	 * @param b value is compared  
	 * @param c value is  compared
	 * @return maximum is returned
	 */
	
	public static <T extends Comparable<T>> T toPrintMax(T... value) {
		
		T max = value[0];
		
		
		for(int i = 1;i < value.length; i++) {
			if(value[i].compareTo(max) > 0 ) {
				max = value[i];
			}
		}
		return max;
		
	}

}
