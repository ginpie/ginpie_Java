/**
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
 *
 * Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
 *
 * You may assume nums1 and nums2 cannot be both empty.
 *
 * Example 1:
 *
 * nums1 = [1, 3]
 * nums2 = [2]
 * The median is 2.0
 *
 * Example 2:
 *
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 * The median is (2 + 3)/2 = 2.5
 */
package Hard;

public class MedianOfTwoSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2){
        int m=nums1.length, n=nums2.length;
        int i=(m-1)/2,j=(n-1)/2;
        int d=i;
        double med = 0.0;
        while (d!=0){
            if (nums1[i] < nums2[j]){
                d=d/2;
                i += d;
                j -= d;
            }else{
                d=d/2;
                i -= d;
                j += d;
            }
        }
        if (m%2==0){
            if(n%2==0) {
                if(i+1<m) {
                    if (j+1<n) {
                        med = (Math.max(nums1[i], nums2[j]) + Math.min(nums1[i + 1], nums2[j + 1])) / 2;
                    } else {
                        med = (Math.max(nums1[i], nums2[j]) + nums1[i + 1]) / 2;
                    }
                }
                else if (i+1==m){
                    med = (Math.max(nums1[i], nums2[j]) + nums2[j])/2;
                }
            }else{
                med = Math.max(nums1[i], nums2[j]);
            }
        } else {
            if (n%2==0){
                med = Math.max(nums1[i], nums2[j]);
            }else{
                med = (nums1[i] + nums2[j]) / 2;
            }
        }

        return med;
    }


    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,3,5,6,8,10,12,13};
        int[] nums2 = new int[]{4,7,9,11,14,15,16,18,20};

        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
}
