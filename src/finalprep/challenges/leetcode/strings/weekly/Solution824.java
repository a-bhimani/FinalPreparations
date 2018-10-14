package finalprep.challenges.leetcode.strings.weekly;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author adb
 */
public class Solution824{

  public String toGoatLatin(String S){
    HashSet<Character> vowelSet = new HashSet<>(Arrays.asList(new Character[]{'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U'}));
    List<String> lstWords = new ArrayList<>();

    StringBuilder sb = new StringBuilder();
    int ix = 1;
    String[] words = S.split("\\s+");

    for(String s : words){
      if(s.length() == 0){
        continue;
      }

      StringBuilder ds = new StringBuilder();

      if(vowelSet.contains(s.charAt(0))){
        ds.insert(0, s);
      }else{
        ds.insert(0, s.substring(1));
        ds.append(s.charAt(0));
      }

      ds.append("ma");
      for(int jy = 1; jy <= ix; jy++){
        ds.append("a");
      }
      lstWords.add(ds.toString());
      ix++;
    }

    for(String s : lstWords){
      sb.append(s + " ");
    }

    return sb.toString().trim();
  }
}
