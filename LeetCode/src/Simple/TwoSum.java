package Simple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
//        int[] rtn = new int[2];
//        for (int i=0; i<nums.length; i++){
//                for (int j=i+1; j<nums.length;j++){
//                    if (nums[i]+nums[j]==target){
//                        rtn = new int[] {i,j};
//                        return rtn;
//                    }
//                }
//        }
//        return null;
//        ArrayList<Integer> s = new ArrayList<>();
//        int[] rtn = new int[2];
//
//        for (int i=0; i<nums.length; i++){
//           s.add(target-nums[i]);
//           if(s.contains(nums[i]) && (i>s.indexOf(nums[i]))){
//               rtn[0]=s.indexOf(nums[i]);
//               rtn[1]=i;
//               return rtn;
//           }
//        }
//        return null;


        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
        int[] res = new int[2];
        for (int i = 0; i < nums.length; ++i) {
            m.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; ++i) {
            int t = target - nums[i];
            if (m.containsKey(t) && m.get(t) != i) {
                res[0] = i;
                res[1] = m.get(t);
                break;
            }
        }
        return res;
    }



    public static void main(String[] args) {
        int[] nums = new int[] {1,2,3,4,5};
        int target = 8;
        System.out.println();
        System.out.println(twoSum(nums, target)[0]+", "+twoSum(nums, target)[1]);
    }
}