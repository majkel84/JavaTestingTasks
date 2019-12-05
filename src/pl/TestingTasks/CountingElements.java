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
		/*int position = -1;
		int maxPosition = -1;
		
		if (X > A.length)
			return -1;
		
		for (int i = 1; i <= X; i++) {
			int p = i;
			position = IntStream.range(0, A.length).filter(pos -> p == A[pos]).findFirst().orElse(-1);
			if (position != -1) {
				maxPosition = maxPosition < position ? position : maxPosition;
			}
			else
				return -1;
			position = A.indexOf(i);
		}	
		return maxPosition;*/
        HashSet<Integer> hset = new HashSet<Integer>();

        for (int i = 0 ; i < A.length; i++) {
            if (A[i] <= X)
               hset.add(A[i]);   
            if (hset.size() == X)
               return i;
        }

        return -1;
	}
}
