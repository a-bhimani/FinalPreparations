package finalprep.challenges.leetcode.arrays.easy;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author adb
 */
public class Solution985{

  public int[] sumEvenAfterQueries(int[] A, int[][] queries){
    Map<Integer, Integer> mpDiff = new HashMap<>();
    int[] result = new int[queries.length];
    long firstSum = 0;

    for(int ix = 0; ix < A.length; ix++){
      mpDiff.put(ix, A[ix]);

      if((A[ix] % 2) == 0){
        firstSum += A[ix];
      }
    }

    for(int ix = 0; ix < queries.length; ix++){
      long prevVal = mpDiff.getOrDefault(queries[ix][1], 0);

      if((prevVal % 2) == 0){
        firstSum -= prevVal;
      }

      prevVal += queries[ix][0];
      prevVal = (prevVal > Integer.MAX_VALUE) ? Integer.MAX_VALUE : ((prevVal < Integer.MIN_VALUE) ? Integer.MIN_VALUE : prevVal);

      if((prevVal % 2) == 0){
        firstSum += prevVal;
        firstSum = (firstSum > Integer.MAX_VALUE) ? Integer.MAX_VALUE : ((firstSum < Integer.MIN_VALUE) ? Integer.MIN_VALUE : firstSum);
      }

      result[ix] = (int)firstSum;
      mpDiff.put(queries[ix][1], (int)prevVal);
    }

    return result;
  }
}
