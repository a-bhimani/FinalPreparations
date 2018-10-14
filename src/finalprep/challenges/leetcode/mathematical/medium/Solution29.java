package finalprep.challenges.leetcode.mathematical.medium;

/**
 *
 * @author adb
 */
public class Solution29{

  public int divide(int dividend, int divisor){
    boolean isNegative = false;
    int ans = 0;
    long ldividend = 0;
    long ldivisor = 0;

    if(dividend == 0 || divisor == 0){
      return 0;
    }

    if(dividend == divisor){
      return 1;
    }

    if(divisor == 1){
      return dividend;
    }

    isNegative = ((dividend < 0) && (divisor > 0)) || ((dividend > 0) && (divisor < 0));
    ldividend = Math.abs((long)dividend);
    ldivisor = Math.abs((long)divisor);

    if(divisor == -1){
      if(isNegative){
        if(-ldividend < Integer.MIN_VALUE){
          return Integer.MIN_VALUE;
        }

        return -dividend;
      }else{
        if(ldividend > Integer.MAX_VALUE){
          return Integer.MAX_VALUE;
        }

        return Math.abs(dividend);
      }
    }

    while(ldivisor <= ldividend){
      ldividend -= ldivisor;
      ans++;
    }

    return isNegative ? -ans : ans;
  }
}
