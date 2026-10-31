package corp.Backtracking_maze2D;

import java.util.Arrays;

public class MazeDRU {
	public static void main(String[] args) {
		int n=3,m=3;
		int[][] maze=new int[n][m];
		mazeDRU(0,0,"",maze,1);
	}
	public static void mazeDRU(int i,int j,String path,int[][] maze,int cur)
	{
	    if(i==maze.length-1 && j==maze.length-1){
	    	maze[i][j]=cur;
	    	for(int[] arr : maze)
	    		System.out.println(Arrays.toString(arr));
	    	
	        System.out.println(path);
	        maze[i][j]=0;
	    }
	   if(maze[i][j]!=0)return;
	   
	    maze[i][j]=cur;
	    if(i<maze.length-1)
	    {
	        mazeDRU(i+1,j,path+"D",maze,cur+1);
	    }
	    if(j<maze[0].length-1)
	    {
	        mazeDRU(i,j+1,path+"R",maze,cur+1);
	    }
	    if(i>0)
	    {
	        mazeDRU(i-1,j,path+"U",maze,cur+1);
	    }
	    maze[i][j]=0;
	}
}
