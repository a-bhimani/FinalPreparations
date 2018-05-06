package finalprep.challenges.leetcode.weekly;

import java.util.Arrays;
import java.util.HashSet;

/**
 *
 * @author adb
 */
public class Solution825{

  public int numFriendRequests(int[] ages){
    int ct = 0;
    int recur = 1;
    long startTime = System.nanoTime();

    Arrays.sort(ages);

    for(int ix = ages.length - 1; ix > 0; ix--){
      int ageA = ages[ix];

      for(int jy = ix - 1; jy >= 0; jy--){
        int ageB = ages[jy];

        if(ageA == ageB){
          recur++;
          //continue;
        }

        if(recur > 1){
          recur = 1;
          ct += factorial(recur);
        }

        if(((0.5 * ageA) + 7) >= ageB){
          break;
        }

        ct++;
      }
    }

    System.out.println((float)(System.nanoTime() - startTime) / 1000000 + " ms");
    return ct;
  }

  public int factorial(int num){
    if(num == 1){
      return 1;
    }

    return num * factorial(num - 1);
  }
}
