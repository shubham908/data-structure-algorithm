package io.code.ds;

public class Merge2SortedArrays {

	public static void main(String[] args) {
		int[] arr1 = new int[] {1, 3, 5, 7};
		int[] arr2 = new int[] {2, 4, 6};
		
		int[] result = solve(arr1, arr2);
		for (int i: result) {
			System.out.println(i);
		}
	}
	
	public static int[] solve(int[] a1, int[] a2) {
		int[] result = new int[a1.length +  a2.length];
		int idx = 0;
		int p1 = 0;
		int p2 = 0;
		
		while (idx < a1.length + a2.length) {
			int n1 = Integer.MAX_VALUE;
			int n2 = Integer.MAX_VALUE;
			if (p1 < a1.length) {
				n1 = a1[p1];
			}
			if (p2 < a2.length) {
				n2 = a2[p2];
			}
			
			if (n1 <= n2) {
				result[idx] = n1;
				p1++;
			} else {
				result[idx] = n2;
				p2++;
			}
			idx++;
		}
		
		return result;
	}
}
