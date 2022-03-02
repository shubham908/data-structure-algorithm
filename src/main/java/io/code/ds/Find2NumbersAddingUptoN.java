package io.code.ds;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Find2NumbersAddingUptoN {

  public static void main(String[] args) {
    int[] arr = new int[] { 1, 21, 3, 14, 5, 60, 7, 6 };
    int[] result = solve(arr, 27);

    if (Objects.nonNull(result)) {
      for (int i : result) {
        System.out.println(i);
      }
    } else {
      System.out.println("No solution exists");
    }
  }

  public static int[] solve(int[] arr, int sum) {
    Set<Integer> set = new HashSet<>();
    for (int i : arr) {
      if (set.contains(sum - i)) {
        int[] result = new int[2];
        result[0] = sum - i;
        result[1] = i;
        return result;
      } else {
        set.add(i);
      }
    }
    return null;
  }
}
