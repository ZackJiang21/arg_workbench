package NC78;


class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }


    @Override
    public String toString() {
        String ret = String.valueOf(this.val);
        ListNode next = this.next;
        while (next != null) {
            ret += " ";
            ret += next.val;
            next = next.next;
        }
        return ret;
    }
}

public class NC78 {
    public static ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        ListNode next;
        while (cur != null) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);

        node1.next = node2;
        node2.next = node3;

        ListNode ret = reverseList(node1);
        System.out.println(ret);
    }
}

