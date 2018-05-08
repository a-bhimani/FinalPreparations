package finalprep.challenges.leetcode.commons;

import static java.lang.Math.*;

/**
 *
 * @author adb
 */
public class Math{

  public static boolean isPrime(int n){
    int m = (int)sqrt(n);

    if(n <= 1){
      return false;
    }

    if(n == 2){
      return true;
    }

    if(n % 2 == 0){
      return false;
    }

    for(int i = 3; i <= m; i += 2){
      if(n % i == 0){
        return false;
      }
    }

    return true;
  }

  public static int[] allPrimes(int n){

    return new int[]{};
  }

  public static int[] factors(int n){

    return new int[]{};
  }

  public static int gcd(int a, int b){
    if(b == 0){
      return a;
    }

    return gcd(b, a % b);
  }

  public static int lcm(int a, int b){

    return b * a / gcd(a, b);
  }
}
