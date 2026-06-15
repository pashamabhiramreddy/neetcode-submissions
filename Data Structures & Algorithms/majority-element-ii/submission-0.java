class Solution {
    public List<Integer> majorityElement(int[] nums) {
    int n=nums.length;
    List<Integer> al=new ArrayList<>();
    for(int i=0;i<n;i++){
        int count=0;
        for(int j=0;j<n;j++){
            if(nums[i] == nums[j]){
                count++;
            }
        }
        if(count > n/3 && !al.contains(nums[i])){
            al.add(nums[i]);
        }
    }
    return al;
    }
}