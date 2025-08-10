class Solution {
    public String predictPartyVictory(String senate) {
        // vì luật xét theo thứ tự từ trái sang phải nên ai có index nhỏ hơn sẽ loại được đối thủ
        Queue<Integer> radQueue = new ArrayDeque<>();
        Queue<Integer> direQueue = new ArrayDeque<>();
        int n = senate.length();
        // luu index cua r hoac d vao queue
        for (int i = 0; i < n; i++) {
            if (senate.charAt(i) == 'R'){
                radQueue.add(i);
            } else {
                direQueue.add(i);
            }
        }
        // khi nao co phe het so luong thi tuyen bo chien thang
        while (radQueue.size() != 0 && direQueue.size() != 0){
            // neu co index nho hon thi loai duoc doi thu ben phai
            if (radQueue.peek() < direQueue.peek()){
                // cho no vao lai voi index hon 1 vong
                radQueue.add(n++);
            } else {
                direQueue.add(n++);
            }
            // sau khi tham gia thì cả 2 đều mất; bên nào thắng thì được đưa vào queue
            direQueue.poll();
            radQueue.poll();
        }
        // khi da co 1 phe het so luong
        if (radQueue.size() == 0){
            return "Dire";
        } else {
            return "Radiant";
        }
    }
}