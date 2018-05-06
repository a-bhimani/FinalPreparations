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

    if(i > this.nums.length - 1 || j < 0){
      return 0;
    }

    if(i >= j){
      return (i > j) ? 0 : this.nums[i];
    }

    sum += this.nums[i] + this.nums[j];
    sum += this.sumRange(++i, --j);

    return sum;
  }
}

/**
 * Your NumArray object will be instantiated and called as such: NumArray obj = new NumArray(nums); int param_1 =
 * obj.sumRange(i,j);
 */
