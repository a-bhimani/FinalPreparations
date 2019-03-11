package finalprep.challenges.pramp;

import finalprep.sorting.Sorter;

/**
 *
 * @author adb
 */
public class PancakeSort{

  public static int[] PancakeSort(int[] arr){
    // your code goes here
    Sorter.printArray("Array", arr);

    for(int i = arr.length - 1; i >= 0; i--){
      int maxIndex = -1;
      int maxNum = Integer.MIN_VALUE;

      for(int j = i; j >= 0; j--){
        if(arr[j] > maxNum){
          maxNum = arr[j];
          maxIndex = j;
        }
      }

      flip(arr, maxIndex + 1);
      flip(arr, i + 1);
      Sorter.printArray("i=" + i, arr);
    }

    Sorter.printArray("Pancake Sort", arr);
    return arr;
  }

  private static void flip(int[] arr, int k){
    int i = 0;

    k = k - 1;
    while(i < k && i < arr.length){
      swap(arr, i, k);
      i++;
      k--;
    }
  }

  private static void swap(int[] arr, int i, int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}
