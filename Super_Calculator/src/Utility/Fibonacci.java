package Utility;

public class Fibonacci {

	
	public int fibonacci_Sequence(int num) {
		if (num == 0 || num == 1 || num == 2)
			return 1;
		
		else 
			return fibonacci_Sequence(num-1) + fibonacci_Sequence(num-2);
	}
}
