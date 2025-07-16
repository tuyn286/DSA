import java.util.ArrayList;
import java.util.List;

public class Ex151 {
    public static void main(String[] args) {
        String s = " asdasd df f";
        System.out.println(solution(s));
    }
    public static String solution(String s){
        List<String> words = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length() ; i++){
            if (s.charAt(i) != ' ') {
                int j = i;
                do {
                    j++;
                    if (j == s.length()){
                        break;
                    }
                } while (s.charAt(j) != ' ');
//                int j = i+1;
//                while () {
//                    j++;
//                    if (j == s.length()){
//                        break;
//                    }
//                }
                words.add(s.substring(i,j));
                if (j == s.length()){
                    break;
                } else {
                    i = j;
                }
            }
        }
        for (int i = words.size() -1 ; i >= 0; i--){
            sb.append(words.get(i));
            if (i != 0){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
