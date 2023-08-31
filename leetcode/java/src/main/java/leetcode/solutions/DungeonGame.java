package leetcode.solutions;

/**
 * @author lzwang
 * @description: TODO
 * @date 2023/1/16
 */
public class DungeonGame {

  public int calculateMinimumHP(int[][] dungeon) {

    int n = dungeon.length;
    int m = dungeon[0].length;

    int[] d = new int[n + 1];
    for (int i = 0; i <= n; ++i) {
      d[i] = Integer.MAX_VALUE;
    }
    d[n - 1] = 1;

    for (int j = m - 1; j >= 0; j--) {
      for (int i = n - 1; i >= 0; i--) {
        d[i] = Math.max(Math.min(d[i], d[i + 1]) - dungeon[i][j], 1);
      }
    }

    return d[0];

  }

}
