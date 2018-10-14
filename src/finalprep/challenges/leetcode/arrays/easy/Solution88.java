package finalprep.challenges.leetcode.arrays.easy;

/**
 *
 * @author adb
 */
public class Solution88{

  public void merge(int[] nums1, int m, int[] nums2, int n){
    int ix = m + n - 1;
    m--;
    n--;

    while(m >= 0 || n >= 0){
      if(m < 0 || (n >= 0 && nums2[n] > nums1[m])){
        nums1[ix] = nums2[n];
        n--;
      }else{
        nums1[ix] = nums1[m];
        m--;
      }
      ix--;
    }
  }
}
