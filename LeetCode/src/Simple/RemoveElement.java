package Simple;

import java.util.Arrays;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++){
            if (nums[j] != val){
                nums[i++] = nums[j];
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] a = new int[] {0,1,2,2,3,0,4,2};
        int v = 2;
        System.out.println(removeElement(a, v));
        System.out.println(Arrays.toString(a));
    }
}
