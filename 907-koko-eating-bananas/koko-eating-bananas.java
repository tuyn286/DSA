class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1; // toc do nho nhat la 1
        int right = piles[0]; // tim toc do lon nhat, gia su la ptu 0
        // tim toc do lon nhat
        for (int i = 1; i < piles.length; i++){
            if (piles[i] > right){
                right = piles[i];
            }
        }
        // xet toc do tu 1 den max, chinh la left -> right bang binary search
        int mid = 0; // toc do can xet
        while (left <= right){
            mid = (right + left)/2;
            // tinh toan toc do co thoa man voi h khong
            long time = 0;
            for (int i : piles){
                time += (i + mid - 1) / mid; // thoi gian an het 1 dong, vd 0.5 thi mat 1h de an
            }
            if (time <= h) {
                right = mid - 1; // thử tốc độ nhỏ hơn
            } else {
                left = mid + 1; // cần tốc độ lớn hơn
            }
        }
        return left;
    }
}