public class DeletetheMiddleNodeofaLinkedList {
    static public void main(String[] args){
        ListNode head  = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next  = new ListNode(3);
        head.next.next.next  = new ListNode(4);
        head.next.next.next.next  = new ListNode(5);
        head.next.next.next.next.next  = new ListNode(6);
        head.next.next.next.next.next.next  = new ListNode(7);
        ListNode temp = head;
        while (temp!=null){
            System.out.print(temp.val+" -> ");
            temp =temp.next;
        }
        SolutionDeletetheMiddleNodeofaLinkedList deletetheMiddleNodeofaLinkedList = new SolutionDeletetheMiddleNodeofaLinkedList();
        ListNode listNode = deletetheMiddleNodeofaLinkedList.deleteMiddle(head);
        System.out.println();
        while (listNode!=null){
            System.out.print(listNode.val+" -> ");
            listNode = listNode.next;
        }

    }
}

class SolutionDeletetheMiddleNodeofaLinkedList {
    public ListNode deleteMiddle(ListNode head) {
        int count = 0;
        ListNode temp = head;
        while (temp != null){
            count++;
            temp = temp.next;
        }
        if(count==1){
            return null;
        }

        count /=2;

        temp = head;
        ListNode pre = null;
        while (count > 0){
            pre = temp;
            temp = temp.next;
            count--;
        }
        if(temp != null) {
            pre.next = pre.next.next;
        }else{
            pre.next = null;
        }

        return head;
    }
}