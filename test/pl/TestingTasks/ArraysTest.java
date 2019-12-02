package pl.TestingTasks;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.Ignore;

class ArraysTest {

	int testResult = 0;
	private Arrays tester = new Arrays();
	
	@Test
	void checkOneDigitDiffrent() {
		int[] entry = {9, 3, 9, 3, 9, 7, 9};
		testResult = tester.OddOccurrencesInArray(entry);
		assertEquals(7, testResult);
	}
	
	@Test
	void checkOnePositiveElementVector() {
		int[] entry = {-4};
		testResult = tester.OddOccurrencesInArray(entry);
		assertEquals(-4, testResult);
	}

	@Ignore
	void checkOnlyMultipleDigitsVector() {
		int[] entry = {-4, 3, -4, 2, 1, 1, 5, 3, 2, 5};
		testResult = tester.OddOccurrencesInArray(entry);
		assertEquals(0, testResult);
	}
	
	@Test
	void checkRotationByThree() {
		int[] entry = {1, 2, 3, 4, 5};
		int[] testResult = new int[entry.length];
		testResult = tester.CyclicRotation(entry, 3);
		int[] expectedSolution = {3, 4, 5, 1, 2};
		for(int i = 0; i < entry.length; i++)
			assertEquals(expectedSolution[i], testResult[i]);
	}
	
	@Test
	void checkOneElementByFive() {
		int[] entry = {-4};
		int[] testResult = new int[entry.length];
		testResult = tester.CyclicRotation(entry, 5);
		int[] expectedSolution = {-4};
		for(int i = 0; i < entry.length; i++)
			assertEquals(expectedSolution[i], testResult[i]);
	}
}

