package finalprep.challenges.leetcode.matrix.easy;

/**
 *
 * @author adb
 */
public class Solution733{

  public int[][] floodFill(int[][] image, int sr, int sc, int newColor){
    int[][] newImg;

    if(image[sr][sc] == newColor){
      return image;
    }

    newImg = image.clone();
    borderFill(newImg, sr, sc, image[sr][sc], newColor);

    return newImg;
  }

  private void borderFill(int[][] newImg, int i, int j, int origClr, int newClr){
    if(i < 0 || i >= newImg.length || j < 0 || j >= newImg[0].length){
      return;
    }

    if(newImg[i][j] == origClr){
      newImg[i][j] = newClr;
      borderFill(newImg, i - 1, j, origClr, newClr);
      borderFill(newImg, i + 1, j, origClr, newClr);
      borderFill(newImg, i, j - 1, origClr, newClr);
      borderFill(newImg, i, j + 1, origClr, newClr);
    }
  }
}
