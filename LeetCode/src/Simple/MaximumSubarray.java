package Simple;

public class MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        return findMaxSub(nums, 0, nums.length - 1);
    }

    private static int findMaxSub(int[] nums, int start, int end){
        if (start==end)
            return nums[start];
        int leftmax = findMaxSub(nums, start, (start+end)/2);     // find left half max
        int rightmax = findMaxSub(nums, (start+end)/2 + 1, end);       // find right half max
        int crossmax = findMaxCrossTwoHalf(nums, start, end);
        return Math.max(leftmax, Math.max(rightmax, crossmax));
    }

    private static int findMaxCrossTwoHalf(int[] nums, int start, int end){
        int len = end - start;
        int mid = (end + start)/2;

        int leftmax = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = mid; i >= start; i--){
            sum += nums[i];
            if (sum > leftmax){
                leftmax = sum;
            }
        }

        int rightmax = Integer.MIN_VALUE;
        sum = 0;
        for (int i = mid + 1; i <= end; i++){
            sum += nums[i];
            if (sum > rightmax){
                rightmax = sum;
            }
        }
        return leftmax+rightmax;
    }

    public static int maxSubArray1(int[] nums) {
        int maxSoFar = nums[0], maxEndingHere = nums[0];
        for (int i=1; i<nums.length; ++i){
            maxEndingHere = Math.max(maxEndingHere + nums[i],nums[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] n = new int[] {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(n));
        System.out.println(maxSubArray1(n));
    }
}
