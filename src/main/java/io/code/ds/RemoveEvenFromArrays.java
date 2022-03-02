package io.code.ds;

import java.util.ArrayList;
import java.util.List;

public class RemoveEvenFromArrays {

  public static void main(String[] args) {
    int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7 };
    int[] result = solve(arr);
    for (int i : result) {
      System.out.println(i);
    }
  }

  public static int[] solve(int[] arr) {
    List<Integer> list = new ArrayList<>();
    for (int i : arr) {
      if (i % 2 != 0) {
        list.add(i);
      }
    }

    int[] result = new int[list.size()];
    for (int i = 0; i < list.size(); i++) {
      result[i] = list.get(i);
    }
    return result;
  }
}
