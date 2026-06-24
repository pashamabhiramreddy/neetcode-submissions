class Solution {
    private int max(int piles[],int n){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(piles[i] > max){
                max = piles[i];
            }
        }
        return max;
    }
    private int totaltimetaken(int pile[],int n,int h){
        int timeperh=0;
        for(int i=0;i<n;i++){
            timeperh+=Math.ceil((double)pile[i]/h);
        }
        return timeperh;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int left=1;
        int right=max(piles,n);
        while(left <= right){
            int mid=left+(right - left)/2;
            int ans=totaltimetaken(piles,n,mid);
            if(ans<=h){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return left;   
    }
}
