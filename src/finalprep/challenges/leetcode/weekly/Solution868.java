package finalprep.challenges.leetcode.weekly;

/**
 *
 * @author adb
 */
public class Solution868{

  public int[][] transpose(int[][] A){
    int[][] tra;

    if(A.length == 0){
      return null;
    }

    tra = new int[A[0].length][];
    for(int ix = 0; ix < tra.length; ix++){
      tra[ix] = new int[A.length];

      for(int jy = 0; jy < tra[ix].length; jy++){
        tra[ix][jy] = A[jy][ix];
      }
    }

    return tra;
  }
}
