package finalprep.challenges.leetcode.matrix.easy;

/**
 *
 * @author adb
 */
public class Solution566{

  public int[][] matrixReshape(int[][] nums, int r, int c){
    int nr = nums.length;
    int nc = 0;
    int[][] arrResult;
    int x, y;

    if(nr == 0){
      return nums;
    }

    nc = nums[0].length;
    if((nc == 0) || (nr * nc) != (r * c)){
      return nums;
    }

    arrResult = new int[r][c];
    x = 0;
    y = 0;

    for(int ix = 0; ix < r; ix++){
      for(int jy = 0; jy < c; jy++){
        if(y >= nc){
          x++;
          y = 0;
        }

        //arrResult[ix][jy] = 1;
        arrResult[ix][jy] = nums[x][y];
        y++;
      }
    }

    return arrResult;
  }
}
