class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0, right = nums.length -1;
        while (left < right){
            int mid = (right+left)/2;
            // neu trai lon hon phai: loai bo toan bo ben phai
            if (nums[mid] > nums[mid+1]){
                right = mid;
            } else { // nguoc lai chon ptu ke tiep, loai bo phan ben trai
                left = mid + 1;
            }
        }
        return left;
    }
}