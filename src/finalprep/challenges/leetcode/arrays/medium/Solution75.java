package finalprep.challenges.leetcode.arrays.medium;

/**
 *
 * @author adb
 */
public class Solution75{

  public void sortColors(int[] nums){
    int ix = 0, jy = nums.length - 1;

    for(int kz = 0; kz <= jy;){
      int z = nums[kz];

      switch(z){
        case 0:
          nums[kz] = nums[ix];
          nums[ix] = z;
          ix++;
          kz++;
          break;
        case 1:
          kz++;
          break;
        case 2:
          nums[kz] = nums[jy];
          nums[jy] = z;
          jy--;
      }
    }
  }
}
