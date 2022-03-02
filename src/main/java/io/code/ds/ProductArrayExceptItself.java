package io.code.ds;

public class ProductArrayExceptItself {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 0 };
		int[] result = solve(arr);
		for (int i : result) {
			System.out.println(i);
		}
	}

	// Make sure to check for the edge case where we can run into
	// Divide By Zero Exception.
	public static int[] solve(int[] arr) {
		int[] result = new int[arr.length];
		int prod = 1;
		for (int i : arr) {
			prod = prod * i;
		}
		for (int i = 0; i < arr.length; i++) {
			if (prod == 0) {
				if (arr[i] == 0) {
					result[i] = 1;
				} else {
					result[i] = 0;
				}
			} else {
				result[i] = prod / arr[i];
			}
		}
		return result;
	}
}
