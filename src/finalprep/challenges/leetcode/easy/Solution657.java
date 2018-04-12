package finalprep.challenges.leetcode.easy;

/**
 *
 * @author adb
 */
public class Solution657{

  public boolean judgeCircle(String moves){
    int x = 0;
    int y = 0;

    for(int ix = 0; ix < moves.length(); ix++){
      switch(moves.charAt(ix)){
        case 'U':
          x++;
          break;
        case 'D':
          x--;
          break;
        case 'L':
          y--;
          break;
        case 'R':
          y++;
          break;
      }
    }

    return x == 0 && y == 0;
  }
}
