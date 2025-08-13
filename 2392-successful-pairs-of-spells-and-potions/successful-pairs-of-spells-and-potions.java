class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] res = new int[spells.length];
        // sap xep tang dan; khi phat hien 1 pt lon hon thi tat ca phia sau lon hon
        Arrays.sort(potions);
        int potionsLen = potions.length;
        int spellsLen = spells.length;
        // duyet spells
        for (int i = 0; i < spellsLen; i++){
            int left = 0;
            int right = potionsLen - 1;
            // binary search
            while (left <= right){
                int mid = (right-left)/2 + left;
                long product = (long) spells[i] * potions[mid];
                // duyet phia ben trai
                if (product >= success){
                    right = mid - 1;
                } else { // ben phai
                    left = mid + 1;
                }
            }
            res[i] = potionsLen - left;
        }
        return res;
    }
}