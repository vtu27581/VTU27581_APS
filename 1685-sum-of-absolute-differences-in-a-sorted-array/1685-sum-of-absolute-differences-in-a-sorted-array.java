class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int totalSum = 0;

        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;

        for (int i = 0; i < n; i++) {
            int leftCount = i;
            int rightCount = n - i - 1;

            // Difference with elements on the left
            int leftDifference = nums[i] * leftCount - leftSum;

            // Difference with elements on the right
            int rightDifference =
                    (totalSum - leftSum - nums[i])
                    - nums[i] * rightCount;

            result[i] = leftDifference + rightDifference;

            leftSum += nums[i];
        }

        return result;
    }
}