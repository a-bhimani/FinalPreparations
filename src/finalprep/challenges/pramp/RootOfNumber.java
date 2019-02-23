package finalprep.challenges.pramp;

/**
 *
 * @author adb
 */
public class RootOfNumber{

  static double root(double x, int n){
    double lo = 0, hi = Math.max(1, x), mid = (lo + hi) / 2;

    while(mid - lo >= 0.001){
      if(Math.pow(mid, n) > x){
        hi = mid;
      }else{
        lo = mid;
      }

      mid = (lo + hi) / 2;
    }

    return mid;
  }
}
