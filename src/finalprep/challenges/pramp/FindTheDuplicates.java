package finalprep.challenges.pramp;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author adb
 */
public class FindTheDuplicates{

  static int[] findDuplicates(int[] arr1, int[] arr2){
    Set<Integer> setNums = new LinkedHashSet<>();
    int[] retNums;
    int j = 0;

    for(int ix = 0; ix < (arr1.length > arr2.length ? arr2.length : arr1.length); ix++){
      if(arr1.length > arr2.length){
        if(binarySearch(arr1, arr2[ix], 0, arr1.length - 1)){
          setNums.add(arr2[ix]);
        }
      }else{
        if(binarySearch(arr2, arr1[ix], 0, arr2.length - 1)){
          setNums.add(arr1[ix]);
        }
      }
    }

    retNums = new int[setNums.size()];
    for(Integer i : setNums){
      retNums[j] = i;
      j++;
    }

    return retNums;
  }

  private static boolean binarySearch(int[] arr, int x, int l, int r){
    while(l <= r){
      int m = l + (r - l) / 2;

      if(arr[m] == x){
        return true;
      }

      if(arr[m] < x){
        l = m + 1;
      }else{
        r = m - 1;
      }
    }

    return false;
  }
}
