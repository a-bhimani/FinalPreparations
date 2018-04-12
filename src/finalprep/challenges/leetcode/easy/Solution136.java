package finalprep.challenges.leetcode.easy;

/**
 *
 * @author adb
 */
public class Solution136{

  public int singleNumber(int[] nums){
    //HashSet<Integer> set=new HashSet<>();

    //for(int ix=0; ix<nums.length; ix++){
    //    if(set.contains(nums[ix])){
    //        set.remove(nums[ix]);
    //    }else{
    //        set.add(nums[ix]);
    //    }
    //}
    //return set.iterator().next();
    int n = 0;

    for(int ix = 0; ix < nums.length; ix++){
      if(ix == 0){
        n = nums[ix];
      }else{
        n = n ^ nums[ix];
      }
    }

    return n;
  }

}
