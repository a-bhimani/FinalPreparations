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

  private void swapNums(int[] ar, int i, int j){
    ar[i] ^= ar[j];
    ar[j] ^= ar[i];
    ar[i] ^= ar[j];
  }

  //O(N^2)
  public int[] BubbleSort(){
    int[] nums = this.nums;
    long startTime = System.nanoTime();

    nanoSecondsElapsed = 0;
    for(int ix = 0; ix < nums.length - 1; ix++){
      for(int jy = ix; jy < nums.length - 1 - ix; jy++){
        if(nums[ix] > nums[jy]){
          swapNums(nums, ix, jy);
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
      for(int jy = ix - 1; jy >= 0 && (nums[jy] > nums[jy + 1]); jy--){
        swapNums(nums, jy + 1, jy);
      }
    }

    nanoSecondsElapsed = System.nanoTime() - startTime;
    return nums;
  }

  //O(N^2)
  public int[] SelectionSort(){
    int[] nums = this.nums;
    long startTime = System.nanoTime();

    nanoSecondsElapsed = 0;
    for(int ix = 0; ix < nums.length - 1; ix++){
      int i = ix, j = ix;

      for(int jy = ix; jy < nums.length - 1; jy++){
        if(nums[jy] < nums[j]){
          j = jy;
        }
      }

      if(j > i){
        swapNums(nums, i, j);
      }
    }

    nanoSecondsElapsed = System.nanoTime() - startTime;
    return nums;
  }

  public int[] MergeSort(){
    int[] nums = this.nums;
    long startTime = System.nanoTime();

    nanoSecondsElapsed = 0;
    //here

    nanoSecondsElapsed = System.nanoTime() - startTime;
    return nums;
  }

  public int[] QuickSort(){
    int[] nums = this.nums;
    long startTime = System.nanoTime();

    nanoSecondsElapsed = 0;
    //here

    nanoSecondsElapsed = System.nanoTime() - startTime;
    return nums;
  }
}
