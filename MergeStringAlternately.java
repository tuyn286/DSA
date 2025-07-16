public class MergeStringAlternately {
    public static void main(String[] args) {
        String s = solution("abcd", "pq");
        System.out.println(s);
    }
    public static String solution(String word1, String word2){
        // sb de noi chuoi k tao ra chuoi moi trong heap
        StringBuilder sb = new StringBuilder();

        // cat ra phan du
        int w1len = word1.length();
        int w2len = word2.length();
        if (w1len == w2len) {
            for (int i = 0; i < w1len; i++) {
                sb.append(word1.charAt(i));
                sb.append(word2.charAt(i));
            }
        } else if (w1len > w2len){
            for (int i = 0; i < w2len; i++) {
                sb.append(word1.charAt(i));
                sb.append(word2.charAt(i));
            }
            String residual = word1.substring(w2len,w1len);
            sb.append(residual);
        } else {
            for (int i = 0; i < w1len; i++) {
                sb.append(word1.charAt(i));
                sb.append(word2.charAt(i));
            }
            String residual = word2.substring(w1len,w2len);
            sb.append(residual);
        }
        return sb.toString();
    }
}
