package finalprep.challenges.leetcode.arrays.easy;

/**
 *
 * @author adb
 */
public class Solution167{

  public int[] twoSum(int[] numbers, int target){
    int ix = 0;
    int jy = numbers.length - 1;
    int sum = numbers[ix] + numbers[jy];

    while(sum != target){
      if(sum < target){
        ix++;
      }else{
        jy--;
      }
      sum = numbers[ix] + numbers[jy];
    }

    return new int[]{ix + 1, jy + 1};
  }
}
