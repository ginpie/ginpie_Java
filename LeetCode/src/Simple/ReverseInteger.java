/**
 * Given a 32-bit signed integer, reverse digits of an integer.
 *
 * Example 1:
 *
 * Input: 123
 * Output: 321
 * Example 2:
 *
 * Input: -123
 * Output: -321
 * Example 3:
 *
 * Input: 120
 * Output: 21
 * Note:
 * Assume we are dealing with an environment which could only store integers within
 * the 32-bit signed integer range: [−2^31,  2^31 − 1]. For the purpose of this problem,
 * assume that your function returns 0 when the reversed integer overflows.
 */

package Simple;

public class ReverseInteger {
    public static int reverse(int x) {
        int res=0;

        if(x<10 && x>-10)
            return x;

        do{

            if(res>Integer.MAX_VALUE/10 || (res==Integer.MAX_VALUE/10 && (x%10)>7)){
                return 0;
            }
            if(res<Integer.MIN_VALUE/10 || (res==Integer.MIN_VALUE/10 && (x%10)<-8)){
                return 0;
            }
            res = res*10 + (x%10);
            x /= 10;
        } while (x!=0);
        return res;
    }

    public static void main(String[] args) {
        int x = 153423699; // [-2147483648, 2147483647]
        System.out.println(reverse(x));
    }
}
