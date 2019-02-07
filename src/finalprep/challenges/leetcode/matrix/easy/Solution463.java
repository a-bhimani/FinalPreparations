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

  private int calcPerimeter(int[][] g, int i, int j){
    int r = 0;

    if(i < 0 || i >= g.length || j < 0 || j >= g[0].length || g[i][j] != 1){
      if(g[i][j] == 0){
        return 1;
      }

      return 0;
    }

    g[i][j] = 2;

    if(j - 1 >= -1){
      if((j - 1 == -1) || g[i][j - 1] == 0){
        r++;
      }else{
        r += calcPerimeter(g, i, j - 1);
      }
    }

    if(j + 1 <= g[0].length){
      if((j + 1 == g[0].length) || g[i][j + 1] == 0){
        r++;
      }else{
        r += calcPerimeter(g, i, j + 1);
      }
    }

    if(i - 1 >= -1){
      if((i - 1 == -1) || g[i - 1][j] == 0){
        r++;
      }else{
        r += calcPerimeter(g, i - 1, j);
      }
    }

    if(i + 1 <= g.length){
      if((i + 1 == g.length) || g[i + 1][j] == 0){
        r++;
      }else{
        r += calcPerimeter(g, i + 1, j);
      }
    }

    return r;
  }
}
