package finalprep.challenges.leetcode.matrix.easy;

/**
 *
 * @author adb
 */
public class Solution766{

  public boolean isToeplitzMatrix(int[][] matrix){
    int k = matrix.length;
    int l = 0;

    if(k <= 1){
      return true;
    }

    l = matrix[0].length;
    if(l <= 1){
      return true;
    }

    for(int m = k - 1, n = matrix[0].length - 1; (m >= 0) || (n >= 0); m--, n--){
      int i = 0;
      int j = 0;

      m = (m < 0) ? 0 : m;
      n = (n < 0) ? 0 : n;
      i = matrix[m][0];
      j = matrix[0][n];

      for(int ix = m, jy = 0, kz = 0, la = n;
              (ix < k) && (jy < matrix[ix].length);
              ix++, jy++, kz++, la++){
        if((i != matrix[ix][jy]) || (j != matrix[kz][la])){
          return false;
        }
      }
    }

    return true;
  }
}
