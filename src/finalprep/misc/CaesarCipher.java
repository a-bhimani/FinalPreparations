package finalprep.misc;

/**
 *
 * @author adb
 */
public class CaesarCipher{

  public static String encrypt(String str, int offset){
    StringBuilder sb = new StringBuilder();

    for(int ix = 0; ix < str.length(); ix++){
      int c = ((int)str.charAt(ix));
      int z = Character.isUpperCase(str.charAt(ix)) ? 65 : 97;

      sb.append((char)(((c - z + offset) % 26) + z));
    }

    return sb.toString();
  }

  public static String decrypt(String str, int offset){
    StringBuilder sb = new StringBuilder();

    for(int ix = 0; ix < str.length(); ix++){
      int c = ((int)str.charAt(ix));
      int z = Character.isUpperCase(str.charAt(ix)) ? 65 : 97;

      sb.append((char)(((c - z + (26 - offset)) % 26) + z));
    }

    return sb.toString();
  }
}
