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

  //using Euclid
  public static int gcd(int a, int b){
    if(b == 0){
      return a;
    }

    return gcd(b, a % b);
  }

  public static int lcm(int a, int b){

    return b * a / gcd(a, b);
  }

  public static int pow(int a, int x){
    int result = 0;

    if(x > 0){
      int increment = a;
      result = a;

      for(int ix = 1; ix < x; ix++){
        for(int jy = 1; jy < a; jy++){
          result += increment;
        }

        increment = result;
      }
    }else{
      result = 1;
    }

    return result;
  }

  public static int pow_recurr(int a, int x){
    if(x > 0){
      return multiple(a, pow_recurr(a, x - 1));
    }

    return 1;
  }

  private static int multiple(int a, int x){
    if(x > 0){
      return a + multiple(a, x - 1);
    }

    return 0;
  }

  public static int[] simpleFibonacci(int n){
    int[] series = new int[n];

    if(series.length > 0){
      series[0] = 1;
    }

    if(series.length > 1){
      series[1] = 1;
    }

    for(int ix = 2; ix < n; ix++){
      series[ix] = series[ix - 2] + series[ix - 1];
    }

    return series;
  }

  public static int getFibonacci(int n){
    if(n == 1){
      return 1;
    }

    if(n == 2){
      return 1;
    }

    return getFibonacci(n - 1) + getFibonacci(n - 2);
  }

  public static int binaryToDecimal(String binary){
    int num = 0;

    for(int ix = binary.length() - 1, jy = 0; ix >= 0; ix--, jy++){
      if(binary.charAt(ix) == '1'){
        num += Math.pow(2, jy);
      }
    }

    return num;
  }

  public static int binaryToDecimal(int binary){
    int num = 0;
    int multiplier = 0;

    while(binary > 0){
      if(binary % 10 == 1){
        num += Math.pow(2, multiplier);
      }

      multiplier++;
      binary /= 10;
    }

    return num;
  }

//  public static String decimalToBinary(int decimal){
//    StringBuilder binary = new StringBuilder();
//
//    while(decimal > 0){
//      binary.insert(0, decimal % 2);
//      decimal /= 2;
//    }
//
//    return binary.toString();
//  }
  public static int decimalToBinary(int decimal){
    int binary = 0;
    int multiplier = 0;

    while(decimal > 0){
      binary += (decimal % 2) * Math.pow(10, multiplier);
      multiplier++;
      decimal /= 2;
    }

    return binary;
  }
}
