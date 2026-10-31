package corp.Backtracking_maze2D;

import java.util.*;

public class Sample {
	void main() {
		System.out.println(solveNQueens(2));
	}
	public List<List<String>> solveNQueens(int n) {
        char[][] board=new char[n][n];
        for(char[] arr:board) {
        	Arrays.fill(arr,'.');
        }
        List<List<String>> list=new ArrayList<>();
        addQueens(0,board,list);
        return list;
    }
    public void addQueens(int r,char[][] board,List<List<String>> list)
    {
        if(r==board.length){
            List<String> cur=new ArrayList<>();
            for(char[] arr:board){
                String s="";
                for(char c:arr){
                    s+=c;
                }
                cur.add(s);
            }
            list.add(cur);
            return;
        }

        for(int col=0;col<board[0].length;col++){
            if(isSafe(r,col,board)){
                board[r][col]='Q';
                addQueens(r+1,board,list);
                board[r][col]='.';
            }
        }
    }

    public boolean isSafe(int r,int c,char[][] board)
    {
        //check in same col
        for(int row=0;row<r;row++){
            if(board[row][c]=='Q')return false;
        }
        //check in left diagonal
        for(int row=r-1,col=c-1;row>=0&&col>=0;row--,col--){
            if(board[row][col]=='Q')return false;
        }
        //check in right diagonal
        for(int row=r-1,col=c+1;row>=0&&col<board[0].length;row--,col++){
            if(board[row][col]=='Q')return false;
        }
        return true;
    }
	
}
