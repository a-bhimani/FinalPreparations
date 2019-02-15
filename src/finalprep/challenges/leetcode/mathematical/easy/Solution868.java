package finalprep.challenges.leetcode.mathematical.easy;

/**
 *
 * @author adb
 */
public class Solution868{

  public int binaryGap(int N){
    boolean b = false;
    int gap = 0, z = 0;

    while(N > 0){
      if(N % 2 == 1){
        b = true;
        gap = Math.max(z, gap);
        z = 0;
      }

      if(b){
        z++;
      }

      N /= 2;
    }

    return gap;
  }
}
