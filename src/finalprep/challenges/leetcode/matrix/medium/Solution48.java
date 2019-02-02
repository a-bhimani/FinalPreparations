package finalprep.challenges.leetcode.matrix.medium;

/**
 *
 * @author adb
 */
public class Solution48{

  public void rotate(int[][] matrix){
    int n = matrix.length;

    for(int ix = 0, jy = n - 1; ix < n; ix++, jy--){
      for(int kz = ix, la = n - 1 - ix; kz < n - ix - 1; kz++, la--){
        int t = matrix[ix][kz];
        matrix[ix][kz] = matrix[la][ix];
        matrix[la][ix] = matrix[jy][la];
        matrix[jy][la] = matrix[kz][jy];
        matrix[kz][jy] = t;
      }
    }
  }
}
