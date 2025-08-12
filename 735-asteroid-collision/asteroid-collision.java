class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int i : asteroids){
            // nếu là số dương cứ add
            if (i > 0){
                stack.push(i);
            } else {  // i là số âm mà đi về bên trái thì có đụng độ
                boolean isExplore = false;
                // nếu có 1 pt dương thì xảy ra đụng độ
                // đụng tới khi nào hết pt dương (size = 0 hoặc gặp pt âm)
                while (stack.size() > 0 && stack.peek() > 0){
                    // bằng nhau thì cả 2 đều nổ
                    if (stack.peek() == -i){
                        stack.pop(); //dương nổ
                        isExplore = true; // âm nổ
                        break;
                    } else if (stack.peek() < -i){ // dương bé hơn âm thì bị nổ và vòng lặp tiếp tục
                        stack.pop();
                    } else { // âm bé hơn thì nổ, dương vẫn còn
                        isExplore = true;
                        break;
                    }
                }
                if (!isExplore){ // kiểm tra i bị nổ chưa, nếu chưa thì add vào
                    stack.push(i);
                }
            }
        }
        int[] result = new int[stack.size()];
        for (int j = result.length - 1; j >= 0; j--) {
            result[j] = stack.pop();
        }
        return result;
    }
}