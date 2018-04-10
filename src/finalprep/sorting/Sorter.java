package finalprep.sorting;

import static java.lang.System.out;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author adb
 */
public class Sorter{

  private int[] nums;
  private static long nanoSecondsElapsed;

  public int[] getNumbers(){
    return this.nums;
  }

  static{
    nanoSecondsElapsed = 0;
  }

  private Sorter(){
  }

  public Sorter(int[] nums){
    this.nums = nums;
  }

  public static void PrintTimeElapsed(){
    out.println("Time Elapsed : \t\t" + (float)nanoSecondsElapsed / 1000000 + " ms");
  }

  public static void PrintArray(String heading, int[] nums){
    int jy = 1;
    out.print(heading + " : \t");
    out.print("[");
    for(int ix : nums){
      out.print(ix);
      out.print((jy == nums.length) ? "" : ",");
      jy++;
    }
    out.print("]");
    out.println();
  }

  //O(N^2)
  public int[] BubbleSort(){
    int[] nums = this.nums;
    long startTime = System.nanoTime();
    nanoSecondsElapsed = 0;
    for(int ix = 0; ix < nums.length - 1; ix++){
      for(int jy = ix + 1; jy < nums.length; jy++){
        if(nums[ix] > nums[jy]){
          nums[ix] = nums[ix] + nums[jy];
          nums[jy] = nums[ix] - nums[jy];
          nums[ix] = nums[ix] - nums[jy];
        }
      }
    }
    nanoSecondsElapsed = System.nanoTime() - startTime;
    return nums;
  }

  //O(N^2)
  public int[] InsertionSort(){
    int[] nums = this.nums;
    long startTime = System.nanoTime();
    nanoSecondsElapsed = 0;
    for(int ix = 1; ix < nums.length; ix++){
      for(int jy = ix - 1; jy >= 0; jy--){
        if(nums[jy] < nums[jy]){
          nums[ix] = nums[ix] + nums[jy];
          nums[jy] = nums[ix] - nums[jy];
          nums[ix] = nums[ix] - nums[jy];
        }else{
          break;
        }
      }
    }
    nanoSecondsElapsed = System.nanoTime() - startTime;
    return nums;
  }
}
