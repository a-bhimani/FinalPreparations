package finalprep.challenges.leetcode.matrix.easy;

/**
 *
 * @author adb
 */
public class Solution463{

  public int islandPerimeter(int[][] grid){
    for(int ix = 0; ix < grid.length; ix++){
      for(int jy = 0; jy < grid[ix].length; jy++){
        if(grid[ix][jy] == 1){
          return calcPerimeter(grid, ix, jy);
        }
      }
    }

    return 0;
  }

  private int calcPerimeter(int[][] g, int ix, int jy){
    int sum = 0;

    if(ix < 0 || ix >= g.length || jy < 0 || jy >= g[ix].length || g[ix][jy] == 0){
      return 1;
    }

    if(g[ix][jy] == 2){
      return 0;
    }

    g[ix][jy] = 2;
    sum += calcPerimeter(g, ix - 1, jy);
    sum += calcPerimeter(g, ix + 1, jy);
    sum += calcPerimeter(g, ix, jy - 1);
    sum += calcPerimeter(g, ix, jy + 1);

    return sum;
  }
}
