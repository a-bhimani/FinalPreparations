package finalprep.challenges.leetcode.easy;

/**
 *
 * @author adb
 */
public class Solution303{

  private int[] nums;

  public Solution303(int[] nums){
    this.nums = nums;
  }

  public int sumRange(int i, int j){
    int sum = 0;

    for(int ix = i; ix <= j; ix++){
      sum += this.nums[ix];
    }

    return sum;
  }
}

/**
 * Your NumArray object will be instantiated and called as such: NumArray obj = new NumArray(nums); int param_1 =
 * obj.sumRange(i,j);
 */
