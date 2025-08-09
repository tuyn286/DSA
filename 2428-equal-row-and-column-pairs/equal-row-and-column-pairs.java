class Solution {
    public int equalPairs(int[][] grid) {
        int count = 0;
        int n = grid.length;
        // duyet thu tu cac hang va cot
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                boolean isEqual = true;
                // duyet tat ca cac phan tu trong hang, cot
                for (int k = 0; k < n; k++){
                    if (grid[i][k] != grid[k][j]){
                        isEqual = false;
                        break;
                    }
                }
                // neu tat ca phan tu bang nhau thi ta co 1 pair
                if (isEqual){
                    count++;
                }
            }
        }
        return count;
    }
}