package finalprep.challenges.leetcode.easy;

/**
 *
 * @author adb
 */
public class Solution13{

  public int romanToInt(String s){
    int numeral = 0;

    for(int ix = s.length() - 1; ix >= 0; ix--){
      switch(s.charAt(ix)){
        case 'I':
        case 'i':
          numeral = numeral + ((numeral < 5) ? 1 : -1);
          break;
        case 'V':
        case 'v':
          numeral += 5;
          break;
        case 'X':
        case 'x':
          numeral = numeral + ((numeral < 50) ? 10 : -10);
          break;
        case 'L':
        case 'l':
          numeral += 50;
          break;
        case 'C':
        case 'c':
          numeral = numeral + ((numeral < 500) ? 100 : -100);
          break;
        case 'D':
        case 'd':
          numeral += 500;
          break;
        case 'M':
        case 'm':
          numeral += 1000;
          break;
      }
    }

    return numeral;
  }
}
