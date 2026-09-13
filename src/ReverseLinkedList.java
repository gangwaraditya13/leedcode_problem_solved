public class ReverseLinkedList {
    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        SolutionReverseLinkedList reverseLinkedList = new SolutionReverseLinkedList();
        ListNode listNode = reverseLinkedList.reverseList(head);


        ListNode temp = listNode;
        while (temp != null){
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }
    }
}


class SolutionReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode current = head;

        while (current != null){
            ListNode next = current.next;
            current.next = pre;
            pre = current;
            current = next;
        }
        head = pre;

        return head;
    }
}
