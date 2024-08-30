package Practice;

public class NumberOfIslands {
    public static void main(String[] args) {
        int[][] grid = {
                {1, 1, 0, 0, 0},
                {1, 1, 0, 0, 1},
                {0, 0, 0, 1, 1},
                {0, 0, 0, 0, 0},
                {1, 0, 1, 0, 1}
        };

        System.out.println("Number of islands: " + countIslands(grid));
    }

    public static int countIslands(int[][] grid) {
        // Check for empty grid
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int numIslands = 0;
        int numRows = grid.length;
        int numCols = grid[0].length;

        // Traverse each cell in the grid
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                // If the cell is land (1), it's a new island
                if (grid[i][j] == 1) {
                    numIslands++;  // Increment island count
                    dfs(grid, i, j);  // Mark all parts of this island
                }
            }
        }

        return numIslands;
    }

    private static void dfs(int[][] grid, int i, int j) {
        int numRows = grid.length;
        int numCols = grid[0].length;

        // Check for out of bounds or water cell (0)
        if (i < 0 || i >= numRows || j < 0 || j >= numCols || grid[i][j] == 0) {
            return;
        }

        // Mark the cell as visited by setting it to 0
        grid[i][j] = 0;

        // Recursively visit all connected neighbors (up, down, left, right)
        dfs(grid, i + 1, j);  // down
        dfs(grid, i - 1, j);  // up
        dfs(grid, i, j + 1);  // right
        dfs(grid, i, j - 1);  // left
    }
}

