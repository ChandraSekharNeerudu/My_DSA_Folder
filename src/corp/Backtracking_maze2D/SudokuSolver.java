package corp.Backtracking_maze2D;

public class SudokuSolver {
	public static void main(String[] args) {
		int[][] board={
	            {5, 3, 0, 0, 7, 0, 0, 0, 0},
	            {6, 0, 0, 1, 9, 5, 0, 0, 0},
	            {0, 9, 8, 0, 0, 0, 0, 6, 0},
	            {8, 0, 0, 0, 6, 0, 0, 0, 3},
	            {4, 0, 0, 8, 0, 3, 0, 0, 1},
	            {7, 0, 0, 0, 2, 0, 0, 0, 6},
	            {0, 6, 0, 0, 0, 0, 2, 8, 0},
	            {0, 0, 0, 4, 1, 9, 0, 0, 5},
	            {0, 0, 0, 0, 8, 0, 0, 7, 9}
	        };
		if(solve(board)) {
			display(board);
		}else System.out.println("Cannot Solve This");
	}
	private static boolean solve(int[][] board) {
		int row=-1;
		int col=-1;
		boolean emptyLeft=false;
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				if(board[i][j]==0) {
					row=i;
					col=j;
					emptyLeft=true;
					break;
				}
			}
			if(emptyLeft) {
				break;
			}
		}
		if(emptyLeft==false) {
			return true;
			//sudoku solved completly
		}
		
		//placing and backtracking
		for(int num=1;num<=9;num++) {
			if(isSafe(board,row,col,num)) {
				board[row][col]=num;
				if(solve(board)) {
					return true;
				}else {
					board[row][col]=0;
				}
			}
		}
		return false;
	}
	private static void display(int[][] board) {
		for(int[] arr:board) {
			for(int n:arr) {
				System.out.print(n+" ");
			}
			System.out.println();
		}
		System.out.println();
		
	}
	public static boolean isSafe(int[][] board,int r,int c,int num)
	{
		for(int i=0;i<9;i++) {
			if(board[r][i]==num)return false;
		}
		for(int i=0;i<9;i++) {
			if(board[i][c]==num)return false;
		}
		int sqrt=(int)Math.sqrt(9);
		int rowstart=r-r%sqrt;
		int colstart=c-c%sqrt;
		for(int i=rowstart;i<rowstart+sqrt;i++) {
			for(int j=colstart;j<colstart+sqrt;j++) {
				if(board[i][j]==num)return false;
			}
		}
		return true;
	}

}
