package finalprep.challenges.leetcode.strings.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 *
 * @author adb
 */
public class Solution609{

  public List<List<String>> findDuplicate(String[] paths){
    Map<String, List<String>> mapFiles = new HashMap<>();
    List<List<String>> lstRet;
    Iterator itr;

    for(int ix = 0; ix < paths.length; ix++){
      String[] files = paths[ix].split(" ");

      for(int jy = 1; jy < files.length; jy++){
        String[] fileParts = files[jy].split("[(]");
        List<String> lstItems = new ArrayList<>();

        if(mapFiles.containsKey(fileParts[1])){
          lstItems = mapFiles.get(fileParts[1]);
        }

        lstItems.add(files[0] + "/" + fileParts[0]);
        mapFiles.put(fileParts[1], lstItems);
      }
    }

    itr = mapFiles.entrySet().iterator();
    lstRet = new ArrayList<>();

    while(itr.hasNext()){
      List<String> lstNew = (List<String>)((Map.Entry)itr.next()).getValue();

      if(lstNew.size() > 1){
        lstRet.add(lstNew);
      }

      itr.remove();
    }

    return lstRet;
  }
}
