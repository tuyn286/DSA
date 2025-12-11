class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        if (x < 0){
            return false;
        }
        int revert = 0;
        while (x > 0) {
            revert = revert*10 + x%10;
            x/=10;
        }

        return revert == temp;
    }
}