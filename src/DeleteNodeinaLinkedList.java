public class DeleteNodeinaLinkedList {
    static public void main(String[] args){

    }
}

class SolutionDeleteNodeinaLinkedList {
    public void deleteNode(ListNode node) {
        ListNode temp = node;
        ListNode pre = null;
        while (temp.next != null){
            temp.val = temp.next.val;
            pre = temp;
            temp = temp.next;
        }
        pre.next = null;
    }
}