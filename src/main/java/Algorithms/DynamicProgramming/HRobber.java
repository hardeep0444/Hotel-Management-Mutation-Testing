package Algorithms.DynamicProgramming;

import java.util.Arrays;

public class HRobber {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        //from index 0 to n-1 to ignore the last house
        int firstHouse = leavemealone(nums,0,n-1,dp);
        //Now we have to reinitialise the dp array to -1
        Arrays.fill(dp,-1);
        //Now to ignore the first house we will iterate from 1 to n
        int lastHouse = leavemealone(nums,1,n,dp);
        return Math.max(firstHouse,lastHouse);
    }

    public int leavemealone(int[] nums, int idx, int n, int dp[]){
        if(idx>=n){
            return 0;
        }
        if(dp[idx]!=-1){
            return dp[idx];
        }
        return dp[idx]=Math.max(nums[idx] + leavemealone(nums,idx+2,n,dp), 0 + leavemealone(nums,idx+1,n,dp));
    }


    public int rob2(int[] nums) {
        int n = nums.length;
        if(nums.length == 1)
            return nums[0];
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        int firstHouse[] = new int[n];
        int lastHouse[] = new int[n];
        for(int i=0;i<nums.length;i++){
            if(i!=0){
                firstHouse[i] = nums[i];
            }
            if(i!=n-1){
                lastHouse[i] = nums[i];
            }
        }
        return Math.max(solve(firstHouse,dp),solve(lastHouse,dp));
    }

    public int solve(int[] nums,int dp[]){
        dp[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            int take = nums[i];
            if(i>1){
                take+=dp[i-2];
            }
            int nottake = 0 + dp[i-1];
            dp[i] = Math.max(take,nottake);
        }
        return dp[nums.length-1];
    }

    public int rob3(int[] nums) {
        int n = nums.length;
        if(nums.length == 1)
            return nums[0];

        //We will create two arrays in first we will reject first house
        int houseFirst[] = new int[n];
        //In this array we are rejecting last house
        int houseLast[] = new int[n];
        for(int i=0;i<nums.length;i++){
            if(i!=0){
                houseFirst[i] = nums[i];
            }
            if(i!=n-1){
                houseLast[i] = nums[i];
            }
        }
        return Math.max(leavemeAlone(houseFirst),leavemeAlone(houseLast));
    }
    public int leavemeAlone(int[] nums){
        int prev = nums[0];
        int prev2 = 0;
        for(int i=1;i<nums.length;i++){
            int take = nums[i];
            if(i>1){
                take+=prev2;
            }
            int nottake = 0 + prev;
            int cur = Math.max(take,nottake);
            prev2=prev;
            prev=cur;

        }
        return prev;
    }
}
