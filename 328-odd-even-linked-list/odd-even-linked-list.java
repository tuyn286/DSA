/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null ){
            return head;
        }
        ListNode subHead, oddTail, evenHead;
        oddTail = head; // node 1
        evenHead = oddTail.next; // node 2
        while (oddTail.next != null){
            subHead = oddTail.next; // subHead = 2
            if (subHead.next != null){
                oddTail.next = subHead.next; // noi 1 voi 3
                oddTail = oddTail.next; // dua head den 3
                // kiem tra truong hop ket thuc ds la so le
                subHead.next = oddTail.next != null ? oddTail.next : null; // noi 2 voi 4
            } else {
                break;
            }
        }
        // noi duoi cua index le voi dau cua index chan
        oddTail.next = evenHead;
        return head;
    }
}