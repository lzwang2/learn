import algorithm.KMP;

/**
 * @author lzwang
 * @description: TODO
 * @date 2023/3/24
 */
public class TestMain {

  public static void main(String[] args) {
    System.out.println(new KMP().match("ababababca", "abababca", new int[]{0, 0, 0, 1, 2, 3, 4, 0, 1}));
  }

}
