public class DoubleaNumberRepresentedasaLinkedList {
    static public void main(String[] args) {
        SolutionDoubleaNumberRepresentedasaLinkedList doubleaNumberRepresentedasaLinkedList = new SolutionDoubleaNumberRepresentedasaLinkedList();
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(8);
        l1.next.next = new ListNode(9);
//        l1.next.next.next = new ListNode(9);
//        l1.next.next.next.next = new ListNode(9);
//        l1.next.next.next.next.next = new ListNode(9);
//        l1.next.next.next.next.next.next = new ListNode(9);
        ListNode listNode = doubleaNumberRepresentedasaLinkedList.doubleIt(l1);
        ListNode current = listNode;

        while (current != null) {
            System.out.print(current.val + "->");
            current = current.next;
        }
    }
}

class SolutionDoubleaNumberRepresentedasaLinkedList {
    public ListNode doubleIt(ListNode head) {
        ListNode temp = head;
        ListNode newList = new ListNode(0);
        ListNode temp1 = newList;
        ListNode pre = temp1;

        while (temp!=null){
            if(temp.val >4){
                ListNode node = new ListNode((temp.val*2)%10);
                temp1.next = node;
                pre = temp1;
                pre.val = pre.val+1;
                temp1 = node;
            }else{
                ListNode node = new ListNode(temp.val*2);
                temp1.next = node;
                pre = temp1;
                temp1 = node;
            }
            temp = temp.next;
        }
        if(newList.val == 0){
            return newList.next;
        }
        return newList;
    }
}