public class RemoveDuplicatesfromSortedListII {
    static public void main(String[] args){
        SolutionRemoveDuplicatesfromSortedListII  removeDuplicatesfromSortedListII = new SolutionRemoveDuplicatesfromSortedListII();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next.next = new ListNode(4);
        ListNode listNode = removeDuplicatesfromSortedListII.deleteDuplicates(head);
        ListNode current = listNode;
        while(current != null){
            System.out.print(current.val+"->");
            current = current.next;
        }
    }
}

class SolutionRemoveDuplicatesfromSortedListII {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode curr = head;

        while (curr != null) {
            if (curr.next != null && curr.val == curr.next.val) {

                int duplicateValue = curr.val;

                while (curr != null && curr.val == duplicateValue) {
                    curr = curr.next;
                }

                prev.next = curr;
            } else {
                prev = curr;
                curr = curr.next;
            }
        }

        return dummy.next;
    }
}