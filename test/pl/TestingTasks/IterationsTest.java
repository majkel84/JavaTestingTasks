package pl.TestingTasks;

import static org.junit.Assert.assertEquals;
//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IterationsTest {

	private int result = 0;
	private Iterations tester = new Iterations();
	
	@Test
	void testGapInAllZeros() {
		result = tester.BinaryGap(0);
		assertEquals(result, 0);
	}
	
	@Test
	void testFindigLongestGap() {
		result = tester.BinaryGap(5);
		assertEquals(result, 1);
	}
	
	@Test
	void testGapInTen() {
		result = tester.BinaryGap(10);
		assertEquals(result, 1);
	}
	
	@Test
	void testGapInEight() {
		result = tester.BinaryGap(8);
		assertEquals(result, 0);
	}
	
	@Test
	void testGapIn124() {
		result = tester.BinaryGap(124);
		assertEquals(result, 0);
	}
	
}
