class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0){
            return false;
        }
        int revert = 0, temp = x;
        while (x != 0) {
            revert = revert*10 + x%10;
            x/=10;
        }

        return revert == temp;
    }
}