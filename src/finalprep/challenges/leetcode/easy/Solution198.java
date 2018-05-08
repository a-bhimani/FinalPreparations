package finalprep.challenges.leetcode.easy;

/**
 *
 * @author adb
 */
public class Solution198{

  public int rob(int[] nums){
    int sumOdd = 0;
    int sumEven = 0;

    for(int ix = 0; ix < nums.length; ix++){
      if(ix % 2 == 0){
        sumEven += nums[ix];
      }else{
        sumOdd += nums[ix];
      }
    }

    return (sumOdd > sumEven) ? sumOdd : sumEven;
  }
}
