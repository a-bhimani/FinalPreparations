package finalprep.challenges.leetcode.matrix.easy;

/**
 *
 * @author adb
 */
public class Solution832{

  public int[][] flipAndInvertImage(int[][] A){
    for(int ix = 0; ix < A.length; ix++){
      for(int jy = 0, kz = (A[ix].length - 1); jy <= Math.floor(A[ix].length / 2) - (((A[ix].length % 2) == 0) ? 1 : 0); jy++, kz--){
        int a = A[ix][jy];
        int b = A[ix][kz];

        A[ix][jy] = (b == 0) ? 1 : 0;

        if(jy != kz){
          A[ix][kz] = (a == 0) ? 1 : 0;
        }
      }
    }

    return A;
  }
}
