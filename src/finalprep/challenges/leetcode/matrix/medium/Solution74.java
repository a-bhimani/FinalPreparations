package finalprep.challenges.leetcode.matrix.medium;

/**
 *
 * @author adb
 */
public class Solution74{

  public boolean searchMatrix(int[][] matrix, int target){
    for(int ix = 0; ix < matrix.length; ix++){
      if((matrix[ix].length > 0) && target >= matrix[ix][0] && target <= matrix[ix][matrix[0].length - 1]){
        for(int jy = 0, kz = matrix[ix].length - 1; jy <= kz; jy++, kz--){
          if(target == matrix[ix][jy] || target == matrix[ix][kz]){
            return true;
          }
        }
      }
    }

    return false;
  }
}
