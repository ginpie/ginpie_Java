package Simple;

public class ImplementStr {
    public static int strStr(String haystack, String needle) {
        if (needle.isEmpty())
            return 0;

        char[] h = haystack.toCharArray();
        char[] n = needle.toCharArray();

        for (int i = 0; i <= haystack.length() - needle.length(); i++){
            for (int j = 0; j < needle.length(); j++){
                if (h[i+j] == n[j]){
                    if (j==needle.length()-1){
                        return i;
                    }
                    continue;
                }else{
                    break;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String h = "I wanna go surfing!";
        String n = "surf";
        System.out.println(strStr(h, n));
        System.out.println(strStr("",""));
    }
}
