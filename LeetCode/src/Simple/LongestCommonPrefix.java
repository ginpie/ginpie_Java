package Simple;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        String s="";
        int l = 0;
        boolean b = true;
        for (int i=0; i<strs.length-1; i++) {
            if(b==false)
                break;
            for (int j = 1; j < strs.length - 1; j++) {
                if (strs[j].charAt(i) != strs[0].charAt(i)) {
                    b=false;
                    l = i;
                    break;
                }else {
                    l = i+1;
                }
            }
        }
        s += strs[0].substring(0,l);
        return s;
    }


    public static void main(String[] args) {
        String[] strs = new String[] {"asdffgh","asdforljg","asdfknqlw"};
        System.out.println(longestCommonPrefix(strs));
    }
}