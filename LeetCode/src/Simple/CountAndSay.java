package Simple;

public class CountAndSay {

    public static String countAndSay(int n){
        if (n==1)
            return "1";
        String a = countAndSay(n-1);
        StringBuilder b = new StringBuilder();
        Character c = '0';
        int count = 0;
        for (int i=0; i<a.length(); i++){
            if (c!=a.charAt(i)) {
                if (c!='0'){
                    b.append(count).append(c);
                }
                c = a.charAt(i);
                count = 1;
            }else{
                count++;
            }
            if (i==a.length()-1){
                b.append(count).append(c);
            }
        }
        return b.toString();
    }

    public static void main(String[] args) {
        for (int i=1; i<=10; i++) {
            System.out.println(countAndSay(i));
        }
    }
}
