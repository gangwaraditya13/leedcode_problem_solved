
public class RemoveDuplicatesfromSortedList {
    static public void main(String[] args){
        SolutionRemoveDuplicatesfromSortedList removeDuplicatesfromSortedList = new SolutionRemoveDuplicatesfromSortedList();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        ListNode listNode = removeDuplicatesfromSortedList.deleteDuplicates(head);
        ListNode current = listNode;
        while(current != null){
            System.out.print(current.val+"->");
            current = current.next;
        }
    }
}


class SolutionRemoveDuplicatesfromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        while (temp != null){
            if( temp.next != null && temp.val == temp.next.val){
                temp.next = temp.next.next;
            }else {
                temp = temp.next;
            }
        }

        return head;
    }
}