package pl.TestingTasks;

import java.util.HashSet;

public class Arrays {
        
	public int OddOccurrencesInArray(int[] A) {

		int solution = 0;
		HashSet<Integer> duplicate = new HashSet<Integer>();
		
		for (int i = 0; i < A.length; i++) {
			if (duplicate.add(A[i])) {
				solution = A[i];
			}
		}
    
	    return solution;
	}
	
	public int[] CyclicRotation(int[] A, int K) {
		int[] solution = new int [A.length];

	    for(int i=0; i<A.length; i++) {
	        int rotationIndex = (i + K) % A.length;
	        solution[rotationIndex] = A[i];
	      }
		return solution;
	}

}
