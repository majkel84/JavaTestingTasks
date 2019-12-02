package pl.TestingTasks;

import java.util.Arrays;

public class TimeComplexity {

	public int FrogJump(int X, int Y, int D) {
		int solution = Y - X;
		return solution % D == 0 ? solution /= D : (solution /= D) + 1;
	}
	
	public int PermMissingElem(int[] A) {
		if (A.length == 0)
			return 1;
		Arrays.sort(A);
		if (A[0]!=1)
			return 1;
		if (A.length == A[A.length-1])
			return A.length + 1;
	    if (A.length == 1 && A[0] != 1)
	        return 1;
			    for (int i = 0; i < A.length - 1; i++)
	        if (A[i+1] - A[i] != 1)
	            return i+2;
		System.out.println(A.length);
		return 0;
	}
}
