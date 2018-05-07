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
    HashSet<Integer> hasRecurred = new HashSet<>();
    long startTime = System.nanoTime();

    Arrays.sort(ages);

    for(int ix = ages.length - 1; ix > 0; ix--){
      int ageA = ages[ix];
      boolean isContained = false;

      for(int jy = ix - 1; jy >= 0; jy--){
        int ageB = ages[jy];

        if(ageA == ageB){
          if(!hasRecurred.contains(ageB)){
            isContained = true;
            recur++;

          }
          continue;
        }

        if(((0.5 * ageA) + 7) >= ageB){
          continue;
        }

        ct++;
      }

      if(isContained){
        hasRecurred.add(ageA);
      }

      if(recur > 1){
        ct += factorial(recur);
        recur = 1;
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
