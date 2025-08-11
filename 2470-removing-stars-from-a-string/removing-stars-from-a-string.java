class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        int n = s.length();
        int count = 0;
        for (int i = n - 1; i >= 0; i--){
            if (s.charAt(i) == '*'){
                count++;
            } else {
                if (count == 0){
                    stack.push(s.charAt(i));
                } else {
                    // bo qua phan tu do
                    count--;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        while (stack.size() != 0){
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}