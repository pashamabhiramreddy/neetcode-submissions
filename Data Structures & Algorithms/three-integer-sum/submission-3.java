
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                for (int k = j + 1; k < n; k++) {

                    if (nums[i] + nums[j] + nums[k] == 0) {

                        List<Integer> temp = new ArrayList<>();

                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);

                        Collections.sort(temp);

                        if (!ans.contains(temp)) {
                            ans.add(temp);
                        }
                    }
                }
            }
        }

        return ans;
    }
}