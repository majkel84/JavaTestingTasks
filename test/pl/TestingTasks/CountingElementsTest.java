package pl.TestingTasks;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CountingElementsTest {
	private CountingElements tester = new CountingElements();
	
	@Test
	void checkEmptyVector() {
		int[] A = new int[]{};
		int result = tester.PermCheck(A);
		assertEquals(0, result);
	}

	@Test
	void checkVectorWithOne() {
		int[] A = new int[]{1};
		int result = tester.PermCheck(A);
		assertEquals(1, result);
	}
	
	@Test
	void checkVectorWithTwo() {
		int[] A = new int[]{2};
		int result = tester.PermCheck(A);
		assertEquals(0, result);
	}
	
	@Test
	void checkVectorPermut() {
		int[] A = new int[]{2, 1, 5, 3, 4};
		int result = tester.PermCheck(A);
		assertEquals(1, result);
	}
	
	@Test
	void checkVectorNoPermut() {
		int[] A = new int[]{2, 1, 5, 2, 1};
		int result = tester.PermCheck(A);
		assertEquals(0, result);
	}
	
	@Test
	void checkVectorNoPermut2() {
		int[] A = new int[]{4, 1, 3};
		int result = tester.PermCheck(A);
		assertEquals(0, result);
	}
}
