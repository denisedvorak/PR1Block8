package org.campus02.pr1.recursion.lv;

public class RecursiveMaths {

	public static int sum(int n) {
		if(n == 0) {
			return 0;
		}
		return sum(n-1)+n;
	}
	
	public static int fibonacci(int n) {
		if(n <= 2) {
			return 1;
		}
		return fibonacci(n-1) + fibonacci(n-2);
	}
	
	public static long factorial(int n) {
		if(n <= 1) {
			return 1;
		}
		return n * factorial(n-1);
	}
	
}
