package finalprep.challenges.leetcode.arrays.easy;

/**
 *
 * @author adb
 */
public class Solution665{

  public boolean checkPossibility(int[] nums){
    boolean b = false;
    int li = -1;

    if(nums.length <= 1){
      return true;
    }

    for(int ix = 0, jy = nums.length - 1, m = 0; m <= nums.length; ix++, jy++, m++){
      //System.out.println(nums[ix] + ">" + nums[jy]);
      if(nums[ix] > nums[jy]){
        if(b && (li != ix)){
          return false;
        }

        b = true;
        li = ix;

        //if(ix == 0){
        nums[ix] = nums[jy] - 1;
        //}
      }

      if(jy >= nums.length - 1){
        ix = -1;
        jy = 0;
      }
    }

    return true;
  }
}
