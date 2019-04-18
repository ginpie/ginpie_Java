package Simple;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static int romanToInt(String s) {
        int sum = 0;
        char sign = ' ';
        Map<Character,Integer> m = new HashMap();
        m.put('I',1);m.put('V',5);m.put('X',10);m.put('L',50);m.put('C',100);m.put('D',500);m.put('M',1000);
        char[] c = s.toCharArray();

        for (int i=s.length()-1; i>=0; i--){
            if(sign==' ' || sign=='I'){
                sum += m.get(c[i]);
                sign = c[i];
            } else if (sign=='V' || sign =='X'){
                if(c[i]=='I'){
                    sum -= m.get(c[i]);
                    sign = c[i];
                }else{
                    sum += m.get(c[i]);
                    sign = c[i];
                }
            }else if (sign=='L' || sign =='C'){
                if(c[i]=='X'){
                    sum -= m.get(c[i]);
                    sign = c[i];
                }else{
                    sum += m.get(c[i]);
                    sign = c[i];
                }
            }else if (sign=='D' || sign =='M'){
                if(c[i]=='C'){
                    sum -= m.get(c[i]);
                    sign = c[i];
                }else{
                    sum += m.get(c[i]);
                    sign = c[i];
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        String s = "MDCCLXXVI";
        System.out.println(romanToInt(s));
    }

}
