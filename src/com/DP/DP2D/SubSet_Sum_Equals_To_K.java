package com.DP.DP2D;

public class SubSet_Sum_Equals_To_K {
	public static void main(String[] args) {
		int[] arr= {8,59,58,79,44,7,65,69,60,51};
		int k=172;
		System.out.println(subsetSumToK(arr.length,k,arr));
	}
	public static boolean subsetSumToK(int n, int k, int arr[]){
        return Tab(k,arr);
        /*int[][] dp=new int[n][k+1];
        for(int[] a:dp)Arrays.fill(a,-1);
        return DP(n-1,k,arr,dp);*/

        //return Rec2(arr.length-1,k,arr);
    }
     public static boolean Rec(int cur,int i, int k, int arr[]){
        if(cur==k)return true;
        if(i==arr.length)return false;

        return (Rec(cur+arr[i],i+1,k,arr)||Rec(cur,i+1,k,arr));
    }
    public static boolean Rec2(int i, int k, int arr[]){
        if(k==0)return true;
        if(i==0){
            return arr[0]==k;
        }

        boolean notTake=Rec2(i-1,k,arr);
        boolean take=false;
        if(k>=arr[i]){
            take=Rec2(i-1,k-arr[i],arr);
        }

        return (take||notTake);
    }
     public static boolean DP(int i, int k, int arr[],int[][] dp){
        if(k==0)return true;
        if(i==0){
            return arr[0]==k;
        }
        if(dp[i][k]!=-1) return (dp[i][k]==1)?true:false;

        boolean notTake=DP(i-1,k,arr,dp);
        boolean take=false;
        if(k>=arr[i]){
            take=DP(i-1,k-arr[i],arr,dp);
        }
        dp[i][k]=(take||notTake)?1:0;
        return (take||notTake);
    }
    public static boolean Tab(int k, int arr[]){
        int n=arr.length;
        boolean[][] dp=new boolean[n][k+1];
        for(int i=0;i<n;i++){
            dp[i][0]=true;
        }
        if(arr[0]<=k)dp[0][arr[0]]=true;
        
        for(int i=1;i<n;i++){
            for(int j=1;j<=k;j++){
               boolean notTake=dp[i-1][j];
               boolean take=false;
               if(j>=arr[i]){
                   take=dp[i-1][j-arr[i]];
                } 
                dp[i][j]=(take||notTake);
            }
        }

        return dp[n-1][k];
    }
    public static boolean Space(int k, int arr[]){
        int n=arr.length;
        boolean[] prev=new boolean[k+1];
        prev[0]=true;
        if(arr[0]<=k)prev[arr[0]]=true;
        
        for(int i=1;i<n;i++){
            boolean[] cur=new boolean[k+1];
            cur[0]=true;
            for(int j=1;j<=k;j++){
               boolean notTake=prev[j];
               boolean take=false;
               if(j>=arr[i]){
                   take=prev[j-arr[i]];
                } 
                cur[j]=(take||notTake);
            }
            prev=cur;
        }

        return prev[k];
    }
}
