package finalprep.challenges.leetcode.medium;

/**
 *
 * @author adb
 */
public class Solution29{

  public int divide(int dividend, int divisor){
    boolean isNegative = false;
    int ans = 0;

    if(dividend == 0 || divisor == 0){
      return 0;
    }

    if(dividend == divisor){
      return 1;
    }

    if(divisor == 1){
      return dividend;
    }

    if(divisor == -1){
      return (dividend < 0) ? (0 - dividend) : dividend;
    }

    if(dividend < 0){
      if((0 - (long)dividend) > Integer.MAX_VALUE){
        return Integer.MAX_VALUE;
      }

      dividend = 0 - dividend;
      isNegative = !isNegative;
    }

    if(divisor < 0){
      if((0 - (long)divisor) > Integer.MAX_VALUE){
        return Integer.MAX_VALUE;
      }

      divisor = 0 - divisor;
      isNegative = !isNegative;
    }

    while(divisor < dividend){
      dividend -= divisor;
      ans++;
    }

    return isNegative ? 0 - ans : ans;
  }
}
