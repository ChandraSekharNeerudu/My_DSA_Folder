package corp.Backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RatInAMaze {
	public static List<String> findPath(int[][] maze, int n) {
        List<String> result = new ArrayList<>();
        
        // Edge Case: If start or destination is blocked, return empty list
        if (maze[0][0] == 0 || maze[n - 1][n - 1] == 0) {
            return result;
        }

        boolean[][] visited = new boolean[n][n];
        
        // Start backtracking from (0, 0)
        solve(0, 0, maze, n, "", visited, result);
        
        // Sort paths alphabetically (Lexicographical order)
        Collections.sort(result);
        return result;
    }

    private static void solve(int row, int col, int[][] maze, int n, 
                              String currentPath, boolean[][] visited, List<String> result) {
        
        // Base Case: Reached destination (n - 1, n - 1)
        if (row == n - 1 && col == n - 1) {
            result.add(currentPath);
            return;
        }

        // Mark current cell as visited
        visited[row][col] = true;

        // Direction arrays for D, L, R, U (Alphabetical traversal order helps)
        int[] dRow = {1, 0, 0, -1};
        int[] dCol = {0, -1, 1, 0};
        char[] directions = {'D', 'L', 'R', 'U'};

        for (int i = 0; i < 4; i++) {
            int nextRow = row + dRow[i];
            int nextCol = col + dCol[i];

            // Check validity of next move
            if (isValid(nextRow, nextCol, maze, n, visited)) {
                solve(nextRow, nextCol, maze, n, currentPath + directions[i], visited, result);
            }
        }

        // Backtrack: Unmark current cell for other path explorations
        visited[row][col] = false;
    }

    private static boolean isValid(int r, int c, int[][] maze, int n, boolean[][] visited) {
        return (r >= 0 && r < n && c >= 0 && c < n && maze[r][c] == 1 && !visited[r][c]);
    }

    public static void main(String[] args) {
        int[][] maze = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {1, 1, 0, 0},
            {0, 1, 1, 1}
        };
        int n = maze.length;

        List<String> paths = findPath(maze, n);
        System.out.println("Possible Paths: " + paths);
    }
}
