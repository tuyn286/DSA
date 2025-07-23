class Solution {
    public boolean closeStrings(String word1, String word2) {
        // phải sử dụng mảng: index chính là kí tự từ 0 - 26
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        for (char c : word1.toCharArray()){
            arr1[c - 'a'] += 1;
        }
        for (char c : word2.toCharArray()){
            arr2[c - 'a'] += 1;
        }

        for (int i = 0; i < 26; i++){
            // neu ki tu co o 1 khong co o 2 thi false
            if ((arr1[i] == 0 && arr2[i] > 0) || (arr1[i] > 0 && arr2[i] == 0) ){
                return false;
            }
        }
        // sap xep tan suat tu be den lon
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // so sanh tan suat
        return Arrays.equals(arr1, arr2);
    }
}