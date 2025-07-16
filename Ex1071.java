public class Ex1071 {
    public static void main(String[] args) {
        String res = solution("ABABAB", "ABAB");
        System.out.println(res);
    }
    public static String solution(String str1, String str2){
        int str1Len = str1.length();
        int str2Len = str2.length();
        int n = ucln(str1Len, str2Len);
        return str1.substring(0,n);
    }
    // check string contains pattern
    public static boolean isContain(String pattern, String str) {
        int step = pattern.length();
        for (int i = 0 ;i < str.length(); i += step) {
            if (!str.substring(i, i + step).equals(pattern)){
                return false;
            }
        }
        return true;
    }
    public static int ucln(int a, int b){
        if (b == 0){
            return a;
        }
        return ucln(b, a%b);
    }
}
