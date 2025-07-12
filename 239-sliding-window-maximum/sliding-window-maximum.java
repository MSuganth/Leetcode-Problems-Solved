class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
            int n = nums.length;
            int[] left = new int[n];
            int[] right = new int[n];
            for (int i = 0; i < n; i++) {
                if (i % k == 0) left[i] = nums[i];
                else  left[i] = Math.max(left[i - 1], nums[i]);
            }
            for (int i = n - 1; i >= 0; i--) {
                if ((i == n - 1) || ((i + 1) % k == 0)) right[i] = nums[i];
                else right[i] = Math.max(right[i + 1], nums[i]);
            }
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i <= n - k; i++) list.add(Math.max(right[i], left[i + k - 1]));
            int[] res = new int[list.size()];
            for(int i=0;i<list.size();i++) res[i] = list.get(i);
            return res;
    }
}