class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0){
            return false;
        }

        List<Integer> list = new ArrayList();
        while (x > 0) {
            int unit = x%10;
            list.add(unit);
            x = x/10;
        }

        List<Integer> revert = list.reversed();
        return revert.equals(list);
    }
}