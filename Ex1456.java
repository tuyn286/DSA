public class Ex1456 {
    public static void main(String[] args) {
        String s = "tnfazcwrryitgacaabwm";
        System.out.println(maxVowels(s,4));
    }
    public static int maxVowels(String s, int k) {
        char[] vowels = {'a','e', 'i', 'o', 'u'};
        int n = s.length();
        int max = 0, value = 0;
        // tinh so luong vowel trong cua so dau tien
        for (int i = 0; i < k; i++){
            for (char c : vowels){
                if (s.charAt(i) == c) {
                    value++;
                    max = value;
                }
            }
        }
        for (int i = k; i < n; i++){
            for (char c : vowels){
                if (s.charAt(i) == c) { // pt them vao la vowel thi +
                    value++;
                }
                if (s.charAt(i-k) == c) { // pt bo ra la vowel thi -
                    value--;
                }
            }
            max = Math.max(max, value);
        }
        return max;
    }
}
