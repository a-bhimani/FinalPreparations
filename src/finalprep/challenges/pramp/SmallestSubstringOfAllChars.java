package finalprep.challenges.pramp;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author adb
 */
public class SmallestSubstringOfAllChars{

  public static String getShortestUniqueSubstring(char[] arr, String str){
    // your code goes here
    Set<Character> set = new HashSet<>();
    String shortString = "";

    for(int ix = 0; ix < arr.length; ix++){
      set.add(arr[ix]);
    }

    for(int ix = 0; ix < str.length() - (set.size() - 1); ix++){
      if(set.contains(str.charAt(ix))){
        String newString = stringSpan(arr, str, ix);

        if(newString.length() > 0 && (shortString.length() == 0 || shortString.length() > newString.length())){
          shortString = newString;
        }
      }
    }

    return shortString;
  }

  private static String stringSpan(char[] arr, String str, int begin){
    int startIndex = begin;
    int ix = startIndex;
    Map<Character, Integer> mpChars = new HashMap<>();

    for(int jy = 0; jy < arr.length; jy++){
      mpChars.put(arr[jy], mpChars.getOrDefault(arr[jy], 0) + 1);
    }

    while(!mpChars.isEmpty() && ix < str.length()){
      if(mpChars.containsKey(str.charAt(ix))){
        int c = mpChars.getOrDefault(str.charAt(ix), 0) - 1;

        if(c <= 0){
          mpChars.remove(str.charAt(ix));
        }
      }

      ix++;
    }

    return mpChars.size() > 0 ? "" : str.substring(startIndex, ix);
  }
}
