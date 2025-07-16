import java.util.ArrayList;
import java.util.List;

public class Ex345 {
    public static void main(String[] args) {
        String s = "IceCreAm";
        System.out.println(solution(s));
    }

    public static String solution(String s){
        List<Integer> indexs = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0 ; i < s.length(); i++){
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'
            || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U'){
                indexs.add(i);
                sb.append(s.charAt(i));
            }
        }
        String vowel = sb.toString();
        StringBuilder sb1 = new StringBuilder(s);
        int len = vowel.length() - 1;
        for (int i : indexs){
            sb1.setCharAt(i, vowel.charAt(len));
            len--;

        }
        return sb1.toString();
    }
}
