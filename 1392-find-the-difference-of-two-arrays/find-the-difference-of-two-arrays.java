class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i : nums1){
            set1.add(i);
        }
        for (int i : nums2){
            set2.add(i);
        }
        Set<Integer> temp = new HashSet<>(set2);
        for (int i : temp){
            if (set1.contains(i)){
                set2.remove(i);
                set1.remove(i);
            }
        }
        list1.addAll(set1);
        list2.addAll(set2);
        res.add(list1);
        res.add(list2);
        return res;
    }
}