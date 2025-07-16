public class Ex1732 {
    public static void main(String[] args) {
        int[] gain = {-4,-3,-2,-1,4,3,2};
        System.out.println(solution(gain));
    }
    public static int solution(int[] gain){
        int max = 0;
        int currentAltitude = 0;
        for (int i : gain){
            currentAltitude += i;
            if (currentAltitude > max){
                max = currentAltitude;
            }
        }
        return max;
    }
}
