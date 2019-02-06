package finalprep.challenges.leetcode.arrays.easy;

/**
 *
 * @author adb
 */
public class Solution977{

  public int[] sortedSquares(int[] A){
    int[] result;
    int breakCurr = 0;

    if(A.length <= 0){
      return A;
    }

    while(breakCurr < A.length && A[breakCurr] < 0){
      breakCurr++;
    }

    result = new int[A.length];
    for(int ix = 0, jy = breakCurr - 1, kz = breakCurr; ix < A.length; ix++){
      long num = 0;

      if(kz >= A.length){
        num = Math.abs(A[jy]);
        jy--;
      }else if(jy <= -1){
        num = A[kz];
        kz++;
      }else{
        if(Math.abs(A[jy]) < A[kz]){
          num = Math.abs(A[jy]);
          jy--;
        }else{
          num = A[kz];
          kz++;
        }
      }

      num = num * num;
      num = num > Integer.MAX_VALUE ? Integer.MAX_VALUE : (num < Integer.MIN_VALUE ? Integer.MIN_VALUE : num);
      result[ix] = (int)num;
    }

    return result;
  }
}
