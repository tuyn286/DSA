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
    // leetsync test
    public ListNode deleteMiddle(ListNode head) {
        // nếu head chỉ có 1 phần tử
        if (head.next == null){
            return null;
        }
        ListNode normalS = head; // di chuyển 1 node/lần
        ListNode doubleS = head; // di chuyển 2 node/lần

        while (true) {
            // nếu bước nhảy tiếp theo của doubleS là điểm cuối hoặc kề cuối thì thực hiện xóa middle
            // phải kiểm tra .next.next trước để tránh null pointer
            if (doubleS.next.next == null || doubleS.next.next.next == null){
                // doubleS kề cuối thì middle đứng sau normal
                ListNode middleNode = doubleS.next != null ? normalS.next : normalS;
                normalS.next = middleNode.next; // nhảy cóc qua middle
                middleNode.next = null; // cắt quan hệ middle
                return head;
            }
            // di chuyển
            normalS = normalS.next;
            doubleS = doubleS.next.next;
        }
    }
}