class Solution {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()){
            return false;
        }
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for (char c : word1.toCharArray()){
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }
        for (char c : word2.toCharArray()){
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }
        // cac ki tu xuat hien trong 2 chuoi phai giong nhau
        for (char c : map1.keySet()){
            if (!map2.containsKey(c)){
                return false;
            }
        }
        // tan suat xuat hien phai giong nhau
        // tan suat cua bat ki ki tu nao
        List<Integer> value1 = new ArrayList<>(map1.values());
        Collections.sort(value1);
        System.out.println(value1);
        List<Integer> value2 = new ArrayList<>(map2.values());
        System.out.println(value2);
        Collections.sort(value2);
        for (int i = 0; i < value1.size(); i++){
            if (value1.get(i).intValue() != value2.get(i).intValue()){
                return false;
            }
        }
        return true;
    }
}