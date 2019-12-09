package pl.TestingTasks;

import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.HashSet;

public class CountingElements {
	
	public int PermCheck(int[] A) {
		if (A.length == 0)
			return 0;
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

	public int FrogRiverOne(int X, int[] A) {
        HashSet<Integer> hashSet = new HashSet<Integer>();

        for (int i = 0 ; i < A.length; i++) {
            if (A[i] <= X)
            	hashSet.add(A[i]);   
            if (hashSet.size() == X)
               return i;
        }
        return -1;
	}
	
	public int[] MaxCounters(int N, int[] A) {
		int[] solution = new int[N];
		int currentMax = 0;
		int maxCounter = 0;
		
		for (int i = 0; i < A.length;  i++) {

			if (A[i] >= 1 && A[i] <= N) {
				solution[A[i] - 1] = Math.max(currentMax, solution[A[i] - 1]);
				solution[A[i] - 1] += 1;
				maxCounter = Math.max(maxCounter, solution[A[i] - 1]);
			}
			else if (A[i] == N + 1)
				currentMax = maxCounter;
		}
		
		for(int i = 0 ; i < solution.length; i++) {
			solution[i] = Math.max(solution[i], currentMax);
		}
		return solution;
	}
}
