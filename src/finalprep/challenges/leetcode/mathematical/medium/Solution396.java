package finalprep.challenges.leetcode.mathematical.medium;

import finalprep.sorting.Sorter;

/**
 *
 * @author adb
 */
public class Solution396{

  public int maxRotateFunction(int[] A){
    long max = Integer.MIN_VALUE;
    long[] sumSet = new long[A.length];

    if(A.length == 0){
      return 0;
    }

    for(int ix = 0; ix < A.length; ix++){
      for(int jy = 0, kz = ix; jy < A.length; jy++, kz++){
        kz = kz >= A.length ? 0 : kz;
        sumSet[ix] += jy * A[kz];
      }
    }

    for(long l : sumSet){
      if(l > max){
        max = l;
      }
    }

    return (int)(max > Integer.MAX_VALUE ? Integer.MAX_VALUE : max);
  }
}
