class Trie {

    private Trie[] children;
    boolean isEnd;
    public Trie() {
        children = new Trie[26]; // 26 ki tu cua bang chu cai
        isEnd = false;
    }

    public void insert(String word) {
        Trie curr = this;
        for (char c : word.toCharArray()){
            if (curr.children[c - 'a'] == null){ // neu chua co ki tu c thi khoi tao new
                curr.children[c - 'a'] = new Trie();
            }
            curr = curr.children[c - 'a']; // move next
        }
        curr.isEnd = true; // danh dau la da het
    }

    public boolean search(String word) {
        Trie curr = this;
        for (char c : word.toCharArray()){
            if (curr.children[c - 'a'] == null){
                return false;
            }
            curr = curr.children[c - 'a'];
        }
        return curr.isEnd;
    }

    public boolean startsWith(String prefix) {
        Trie curr = this;
        for (char c : prefix.toCharArray()){
            if (curr.children[c - 'a'] == null){
                return false;
            }
            curr = curr.children[c - 'a'];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */