package io.code.ds;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingInArray {

  public static void main(String[] args) {
    int[] arr = new int[] { 9, 2, 3, 2, 6, 6, 9, 3 };
    int result = solve(arr);
    System.out.println(result);
  }

  public static int solve(int[] arr) {
    Map<Integer, Integer> map = new LinkedHashMap<>();
    for (int i : arr) {
      if (map.containsKey(i)) {
        int val = map.get(i);
        map.put(i, ++val);
      } else {
        map.put(i, 1);
      }
    }
    for (Map.Entry<Integer, Integer> e : map.entrySet()) {
      if (e.getValue() == 1) {
        return e.getKey();
      }
    }
    throw new RuntimeException("No Solution found.");
  }
}
