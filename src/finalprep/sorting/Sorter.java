package finalprep.sorting;

import static java.lang.System.out;
import java.util.Random;

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

  public static void printTimeElapsed(){
    out.println("Time Elapsed : \t\t" + (float)nanoSecondsElapsed / 1000000 + " ms");
  }

  public static void printArray(String heading, int[] nums){
    printArray(heading, nums, 0, nums.length - 1);
  }

  public static void printArray(String heading, int[] nums, int i, int j){
    out.print(heading + " : \t");
    out.print("[");
    for(int ix = i; ix <= j; ix++){
      out.print(nums[ix]);
      out.print((ix == j) ? "" : ",");
    }
    out.print("]");
    out.println();
  }

  private void swapNums(int[] ar, int i, int j){
    ar[i] ^= ar[j];
    ar[j] ^= ar[i];
    ar[i] ^= ar[j];
  }

  /*
  ///
    BUBBLE SORT
  ///
   */
  //O(N^2)
  public int[] bubbleSort(){
    int[] nums = this.nums.clone();
    long startTime = System.nanoTime();

    nanoSecondsElapsed = 0;
    printArray("Array", nums);
    for(int ix = 0; ix < nums.length - 1; ix++){
      out.println("C:" + nums[0]);

      for(int jy = 0; jy < nums.length - 1 - ix; jy++){
        if(nums[jy] > nums[jy + 1]){
          swapNums(nums, jy, jy + 1);
        }
      }

      printArray("i=" + ix, nums);
    }

    nanoSecondsElapsed = System.nanoTime() - startTime;
    printArray("Bubble Sort", nums);
    return nums;
  }

  /*
  ///
    INSERTION SORT
  ///
   */
  //O(N^2)
  public int[] insertionSort(){
    int[] nums = this.nums.clone();
    long startTime = System.nanoTime();

    nanoSecondsElapsed = 0;
    printArray("Array", nums);
    for(int ix = 1; ix < nums.length; ix++){
      out.println("C:" + nums[ix]);

      for(int jy = ix; jy > 0; jy--){
        if(nums[jy] < nums[jy - 1]){
          swapNums(nums, jy, jy - 1);
        }
      }

      printArray("i=" + ix, nums);
    }

    nanoSecondsElapsed = System.nanoTime() - startTime;
    printArray("Insertion Sort", nums);
    return nums;
  }

  /*
  ///
    SELECTION SORT
  ///
   */
  //O(N^2)
  public int[] selectionSort(){
    int[] nums = this.nums.clone();
    long startTime = System.nanoTime();

    nanoSecondsElapsed = 0;
    printArray("Array", nums);
    for(int ix = 0; ix < nums.length - 1; ix++){
      int j = ix;

      out.println("C:" + nums[ix]);
      for(int jy = ix; jy < nums.length - 1; jy++){
        if(nums[jy] < nums[j]){
          j = jy;
        }
      }

      if(j > ix){
        swapNums(nums, ix, j);
      }

      printArray("i=" + ix, nums);
    }

    nanoSecondsElapsed = System.nanoTime() - startTime;
    printArray("Insertion Sort", nums);
    return nums;
  }

  /*
  ///
    MERGE SORT
  ///
   */
  public int[] mergeSort(){
    int[] nums = this.nums.clone();
    long startTime = System.nanoTime();

    nanoSecondsElapsed = 0;
    printArray("Array", nums);
    mergeSort(nums);

    nanoSecondsElapsed = System.nanoTime() - startTime;
    printArray("Merge Sort", nums);
    return nums;
  }

  private void mergeSort(int[] nums){
    int i = 0;
    int[] left, right;

    if(nums.length <= 1){
      return;
    }

    left = new int[nums.length / 2];
    right = new int[nums.length - left.length];

    for(int ix = 0; ix < left.length; ix++, i++){
      left[ix] = nums[i];
    }

    for(int ix = 0; ix < right.length; ix++, i++){
      right[ix] = nums[i];
    }

    printArray("l", left);
    printArray("r", right);
    out.println("--------");

    mergeSort(left);
    mergeSort(right);
    merge(left, right, nums);
  }

  public void merge(int[] left, int[] right, int[] nums){
    int ix = 0, jy = 0, kz = 0;

    while(ix < nums.length){
      if(jy >= left.length || (kz < right.length && right[kz] < left[jy])){
        nums[ix] = right[kz];
        kz++;
      }else{
        nums[ix] = left[jy];
        jy++;
      }

      ix++;
    }

    printArray("m", nums);
    out.println("--------");
  }

  /*
  ///
    QUICK SORT
  ///
   */
  public int[] quickSort(){
    int[] nums = this.nums.clone();
    long startTime = System.nanoTime();

    nanoSecondsElapsed = 0;
    printArray("Array", nums);
    quickSort(nums, 0, nums.length - 1);

    nanoSecondsElapsed = System.nanoTime() - startTime;
    printArray("Quick Sort", nums);
    return nums;
  }

  private void quickSort(int[] nums, int i, int j){
    if(i < j){
      int partition = partition(nums, i, j);
      quickSort(nums, i, partition - 1);
      quickSort(nums, partition, j);
    }
  }

  private int partition(int[] nums, int i, int j){
    int ix = i, jy = j, pivot = nums[i + (j - i) / 2];

//    for(int ix = i; ix <= j; ix++){
//      if(nums[ix] < pivot){
//        swapNums(nums, ix, jy);
//        jy++;
//      }
//    }
    while(ix < jy){
      while(ix < jy && nums[ix] < pivot){
        ix++;
      }

      while(ix < jy && nums[jy] > pivot){
        jy--;
      }

      if(ix < jy){
        swapNums(nums, ix, jy);
        ix++;
        jy--;
      }
    }

    out.println("p=" + pivot);
    printArray("p", nums, i, j);
    out.println("--------");
    return ix == i ? ix + 1 : ix;
  }
}
