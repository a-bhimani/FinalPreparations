package finalprep.challenges.leetcode.weekly;

/**
 *
 * @author adb
 */
public class Solution831{

  public String maskPII(String S){
    StringBuilder toReturn = new StringBuilder();

    if(S.length() > 0){
      int zeroCh = (int)S.charAt(0);
      zeroCh += (zeroCh >= 65 && zeroCh <= 90) ? 32 : 0;

      if(zeroCh >= 97 && zeroCh <= 122){
        int ix = 1;
        Character lastCh = null;

        while(ix < S.length()){
          int c = (int)S.charAt(ix);

          if(c == 64){
            break;
          }
          lastCh = (char)((c >= 65 && c <= 90) ? c + 32 : c);
          ix++;
        }

        toReturn.insert(0, (char)zeroCh);

        if(lastCh != null){
          toReturn.insert(1, "*****");
          toReturn.insert(6, lastCh);
        }

        for(int jy = 7; ix < S.length(); ix++, jy++){
          int c = (int)S.charAt(ix);
          toReturn.insert(jy, (char)((c >= 65 && c <= 90) ? c + 32 : c));
        }
      }else{
        int ix = S.length() - 1, jy = 1;

        for(ix = S.length() - 1; ix >= 0; ix--){
          zeroCh = (int)S.charAt(ix);
          if(zeroCh >= 48 && zeroCh <= 57){
            toReturn.insert(0, jy <= 4 ? (char)zeroCh : '*');

            switch(jy){
              case 4:
              case 7:
                toReturn.insert(0, '-');
                break;
              case 10:
                if(ix > 0){
                  for(int kz = 0; kz < ix; kz++){
                    int c = (int)S.charAt(kz);

                    if((c >= 48 && c <= 57)){
                      toReturn.insert(0, '-');
                      break;
                    }
                  }
                }
                break;
            }

            jy++;
          }
        }

        if(jy > 11){
          toReturn.insert(0, '+');
        }
      }

    }

    return toReturn.toString();
  }
}
