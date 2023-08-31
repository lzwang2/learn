package algorithm;

/**
 * @author lzwang
 * @description: TODO
 * @date 2023/3/24
 */
public class KMP {

  public boolean match(String text, String pattern, int[] kmp) {

    int leni = text.length();
    int lenj = pattern.length();
    int i = 0, j = 0;


      while (i < leni && j < lenj) {
        if (text.charAt(i) != pattern.charAt(j)) {
          j = kmp[j];
          if (j == 0) i++;
        } else {
          i++;
          j++;
        }
      }
      return j == lenj;

  }

}
