package finalprep.challenges.leetcode.arrays.easy;

import java.util.Arrays;

/**
 *
 * @author adb
 */
public class Solution66{

  public int[] plusOne(int[] digits){
    int[] result = new int[digits.length + 1];
    int toCarry = 1;

    for(int ix = digits.length - 1, jy = digits.length; ix >= 0; ix--, jy--){
      int newSum = digits[ix] + toCarry;

      if(newSum >= 10){
        result[jy] = newSum % 10;
        toCarry = 1;
      }else{
        result[jy] = newSum;
        toCarry = 0;
      }
    }

    if(toCarry == 1){
      result[0] = 1;
    }else{
      result = Arrays.copyOfRange(result, 1, result.length);
    }

    return result;
  }
}
