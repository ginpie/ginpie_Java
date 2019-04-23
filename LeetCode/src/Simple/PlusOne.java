package Simple;

import java.util.Arrays;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int l = digits.length;

        for (int i = l-1; i >= 0; i--){
            if (digits[i] == 9){
                digits[i] = 0;
                if (i==0) {
                    int[] a = Arrays.copyOf(digits, l+1);
                    a[0] = 1;
                    return a;
                }
                continue;
            } else {
                digits[i] ++;
                break;
            }
        }
        return digits;
    }

    public static void main(String[] args) {
        int[] d = new int[] {9,9,2};
        System.out.println(Arrays.toString(plusOne(d)));
    }

}
