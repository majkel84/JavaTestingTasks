package pl.TestingTasks;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeComplexityTest {

	private TimeComplexity tester = new TimeComplexity();
	
	@Test
	void checkSmallNumbersModZero() {
		int result = tester.FrogJump(3, 9, 2);
		assertEquals(3, result);
	}
	
	@Test
	void checkSmallNumbersModPositive() {
		int result = tester.FrogJump(3, 10, 3);
		assertEquals(3, result);
	}
	
	@Test
	void checkBigNumbersModPositive() {
		int result = tester.FrogJump(3, 1000000000, 3);
		assertEquals(333333333, result);
	}
	
	@Test
	void checkVectorWithGaps() {
		int[] A = new int[]{2, 3, 1, 6, 4};
		int result = tester.PermMissingElem(A);
		assertEquals(5, result);
	}
	
	@Test
	void checkVectorNoGaps() {
		int[] A = new int[]{2, 3, 1, 5, 4};
		int result = tester.PermMissingElem(A);
		assertEquals(6, result);
	}
	
	@Test
	void checkEmptyVector() {
		int[] A = new int[]{0};
		int result = tester.PermMissingElem(A);
		assertEquals(1, result);
	}
	
	@Test
	void checkVectorSizeOne() {
		int[] A = new int[]{1};
		int result = tester.tapeEquilibrum(A);
		assertEquals(0, result);
	}

	@Test
	void checkVectorWithPositiveNumbers() {
		int[] A = new int[]{4, 1, 2};
		int result = tester.tapeEquilibrum(A);
		assertEquals(1, result);
	}

	@Test
	void checkVectorWithNegativeNumbers() {
		int[] A = new int[]{4, 1, -1, 4, -4};
		int result = tester.tapeEquilibrum(A);
		assertEquals(4, result);
	}
}
