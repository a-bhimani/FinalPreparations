package finalprep.challenges.leetcode.matrix.medium;

/**
 *
 * @author adb
 */
public class Solution240{

  public boolean searchMatrix(int[][] matrix, int target){
    if(matrix.length > 0){
      for(int ix = 0; ix < matrix[0].length; ix++){
        int jy = 0, kz = matrix.length - 1;

        if(target >= matrix[jy][ix] && target <= matrix[kz][ix]){
          while(jy <= kz){
            if(target == matrix[jy][ix] || target == matrix[kz][ix]){
              return true;
            }

            jy++;
            kz--;
          }
        }
      }
    }

    return false;
  }
}
