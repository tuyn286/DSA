class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        int n = s.length();
        // dua phan tu cuoi cung vao stack
        stack.push(s.charAt(n-1));
        for (int i = n - 2; i >= 0; i--){
            // neu stack rong thi dua luon phan tu do vao
            if (stack.size() == 0){
                stack.push(s.charAt(i));
                continue;
            }
            // nếu đầu của stack là * mà phần tử kiểm tra là char thì chỉ cần loại bỏ * trong stack
            if (s.charAt(i) != '*' && stack.peek() == '*'){
                stack.pop();
            } else { // nếu đều là kí tự hoặc đều là * thì đưa vào stack
                stack.push(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        while (stack.size() != 0){
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}