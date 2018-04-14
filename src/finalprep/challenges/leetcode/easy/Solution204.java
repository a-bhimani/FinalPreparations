package finalprep.challenges.leetcode.easy;

/**
 *
 * @author adb
 */
public class Solution204{

  public int countPrimes(int n){
    int ct = 0;
    long dtPresent = System.nanoTime();

    for(int ix = 2; ix < n; ix++){
      boolean isPrime = true;

      if(ix % 2 == 0){
        continue;
      }

      for(int jy = 2; jy <= ix / 2; jy++){
        if(jy % 2 == 0){
          continue;
        }

        if(ix % jy == 0){
          isPrime = false;
          break;
        }
      }

      if(isPrime){
        ct++;
      }
    }

    System.out.println((System.nanoTime() - dtPresent) / 1000000 + "ms");
    return ct;
  }
}
