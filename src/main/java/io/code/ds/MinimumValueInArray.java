package io.code.ds;

public class MinimumValueInArray {

  public static void main(String[] args) {
    int[] arr = new int[] { 9, 2, 3, 6 };
    int result = solve(arr);
    System.out.println(result);
  }

  public static int solve(int[] arr) {
    int min = Integer.MAX_VALUE;
    for (int i : arr) {
      if (i <= min) {
        min = i;
      }
    }
    return min;
  }
}
