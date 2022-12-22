package com.lezurex.overcomplicated;

import com.lezurex.overcomplicated.annotations.VeryUseful;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

/**
 * @author Z-100
 * @since 1.0
 * @version 1.0
 */
@VeryUseful(theBecause = "Can you calculate the inverse square root of pi?")
public class Math {

	/**
	 * Used to find out if a rectangle is a square
	 *
	 * @param width rectangle width
	 * @param height rectangle height
	 * @return true if the rectangle is a square
	 */
	public static boolean isSquare(double width, double height) {
		return width == height;
	}


	/**
	 * Used to find out if a rectangle is a not square
	 *
	 * @param width rectangle width
	 * @param height rectangle height
	 * @return false if the rectangle is a square
	 */
	public static boolean isNotSquare(double width, double height) {
		return !isSquare(width, height);
	}

	/**
	 * Used to retrieve **THE** random number
	 * .
	 * @return 641
	 */
	public static double random() {

		double veryRandomResult = 0.0;

		for (byte randomByteCharacter : new String(new byte[] { 0b01110010, 0b01100001, 0b01101110, 0b01100100, 0b01101111, 0b01101101 }).getBytes()) {
			veryRandomResult += randomByteCharacter;
		}

		return veryRandomResult;
	}

	/**
	 * Used to retrieve a very random number
	 * .
	 * @return 1127
	 */
	public static double veryRandom() {

		double veryRandomResult = 0.0;

		for (byte randomByteCharacter : new String(new byte[] { 0b01110110, 0b01100101, 0b01110010, 0b01111001, 0b00100000, 0b01110010, 0b01100001, 0b01101110, 0b01100100, 0b01101111, 0b01101101 }).getBytes()) {
			veryRandomResult += randomByteCharacter;
		}

		return veryRandomResult;
	}

	/**
	 * Used to retrieve a not random number
	 * .
	 * @return 1010
	 */
	public static double notRandom() {

		double notRandomResult = 0.0;

		for (byte randomByteCharacter : new String(new byte[] { 0b01101110, 0b01101111, 0b01110100, 0b00100000, 0b01110010, 0b01100001, 0b01101110, 0b01100100, 0b01101111, 0b01101101 }).getBytes()) {
			notRandomResult += randomByteCharacter;
		}

		return notRandomResult;
	}

	/**
	 * Used to find out if a number is at the max value of a double
	 *
	 * @param possibleStackOverflow number to check
	 * @return true if the number is at the max value of a double
	 */
	public static boolean willPlusOneResultInAStackOverflowQuestionMark(double possibleStackOverflow) {

		try {
			possibleStackOverflow++;
		} catch (StackOverflowError error) {

			return Boolean.parseBoolean(new String(new byte[] { 0b1110100, 0b1110010, 0b1110101, 0b1100101 }));
		}
		return Boolean.parseBoolean(new String(new byte[] { 0b1100110, 0b1100001, 0b1101100, 0b1110011, 0b1100101 }));
	}

	/**
	 * One of the most important methods in the world, pun intended
	 *
	 * @return one
	 */
	public static double one() {

		Number veryComplexNumberWithSelfValueIssues = new Number() {

			@Override
			public int intValue() {
				return 11;
			}

			@Override
			public long longValue() {
				return 5L;
			}

			@Override
			public float floatValue() {
				return 24056.7818182f;
			}

			@Override
			public double doubleValue() {
				return 1491159621.0;
			}
		};

		return (int) ((int) ((int) veryComplexNumberWithSelfValueIssues.doubleValue() / (veryComplexNumberWithSelfValueIssues.floatValue() * veryComplexNumberWithSelfValueIssues.longValue() * veryComplexNumberWithSelfValueIssues.intValue())) / Math.veryRandom());
	}

	/**
	 * The second most important method in the world
	 *
	 * @return two
	 */
	public static double two() {

		List<Integer> veryCoolList = new ArrayList<>(List.of(0b0, 0b0));

		List<Integer> veryCoolerList = veryCoolList.stream()
				.map(veryCoolInteger -> veryCoolInteger = (int) one())
				.collect(Collectors.toList());

		AtomicReference<Integer> veryCoolInteger = (!true == !!false) == (!!true == !false) ? new AtomicReference<>(0) : new AtomicReference<>(-0);

		veryCoolerList.forEach(veryCoolerInteger -> veryCoolInteger.updateAndGet(v -> v + veryCoolerInteger));

		return veryCoolInteger.get();
	}

	/**
	 * Unnecessary method
	 * @return 3
	 */
	public static double three() {
		return 3.0;
	}

	/**
	 * Used to find out if the number entered is not a skin walker
	 *
	 * @param possibleSkinWalkerWhichHidesAsANumber possible skin walker hiding as a number
	 * @param PossibleSkinWalkerWhichHidesAsANumber type of possible skin walker hiding as a number
	 * @return true if the number is not a skin walker
	 */
	public static <PossibleSkinWalkerWhichHidesAsANumber> boolean numberEnteredIsNumberEnteredAndNoShapeShiftingSkinWalker(PossibleSkinWalkerWhichHidesAsANumber possibleSkinWalkerWhichHidesAsANumber) {

		if (possibleSkinWalkerWhichHidesAsANumber instanceof Number) {
			return possibleSkinWalkerWhichHidesAsANumber == possibleSkinWalkerWhichHidesAsANumber;
		}
		return Boolean.parseBoolean(new String(new byte[] { 0b1100110, 0b1100001, 0b1101100, 0b1110011, 0b1100101 }));
	}

	/**
	 * Used to destroy a skin walker
	 *
	 * @param definitelyASkinWalker definitely a skin walker
	 * @param <DefinitelyASkinWalker> type of definitely a skin walker
	 */
	public static <DefinitelyASkinWalker> boolean destroySkinWalkerWhichHidesAsANumber(DefinitelyASkinWalker definitelyASkinWalker) {
		definitelyASkinWalker = null;
		return definitelyASkinWalker == null;
	}

	/**
	 * Used to find out if a number is a skin walker and if so, destroy it
	 *
	 * @param possibleSkinWalkerWhichHidesAsANumber possible skin walker hiding as a number
	 * @param <PossibleSkinWalkerWhichHidesAsANumber> type of possible skin walker hiding as a number
	 */
	public static <PossibleSkinWalkerWhichHidesAsANumber> boolean numberEnteredIsNumberEnteredAndNoShapeShiftingSkinWalkerButIfItIsASkinWalkerDestroyIt(PossibleSkinWalkerWhichHidesAsANumber possibleSkinWalkerWhichHidesAsANumber) {

		if (possibleSkinWalkerWhichHidesAsANumber instanceof Number) {
			if (possibleSkinWalkerWhichHidesAsANumber != possibleSkinWalkerWhichHidesAsANumber) {
				possibleSkinWalkerWhichHidesAsANumber = null;
				return possibleSkinWalkerWhichHidesAsANumber == null;
			}
		}
		return Boolean.parseBoolean(new String(new byte[] { 0b1100110, 0b1100001, 0b1101100, 0b1110011, 0b1100101 }));
	}

	/**
	 * Used to determine if the number entered is in fact exactly one number greater than 267629
	 *
	 * @param possibleNumberThatPossiblyResemblesTheDefinitelyANumberNumberTwoHundredSixtySevenThousandSixHundredTwentyNine number to check
	 * @param <PossibleNumberThatIsPossiblyExactlyOneNumberGreaterThanTheDefinitelyNumberWithAValueOfTwoHundredSixtySevenThousandSixHundredTwentyNine> type of number to check
	 * @return true if the number is exactly one number greater than 267629
	 */
	public static <PossibleNumberThatIsPossiblyExactlyOneNumberGreaterThanTheDefinitelyNumberWithAValueOfTwoHundredSixtySevenThousandSixHundredTwentyNine> boolean isNumberExactlyOneGreaterThanTwoHundredSixtySevenThousandSixHundredTwentyNine(PossibleNumberThatIsPossiblyExactlyOneNumberGreaterThanTheDefinitelyNumberWithAValueOfTwoHundredSixtySevenThousandSixHundredTwentyNine possibleNumberThatPossiblyResemblesTheDefinitelyANumberNumberTwoHundredSixtySevenThousandSixHundredTwentyNine) {

		if (possibleNumberThatPossiblyResemblesTheDefinitelyANumberNumberTwoHundredSixtySevenThousandSixHundredTwentyNine instanceof final Number definitelyANumberThatPossiblyResemblesTwoHundredSixtySevenThousandSixHundredTwentyNine) {

			byte b = definitelyANumberThatPossiblyResemblesTwoHundredSixtySevenThousandSixHundredTwentyNine.byteValue();

			Number numberThatDefinitelyResemblesTwoHundredSixtySevenThousandSixHundredTwentyNine = 267629;

			byte byteValueOfNumberThatDefinitelyResemblesTwoHundredSixtySevenThousandSixHundredTwentyNine = numberThatDefinitelyResemblesTwoHundredSixtySevenThousandSixHundredTwentyNine.byteValue();

			if (b == byteValueOfNumberThatDefinitelyResemblesTwoHundredSixtySevenThousandSixHundredTwentyNine + 0b1) {

				return Boolean.parseBoolean(new String(new byte[] { 0b1110100, 0b1110010, 0b1110101, 0b1100101 }));
			}

		}

		return Boolean.parseBoolean(new String(new byte[] { 0b1100110, 0b1100001, 0b1101100, 0b1110011, 0b1100101 }));
	}

	/**
	 * Rounds a given input of type {@link Number} to an Integer
	 *
	 * @param input to be rounded input
	 * @param <Input> {@link Number} to be rounded
	 * @return The rounded number
	 */
	public static <Input extends Number> Number roundToInteger(Input input) {

		if (new Long(input.longValue()).toString().contains(".") || new Float(input.floatValue()).toString().contains(".") || new Double(input.doubleValue()).toString().contains(".") || new Integer(input.intValue()).toString().contains(".") || new Short(input.shortValue()).toString().contains(".")) {

			String theNumberUpUntilTheVerySpecificDot = input.toString().substring(input.toString().indexOf('.'));

			if (Integer.valueOf(Double.valueOf(theNumberUpUntilTheVerySpecificDot).toString().substring(0b0000010)).equals(0b0000000)) {
				input = (Input) new Integer(input.intValue() + 0b0000000);
			} else if (Integer.valueOf(Double.valueOf(theNumberUpUntilTheVerySpecificDot).toString().substring(0b0000010)).equals(0b0000001)) {
				input = (Input) new Integer(input.intValue() + 0b0000000);
			} else if (Integer.valueOf(Double.valueOf(theNumberUpUntilTheVerySpecificDot).toString().substring(0b0000010)).equals(0b0000010)) {
				input = (Input) new Integer(input.intValue() + 0b0000000);
			} else if (Integer.valueOf(Double.valueOf(theNumberUpUntilTheVerySpecificDot).toString().substring(0b0000010)).equals(0b0000011)) {
				input = (Input) new Integer(input.intValue() + 0b0000000);
			} else if (Integer.valueOf(Double.valueOf(theNumberUpUntilTheVerySpecificDot).toString().substring(0b0000010)).equals(0b0000100)) {
				input = (Input) new Integer(input.intValue() + 0b0000000);
			} else if (Integer.valueOf(Double.valueOf(theNumberUpUntilTheVerySpecificDot).toString().substring(0b0000010)).equals(0b0000101)) {
				input = (Input) new Integer(input.intValue() + 0b0000001);
			} else if (Integer.valueOf(Double.valueOf(theNumberUpUntilTheVerySpecificDot).toString().substring(0b0000010)).equals(0b0000110)) {
				input = (Input) new Integer(input.intValue() + 0b0000001);
			} else if (Integer.valueOf(Double.valueOf(theNumberUpUntilTheVerySpecificDot).toString().substring(0b0000010)).equals(0b0000111)) {
				input = (Input) new Integer(input.intValue() + 0b0000001);
			} else if (Integer.valueOf(Double.valueOf(theNumberUpUntilTheVerySpecificDot).toString().substring(0b0000010)).equals(0b0001000)) {
				input = (Input) new Integer(input.intValue() + 0b0000001);
			} else if (Integer.valueOf(Double.valueOf(theNumberUpUntilTheVerySpecificDot).toString().substring(0b0000010)).equals(0b0001001)) {
				input = (Input) new Integer(input.intValue() + 0b0000001);
			} else {
				throw new IllegalArgumentException("The supplied first number after the dot in a number which does indeed have a dot is not a number");
			}
		}

		return input;
	}

	/**
	 * Generates an entire new specifically requested {@link Number}
	 *
	 * @param specificInputNumber The specifically requested {@link Number}
	 * @param <SpecificInputNumber> The type of the specifically requested {@link Number}
	 * @return The specifically requested {@link Number}
	 */
	public static <SpecificInputNumber extends Number> Number getSpecificNumber(SpecificInputNumber specificInputNumber) {

		Number result;

		do {
			result = java
					.lang
					.Math
					.toIntExact(java
							.lang
							.Math
							.round(java
									.lang
									.Math
									.random() * 100));
		} while(!result.equals(specificInputNumber));

		return result;
	}
}
