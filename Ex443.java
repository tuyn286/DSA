public class Ex443 {
    public static void main(String[] args) {
        char[] chars = {'a','a','b','b','c','c','c'};
        System.out.println(compress(chars));
    }
    public static int compress(char[] chars){
        int n = chars.length;
        int write = 0;
        int left = 0;
        int right = 1;

        while (left < n) { // trường hợp chỉ có 1 phần tử
            // cap nhat ki tu
            chars[write] = chars[left];
            write++;
            // trường hợp chỉ có 1 phần tử hoặc phần tử cuối khác phần tử kề cuối
            if (left == n - 1) {
                return write;
            }
            // dem ki tu giong nhau
            while (chars[right] == chars[left]) {
                right++;
                if (right == n){
                    break; // trường hợp pt cuối giống pt kề cuối
                }
            }
            if ((right - left) > 1) {
                // ghi ket qua vao mang
                for (char c : String.valueOf(right - left).toCharArray()) { // trường hợp số lượng có nhiều chữ số
                    chars[write] = c;
                    write++;
                }
            }
            System.out.println(chars);
            left = right;
            right = left +1;
        }
        return write;
    }
}
