class Solution {
    private int daysRequired(int[] weights, int capacity) {
        int days = 1;
        int load = 0;
        for (int i = 0; i < weights.length; i++) {
            if (load + weights[i] > capacity) {
                days++;
                load = weights[i];
            } else {
                load += weights[i];
            }
        }
        return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int left = 0;
        int right = 0;
        for (int i = 0; i < weights.length; i++) {
            if (weights[i] > left) {
                left = weights[i];
            }
            right += weights[i];
        }
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int neededDays = daysRequired(weights, mid);
            if (neededDays <= days) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}