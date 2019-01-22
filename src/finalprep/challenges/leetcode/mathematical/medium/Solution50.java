package finalprep.challenges.leetcode.mathematical.medium;

/**
 *
 * @author adb
 */
public class Solution50{

  public double myPow(double x, int n){
    double result = 0;

    if(x > 0){
      double increment = x;
      result = increment;

      for(int ix = 1; ix < n; ix++){
        for(int jy = 1; jy < x; jy++){
          System.out.print(increment + " ");
          result += increment;
        }

        increment = result;
        System.out.println();
      }
    }else{
      result = 1;
    }

    return result;
  }
}
