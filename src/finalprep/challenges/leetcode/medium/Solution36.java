package finalprep.challenges.leetcode.medium;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author adb
 */
public class Solution36{

  public boolean isValidSudoku(char[][] board){
    int i = board.length;
    Set<String> qSet;

    if(i == 0 || (i != board[0].length)){
      return false;
    }

    qSet = new HashSet<>();
    for(int ix = 0; ix < i; ix++){
      Set<Character> xSet = new HashSet<>();
      Set<Character> ySet = new HashSet<>();

      for(int jy = 0; jy < i; jy++){
        char x = board[ix][jy];
        char y = board[jy][ix];

        if(Character.isDigit(x)){
          if(!xSet.add(x)){
            return false;
          }

          //System.out.println(ix / 3 + "-" + jy / 3 + "-" + x);
          if(!qSet.add(ix / 3 + "-" + jy / 3 + "-" + x)){
            return false;
          }
        }

        if(Character.isDigit(y)){
          if(!ySet.add(y)){
            return false;
          }
        }
      }
    }

    return true;
  }
}
