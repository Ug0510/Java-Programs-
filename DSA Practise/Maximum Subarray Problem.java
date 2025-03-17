public class MaximumSubarray {
    
    public static int maxSubArraySum(int[] arr) {
        // Edge case: if the array is empty
        if (arr == null || arr.length == 0) {
            return 0;
        }

        int maxSum = arr[0];  // Initialize maxSum with the first element
        int currentSum = arr[0];  // Initialize currentSum with the first element

        // Loop through the array starting from the second element
        for (int i = 1; i < arr.length; i++) {
            // Update currentSum: either start a new subarray or extend the existing one
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            
            // Update maxSum to keep track of the maximum sum found so far
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, -2, 3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum Subarray Sum: " + maxSubArraySum(arr));
    }
}

