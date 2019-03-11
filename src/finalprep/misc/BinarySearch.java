package finalprep.misc;

/**
 *
 * @author adb
 */
public class BinarySearch{

  public static int iterate(int[] nums, int k){
    int l = 0, h = nums.length - 1, m = -1;

    while(l <= h){
      m = l + (h - l) / 2;

      if(nums[m] == k){
        return m;
      }

      l = nums[m] < k ? m + 1 : l;
      h = nums[m] > k ? m - 1 : h;
    }

    return -1;
  }

  public static int recur(int[] nums, int l, int h, int k){
    int m = l + (h - l) / 2;

    if(l > h){
      return -1;
    }

    if(nums[m] == k){
      return m;
    }

    l = nums[m] < k ? m + 1 : l;
    h = nums[m] > k ? m - 1 : h;

    return recur(nums, l, h, k);
  }
}
