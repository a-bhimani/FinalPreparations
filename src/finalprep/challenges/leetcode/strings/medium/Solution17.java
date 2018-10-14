package finalprep.challenges.leetcode.strings.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author adb
 */
public class Solution17{

  public List<String> letterCombinations(String digits){
    List<String> lstAns = new ArrayList<>();
    Map<Character, String[]> numMaps = new HashMap<>();

    numMaps.put('2', new String[]{"a", "b", "c"});
    numMaps.put('3', new String[]{"d", "e", "f"});
    numMaps.put('4', new String[]{"g", "h", "i"});
    numMaps.put('5', new String[]{"j", "k", "l"});
    numMaps.put('6', new String[]{"m", "n", "o"});
    numMaps.put('7', new String[]{"p", "q", "r", "s"});
    numMaps.put('8', new String[]{"t", "u", "v"});
    numMaps.put('9', new String[]{"w", "x", "y", "z"});

    for(int ix = 0; ix < digits.length(); ix++){
      if(Character.isDigit(digits.charAt(ix)) && numMaps.containsKey(digits.charAt(ix))){
        String[] ca = numMaps.get(digits.charAt(ix));

        if(lstAns.isEmpty()){
          for(int jy = 0; jy < ca.length; jy++){
            lstAns.add(ca[jy]);
          }
        }else{
          String[] tmpAns = lstAns.toArray(new String[lstAns.size()]);

          for(int jy = 0; jy < ca.length; jy++){
            for(int kz = 0; kz < tmpAns.length; kz++){
              if(jy == 0){
                lstAns.set(kz, lstAns.get(kz) + ca[0]);
              }else{
                lstAns.add(tmpAns[kz] + ca[jy]);
              }
            }
          }
        }
      }
    }

    return lstAns;
  }
}
