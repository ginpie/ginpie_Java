package Medium;

public class ZigZagConversion {
    public static String convert(String s, int numRows) {
        String res = "";
        int row = numRows * 2 - 2;
        int col = (int) Math.ceil(s.length() *1.0 / row);

        if(s.length()<=numRows || numRows==1)
            return s;

        for (int i=0; i<numRows; i++){
            for (int j=0; j<col; j++){
                int pos = row*j+i;
                if(pos<s.length()) {
                    res += s.substring(pos, pos + 1);
                    if( (row*(j+1) - i) < s.length()) {
                        if (i > 0 && i < (numRows - 1)) {
                            res += s.substring(row*(j+1) - i, row*(j+1) - i +1);
                        }
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "A";
        int numRows = 3;
        System.out.println(convert(s, numRows));
    }
}
