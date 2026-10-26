public class MiddleoftheLinkedList {
    public static void main(String[] args){
    }
}

class SolutionMiddleoftheLinkedList {
    public ListNode middleNode(ListNode head) {

        int count = 0;
        ListNode temp = head;
        while (temp != null){
            count++;
            temp = temp.next;
        }

        count /=2;

        temp = head;
        while (count > 0){
            temp = temp.next;
            count--;
        }

        return temp;
    }
}