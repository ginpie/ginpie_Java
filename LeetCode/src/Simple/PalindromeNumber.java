package Simple;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        if (x<0 || (x%10 == 0 && x>9))
            return false;

//        Integer y = x;
//        String s = y.toString();
//        for (int i=0; i<s.length(); i++){
//            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
//                res=false;
//                break;
//            }
//        }
        int rev=0;
        while (x>rev){
            rev = rev*10 + x%10;
            x /= 10;
        }
        if (rev==x || rev/10==x) {
            return true;
        }else
            return false;


    }

    public static void main(String[] args) {
        int x = 10;
        System.out.println(isPalindrome(x));
    }
}
