package Simple;

public class SqrtX {
    public static int mySqrt(int x) {
//        return (int) Math.sqrt(x);
        int l = 0;
        int r = Integer.MAX_VALUE;
        if (x==0)
            return 0;

        while (true){
            int m = (r - l)/2 + l;
            if (m > x/m){           // use m>x/m instead of m*m>x, in case of product overflow
                r = m-1;
            } else {
                if ((m+1) > x / (m+1))
                    return m;
                l = m+1;
            }
        }
    }

    public static void main(String[] args) {
        int x = 2147395599;
        System.out.println(mySqrt(x));
    }
}
