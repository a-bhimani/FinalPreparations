package finalprep.challenges.pramp;

/**
 *
 * @author adb
 */
public class IslandCount{

  static int getNumberOfIslands(int[][] binaryMatrix){
    int sumIslands = 0;

    for(int ix = 0; ix < binaryMatrix.length; ix++){
      for(int jy = 0; jy < binaryMatrix[ix].length; jy++){
        if(binaryMatrix[ix][jy] == 1){
          dfs(binaryMatrix, ix, jy);
          sumIslands++;
        }
      }
    }

    return sumIslands;
  }

  private static void dfs(int[][] g, int i, int j){
    if(i < 0 || j < 0 || i >= g.length || j >= g[i].length || g[i][j] == 0){
      return;
    }

    g[i][j] = 0;
    dfs(g, i - 1, j);
    dfs(g, i + 1, j);
    dfs(g, i, j - 1);
    dfs(g, i, j + 1);
  }
}
