public class Ex605 {
    public static void main(String[] args) {
        int[] flowers = {1,0,0,0,1,0,0};
        System.out.println(solution(flowers,2));
    }
    public static boolean solution(int[] flowerbed, int n) {
        int maxPlaces = 0;
        int len = flowerbed.length;
        for(int i = 0; i < len -1; i++){
            boolean left, right;
            if (flowerbed[i]==0){
                if (i == 0){
                    left = true;
                } else {
                    left = flowerbed[i-1] == 0;
                }
                if (i == len - 1) {
                    right = true;
                } else {
                    right = flowerbed[i+1] == 0;
                }
                if (left && right){
                    flowerbed[i] = 1;
                    maxPlaces++;
                }
            }

        }
        if (n <= maxPlaces){
            return true;
        }
        return false;
    }
}
