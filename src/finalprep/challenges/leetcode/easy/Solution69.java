package finalprep.challenges.leetcode.easy;

/**
 *
 * @author adb
 */
public class Solution69{

  public int mySqrt(int x){
    long i = 3;

    if(x <= 4){
      if(x == 0){
        return 0;
      }

      if((x >= 1) && (x <= 3)){
        return 1;
      }

      if(x == 4){
        return 2;
      }
    }

    while((i * i) <= x){
      i++;

      if(i >= Integer.MAX_VALUE){
        return Integer.MAX_VALUE;
      }
    }

    return (int)i - 1;
  }
}
