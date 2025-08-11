class Solution {
    public String decodeString(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i =0; i < s.length(); i++) {
            if (s.charAt(i) != ']'){
                stack.push(s.charAt(i));
            } else { // nếu gặp dấu đóng ngoặc
                // tìm chuỗi trong ngoặc
                while (stack.peek() != '['){
                    // lấy tất cả kí tự trong ngoặc bỏ vào sb
                    sb.append(stack.pop());
                }
                // delete [
                stack.pop();
                String pattern = sb.reverse().toString();
                // clear sb
                sb.setLength(0);
                // tìm số đứng trước chuỗi
                while (stack.size()>0 && Integer.valueOf(stack.peek()) >= 48 &&  Integer.valueOf(stack.peek()) <= 57){
                    sb.append(stack.pop());
                }
                int multiple = Integer.parseInt(sb.reverse().toString());
                sb.setLength(0);
                for (int j = 0; j < multiple; j++){
                    sb.append(pattern);
                }
                // thêm chuỗi decoded vào lại stack
                for (char c : sb.toString().toCharArray()){
                    stack.push(c);
                }
                sb.setLength(0);
            }
        }
        sb.setLength(0);
        while (stack.size() > 0){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}