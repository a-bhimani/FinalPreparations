package finalprep.challenges.leetcode.weekly;

/**
 *
 * @author adb
 */
public class Solution825_brute{

  public int numFriendRequests(int[] ages){
    int ct = 0;
    long startTime = System.nanoTime();

    for(int ix = 0; ix < ages.length; ix++){
      for(int jy = 0; jy < ages.length; jy++){
        int ctx;

        if(ix == jy){
          continue;
        }

        ctx = ages[ix];
        if((ages[jy] > ctx) || (ages[jy] > 100 && ctx < 100) || (ages[jy] <= ((ctx / 2) + 7))){

        }else{
          ct++;
        }
      }
    }

    System.out.println((float)(System.nanoTime() - startTime) / 1000000 + " ms");
    return ct;
  }
}
