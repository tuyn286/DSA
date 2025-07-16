public class Ex2095 {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = null;

        ListNode head = deleteMiddle(listNode1);
        do {
            System.out.println(head.val);
            head = head.next;

        } while (head.next != null);
    }

    public static ListNode deleteMiddle(ListNode head) {
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
