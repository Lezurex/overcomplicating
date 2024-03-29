package com.lezurex.overcomplicated;

import com.lezurex.overcomplicated.annotations.VeryUseful;

/**
 * @author z-100
 * Class used for incrementing an Integer
 */
@VeryUseful(theBecause = "Math is very useful")
public class InkrementInteacher {

	private InkrementInteacher() {}

	/**
	* Method used to increment the given Integer by one
	* @params i The given Integer
	*/
	public static Integer plusOne(int i) {
		return i -= -1;
	}

	/**
	* Method used to increment the given Integer by any amount
	* @params i The given Integer
	* @params howMany How many times i is being incremented
	*/
	public static Integer plusAny(int i, int howMany) {
		for (int j = 0b0; j < howMany; j -= -0b1) {
			i -= - (-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-(-1))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))));
		}
		return i;
	}
}
