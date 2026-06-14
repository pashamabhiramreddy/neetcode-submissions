
   class Solution {
    private boolean search(int []arr,int num){
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i] == num ){
                return true;
            }
        }
        return false;
    }
    public int longestConsecutive(int[] nums) {

        int m=nums.length;
        if(m == 0){
            return 0;
        }
        int longest = 1;
        for(int j=0;j<m;j++){
            int x=nums[j];
            int count=1;
        while(search(nums,x+1) ==  true){
        x=x+1;
        count++;
    }
    longest=Math.max(longest,count);
        }
   
    return longest;
    }
}
        
