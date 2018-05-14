package finalprep.challenges.leetcode.medium;

/**
 *
 * @author adb
 */
public class Solution540{

  public int singleNonDuplicate(int[] nums){
    int result = 0;

    for(int i = 0; i < nums.length; i++){
      result = result ^ nums[i];
    }

    return result;
  }
}
