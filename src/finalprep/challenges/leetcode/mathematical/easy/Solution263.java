package finalprep.challenges.leetcode.mathematical.easy;

/**
 *
 * @author adb
 */
public class Solution263{

  public boolean isUgly(int num){
    while(num > 1){
      if((num % 2) == 0){
        num /= 2;
        continue;
      }

      if((num % 3) == 0){
        num /= 3;
        continue;
      }

      if((num % 5) == 0){
        num /= 5;
        continue;
      }

      break;
    }

    return num == 1;
  }
}
