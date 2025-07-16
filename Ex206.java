public class Ex206 {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        listNode1.next = listNode2;
        ListNode newListNode = reverseList(listNode1);
        while (newListNode.next != null){
            newListNode = newListNode.next;
            System.out.println(listNode1.val);
        }
    }
    public static ListNode reverseList(ListNode head){
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverseList(head.next);
        (head.next).next = head;
        head.next = null;
        return newHead;
    }
}
class ListNode {
    int val;
    ListNode next;
    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
