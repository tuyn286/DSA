package DSA;

public class LessonSlidingWindow {
    public static void main(String[] args) {
        int[] nums = {2,1,5,6,3};
        System.out.println(soLanHoanVi(nums, 3));
    }

    // Cho mảng n, số k. Tìm xem số lần hoán vị ít nhất sao cho các số nhỏ hơn hoặc bằng k ở gần nhau
    public static int soLanHoanVi(int[] nums, int k){
        int smaller = 0;
        // tim xem co bao nhieu phan tu nho hon k
        for (int i : nums){
            if (i <= k){
                smaller++;
            }
        }
        // dat smaller lam cua so, tinh cua so dau tien co bao nhieu phan tu nho hon k
        int dem = 0;
        for (int i = 0; i < smaller; i++){
            if (nums[i] <= k){
                dem++;
            }
        }
        int res = dem;
        // truot cua so
        for (int i = smaller; i < nums.length; i++){
            if (nums[i-smaller] <= k) {
                dem--;
            }
            if (nums[i] <= k) {
                dem++;
            }
            res = Math.max(res, dem); // tim xem cua so nao co chua nhieu pt nho hon k nhat
        }
        return smaller-res;

    }
}
