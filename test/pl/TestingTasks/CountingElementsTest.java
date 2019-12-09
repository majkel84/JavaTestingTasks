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
	
	@Test
	void checkFrogArrayOne() {
		int[] A = new int[]{1};
		int result = tester.FrogRiverOne(1, A);
		assertEquals(0, result);
	}
	
	@Test
	void checkFrogSortedArray() {
		int[] A = new int[]{1, 2, 3, 4, 5};
		int result = tester.FrogRiverOne(5, A);
		assertEquals(4, result);
	}
	
	@Test
	void checkFrogMisingNumber() {
		int[] A = new int[]{1, 5, 2, 4, 2};
		int result = tester.FrogRiverOne(5, A);
		assertEquals(-1, result);
	}
	
	@Test
	void checkFrogNotSortedArray() {
		int[] A = new int[]{1, 1, 6, 7, 3, 5, 2, 4, 2};
		int result = tester.FrogRiverOne(5, A);
		assertEquals(7, result);
	}
	
	@Test
	void checkMaxCountVector() {
		int[] A = new int[]{3, 4, 4, 6, 1, 4, 4};
		int[] solution = new int[]{3, 2, 2, 4, 2};
		int[] result = tester.MaxCounters(5, A);
		assertEquals(solution, result);
	}
}
