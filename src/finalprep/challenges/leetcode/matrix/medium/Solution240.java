package finalprep.challenges.leetcode.matrix.medium;

/**
 *
 * @author adb
 */
public class Solution240{

  public boolean searchMatrix(int[][] matrix, int target){
    if(matrix.length == 0 || matrix[0].length == 0){
      return false;
    }

    int ix = 0;
    int jy = matrix[ix].length - 1;

    while(ix < matrix.length && jy >= 0){
      if(matrix[ix][jy] == target){
        return true;
      }

      if(matrix[ix][jy] > target){
        jy--;
      }else{
        ix++;
      }
    }

    return false;
  }
}
