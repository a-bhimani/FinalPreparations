package finalprep.challenges.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author adb
 */
public class Solution500{

  public String[] findWords(String[] words){
    Set<Character> firstRow = new HashSet<>(Arrays.asList(new Character[]{'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P'}));
    Set<Character> secondRow = new HashSet<>(Arrays.asList(new Character[]{'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L'}));
    Set<Character> thirdRow = new HashSet<>(Arrays.asList(new Character[]{'z', 'x', 'c', 'v', 'b', 'n', 'm', 'Z', 'X', 'C', 'V', 'B', 'N', 'M'}));
    String[] arAns;
    List<String> lstAns = new ArrayList<>();

    for(String word : words){
      if(word.length() > 0){
        int cast = firstRow.contains(word.charAt(0)) ? 1 : (secondRow.contains(word.charAt(0)) ? 2 : 3);
        boolean isCompatible = true;

        for(int ix = 1; ix < word.length(); ix++){
          switch(cast){
            case 1:
              if(!firstRow.contains(word.charAt(ix))){
                isCompatible = false;
              }
              break;
            case 2:
              if(!secondRow.contains(word.charAt(ix))){
                isCompatible = false;
              }
              break;
            case 3:
              if(!thirdRow.contains(word.charAt(ix))){
                isCompatible = false;
              }
              break;
          }

          if(!isCompatible){
            break;
          }
        }

        if(isCompatible){
          lstAns.add(word);
        }
      }
    }

    arAns = new String[lstAns.size()];
    lstAns.toArray(arAns);
    return arAns;
  }
}
