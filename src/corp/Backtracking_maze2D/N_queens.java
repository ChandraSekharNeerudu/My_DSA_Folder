package corp.Backtracking_maze2D;

import java.util.Arrays;

import corp.Backtracking.n_queens;

public class N_queens {
	public static void main(String[] args) {
		int[][] board=new int[4][4];
		place(0,"",board);
	}

	private static void place(int r,String path, int[][] board) {
		if(r==board.length) {
			for(int[] arr:board)
				System.out.println(Arrays.toString(arr));
			System.out.println(path);
		}
		
		
		for(int c=0;c<board[0].length;c++)
		{
			if(n_queens.isValid(board, r, c))
			{
				board[r][c]=1;
				place(r+1,path+(c+1),board);
				board[r][c]=0;
			}
		}
	}
    
}
