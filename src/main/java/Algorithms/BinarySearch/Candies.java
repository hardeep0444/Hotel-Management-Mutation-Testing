package Algorithms.BinarySearch;

public class Candies {

    private boolean isPossible(int[] candies,int max,long k){
        long sum = 0;
        for(int i = 0; i<candies.length;i++){
            sum += (candies[i]/max);
        }
        if(sum>=k){
            return true;
        }
        return false;
    }
    public int maximumCandies(int[] candies, long k) {
        int s = 1;
        int e = 0;
        for(int i = 0; i< candies.length;i++){
            e = Math.max(e,candies[i]);                  // ans can't be more than the height number in the array so take end, the max candie from array.
        }
        int ans = 0;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(isPossible(candies,mid,k)){       // if posible to distribute candies with mid then store ans and increase start to mid + 1, Becoz we need maximum possible ans according to question.
                ans = mid;
                s = mid+1;
            }
            else{
                e = mid-1;
            }
        }
        return ans;
    }
}
