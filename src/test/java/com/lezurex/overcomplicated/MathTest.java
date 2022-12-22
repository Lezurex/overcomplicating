package com.lezurex.overcomplicated;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathTest {

	@Test
	void isSquare() {
		assertTrue(Math.isSquare(1, 1));
		assertFalse(Math.isSquare(1, 2));
	}

	@Test
	void isNotSquare() {
		assertFalse(Math.isNotSquare(1, 1));
		assertTrue(Math.isNotSquare(1, 2));
	}

	@Test
	void random() {
		assertEquals(641, Math.random());
		assertNotEquals(642, Math.veryRandom());
	}

	@Test
	void veryRandom() {
		assertEquals(1127, Math.veryRandom());
		assertNotEquals(1128, Math.veryRandom());
	}

	@Test
	void notRandom() {
		assertEquals(1010, Math.notRandom());
		assertNotEquals(1011, Math.notRandom());
	}

	@Test
	void willPlusOneResultInAStackOverflowQuestionMark() {
		assertFalse(Math.willPlusOneResultInAStackOverflowQuestionMark(0x1.fffffffffffffP+1023 - 1));
	}

	@Test
	void one() {
		assertEquals(1.0, Math.one());
		assertNotEquals(-1.0, Math.one());
	}

	@Test
	void two() {
		assertEquals(2.0, Math.two());
		assertNotEquals(-1.0, Math.two());
	}

	@Test
	void three() {
		assertEquals(3.0, Math.three());
		assertNotEquals(-1.0, Math.three());
	}

	@Test
	void numberEnteredIsNumberEnteredAndNoShapeShiftingSkinWalker() {
		assertTrue(Math.numberEnteredIsNumberEnteredAndNoShapeShiftingSkinWalker(1));
		assertFalse(Math.numberEnteredIsNumberEnteredAndNoShapeShiftingSkinWalker("1"));
	}

	@Test
	void destroySkinWalkerWhichHidesAsANumber() {
		assertTrue(Math.destroySkinWalkerWhichHidesAsANumber(1));
	}

	@Test
	void numberEnteredIsNumberEnteredAndNoShapeShiftingSkinWalkerButIfItIsASkinWalkerDestroyIt() {
		assertFalse(Math.numberEnteredIsNumberEnteredAndNoShapeShiftingSkinWalkerButIfItIsASkinWalkerDestroyIt("1"));
		assertFalse(Math.numberEnteredIsNumberEnteredAndNoShapeShiftingSkinWalkerButIfItIsASkinWalkerDestroyIt(1));
	}

	@Test
	void isNumberExactlyOneGreaterThanTwoHundredSixtySevenThousandSixHundredTwentyNine() {
		assertTrue(Math.isNumberExactlyOneGreaterThanTwoHundredSixtySevenThousandSixHundredTwentyNine(267630));
		assertFalse(Math.isNumberExactlyOneGreaterThanTwoHundredSixtySevenThousandSixHundredTwentyNine(267627));
	}

	@Test
	void roundToInteger() {
		assertEquals(5, Math.roundToInteger(5.0));
		assertEquals(5, Math.roundToInteger(5.1));
		assertEquals(5, Math.roundToInteger(5.2));
		assertEquals(5, Math.roundToInteger(5.3));
		assertEquals(5, Math.roundToInteger(5.4));
		assertEquals(6, Math.roundToInteger(5.5));
		assertEquals(6, Math.roundToInteger(5.6));
		assertEquals(6, Math.roundToInteger(5.7));
		assertEquals(6, Math.roundToInteger(5.8));
		assertEquals(6, Math.roundToInteger(5.9));
	}

	@Test
	void getSpecificNumberWorksAsExpected() {
		assertEquals(1, Math.getSpecificNumber(1));
		assertEquals(2, Math.getSpecificNumber(2));
		assertEquals(3, Math.getSpecificNumber(3));
		assertEquals(4, Math.getSpecificNumber(4));
		assertEquals(5, Math.getSpecificNumber(5));
		assertEquals(6, Math.getSpecificNumber(6));
		assertEquals(7, Math.getSpecificNumber(7));
		assertEquals(8, Math.getSpecificNumber(8));
		assertEquals(9, Math.getSpecificNumber(9));
	}
}