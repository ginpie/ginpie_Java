package Simple;

import java.util.Arrays;

public class RemoveDuplicatesfromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int j = 0;

        if (nums.length<=1)
            return nums.length;

        for (int i = 0; i < nums.length; i++){
            if (nums[i]!=nums[j]){
                nums[++j] = nums[i];
            }
        }

        return j+1;
    }

    public static void main(String[] args) {
        int[] a = new int[] {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(a));
        System.out.println(Arrays.toString(a));
    }
}
