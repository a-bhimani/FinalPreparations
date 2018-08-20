package finalprep.challenges.leetcode.weekly;

/**
 *
 * @author adb
 */
public class Solution849{

  public int maxDistToClosest(int[] seats){
    int i = 0, j = 0, nSize = seats.length;

    for(int ix = 0; ix < nSize; ix++){
      int jy = ix, dA = 0, dB = 0;

      if(seats[ix] == 0){
        while((ix < nSize) && (seats[ix] == 0)){
          ix++;
        }

        dA = (int)Math.ceil((ix - jy) * ((jy == 0) || (ix == nSize) ? 1 : 0.5));
        dB = (int)Math.ceil((j - i) * ((i == 0) ? 1 : 0.5));

        if(dA > dB){
          i = jy;
          j = ix;
        }
      }
    }

    return (int)Math.ceil((j - i) * ((i == 0) || (j == nSize) ? 1 : 0.5));
  }
}
