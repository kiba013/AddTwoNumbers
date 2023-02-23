public class Solution {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode list = new ListNode(0);
        ListNode current = list;
        int number = 0;
        while (l1 != null || l2 !=null || number !=0) {
            int i = (l1 !=null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = number + i + y;
            number = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
            if(l1 != null) {
                l1 = l1.next;
            }
            if(l2 != null) {
                l2 = l2.next;
            }
        }
        return list.next;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
