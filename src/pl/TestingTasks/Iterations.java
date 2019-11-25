package pl.TestingTasks;

import java.util.*;

public class Iterations {
	
	public int BinaryGap(int n) {
	    Vector<Integer> v = new Vector<>();
	    int gap = 0;
	    int longestGap = 0;

	    while (n > 0 && n % 2 == 0){
	        v.add(n % 2);
	        n /=2;
	    }
	    while (n > 0)
	    {
	        v.add(n % 2);
	        if ((int)v.lastElement() == 1)
	            gap = 0;
	        else
	        {
	            gap++;
	            if (gap > longestGap)
	                longestGap = gap;
	        }
	        n = n / 2;
	    }

	    return longestGap;
	}

}
