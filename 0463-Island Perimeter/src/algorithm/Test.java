package algorithm;

class Solution {
    public int islandPerimeter(int[][] grid) {
        int islands = 0;
        int neighours = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    islands++;
                    if (i < grid.length - 1 && grid[i + 1][j] == 1) {
                        neighours++;
                    }
                    if (j < grid[i].length - 1 && grid[i][j + 1] == 1) {
                        neighours++;
                    }
                }
            }
        }
        return islands * 4 - neighours * 2;
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] grid = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
        int res = solution.islandPerimeter(grid);
        System.out.println("岛屿周长:" + res);
    }
}
