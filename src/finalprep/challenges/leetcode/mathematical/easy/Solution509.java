package finalprep.challenges.leetcode.mathematical.easy;

/**
 *
 * @author adb
 */
public class Solution509{

  public int fib(int N){
    int[] answer = new int[N + 1];

    for(int ix = 1, nextSequence = 1; ix <= N; ix++){
      nextSequence += ix > 1 ? answer[ix - 2] : 0;
      answer[ix] = nextSequence;
    }

    return answer[N];
  }
}
