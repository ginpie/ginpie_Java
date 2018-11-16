

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int[] rtn = new int[2];
        for (int i=0; i<nums.length; i++){
            if (nums[i]<=target){
                for (int j=i+1; j<nums.length;j++){
                    if (nums[i]+nums[j]==target)
                        rtn = new int[] {i,j};
                }
            }
        }
        return rtn;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {2,5,3,9};
        int target = 7;
        System.out.println(twoSum(nums, target)[0]+", "+twoSum(nums, target)[1]);
    }
}