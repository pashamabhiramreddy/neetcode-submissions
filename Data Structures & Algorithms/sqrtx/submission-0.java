class Solution {
    public int mySqrt(int x) {
        int left=1;
        int right=x;
        while(left <= right){
            int mid=left+(right-left)/2;
            long mult=(long) mid*mid;
            if(mult == x ){
                return mid;
            }
            else if(mult > x){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return right;  
    }
}