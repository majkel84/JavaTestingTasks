package pl.TestingTasks;

import java.util.stream.IntStream;
import java.util.Arrays;

public class CountingElements {
	
	public int PermCheck(int[] A) {
		int[] uniqueA = IntStream.of(A).distinct().toArray();
		int sumA = IntStream.of(A).sum();
		int sumUniqueA = IntStream.of(uniqueA).sum();
		if (sumA == sumUniqueA) {
			Arrays.sort(A);
			if (A.length == A[A.length - 1])
				return 1;
			else
				return 0;
		}
		return 0;
	}

}
