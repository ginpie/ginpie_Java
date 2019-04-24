package Simple;

public class AddBinary {
    public static String addBinary(String a, String b) {
        int i = a.length()-1;
        int j = b.length()-1;
        int carry = 0;
        StringBuilder s = new StringBuilder();

        while (i >= 0 || j >= 0){
            int v = carry;
            if (i >= 0)
                v += a.charAt(i) - '0';
            if (j >= 0)
                v += b.charAt(j) - '0';

            carry = v / 2;
            s.append(v % 2);

            i--;
            j--;
        }
        if (carry==1)
            s.append(1);

        return s.reverse().toString();
    }

    public static void main(String[] args) {
        String a = "100101";
        String b = "101110";
        System.out.println(addBinary(a, b));
    }
}
