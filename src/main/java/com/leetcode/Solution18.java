package com.leetcode;


// dfs解法
public class Solution18 {

    private static final int[] dx = {1, -1, 0, 0};
    private static final int[] dy = {0, 0, 1, -1};

    public static int sum(int x) {
        int ans = 0;
        while (x > 0) {
            ans += x % 10;
            x /= 10;
        }
        return ans;
    }

    public static int move(int threshold, int rows, int cols, int x, int y, boolean[][] vis) {

        vis[x][y] = true;
        int ans = 0;
        for (int i = 0; i < 4; i++) { // 向四个方向走
            int X = x + dx[i];
            int Y = y + dy[i];

            if (X >= 0 && Y >= 0 && X < rows && Y < cols && !vis[X][Y] && sum(X) + sum(Y) <= threshold) {
                ans += move(threshold, rows, cols, X, Y, vis) + 1;
            }
        }
        return ans;
    }

    public static int movingCount(int threshold, int rows, int cols) {
        if (threshold < 0 || rows <= 0 || cols <= 0) {
            return 0;
        }
        boolean[][] vis = new boolean[rows][cols];
        return move(threshold, rows, cols, 0, 0, vis) + 1;
    }

    public static void main(String[] args) {
       int rem= movingCount(18,20,30);
        System.out.println(rem);
    }
}
// bfs解法也很好写，大家可以试一下。