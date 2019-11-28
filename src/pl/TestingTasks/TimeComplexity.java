package pl.TestingTasks;

public class TimeComplexity {

	public int FrogJump(int X, int Y, int D) {
		int solution = Y - X;
		return solution % D == 0 ? solution /= D : (solution /= D) + 1;
	}
}
