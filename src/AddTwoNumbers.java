public class AddTwoNumbers {
    static public void main(String[] args){
        ListNode l1 = new ListNode(9);
        l1.next = new ListNode(9);
        l1.next.next = new ListNode(9);
        l1.next.next.next = new ListNode(9);
        l1.next.next.next.next = new ListNode(9);
        l1.next.next.next.next.next = new ListNode(9);
        l1.next.next.next.next.next.next = new ListNode(9);
        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(9);
        l2.next.next = new ListNode(9);
        l2.next.next.next = new ListNode(9);
        SolutionAddTwoNumbers addTwoNumbers = new SolutionAddTwoNumbers();
        ListNode listNode = addTwoNumbers.addTwoNumbers(l1, l2);
        ListNode current = listNode;
        while(current != null){
            System.out.print(current.val+"->");
            current = current.next;
        }
    }
}

class SolutionAddTwoNumbers{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode temp = result;
        ListNode tempL1 = l1;
        ListNode tempL2 = l2;
        int carry=0;
        while (tempL1 != null || tempL2 != null){
            if(tempL1 != null && tempL2 != null){
                int add = tempL1.val + tempL2.val;
                if(add>=10 && carry==0){
                    carry = add/10;
                    ListNode newNode = new ListNode(add%10);
                    temp.next = newNode;
                    temp = newNode;
                }
                else if (add<10 && carry==0) {
                    ListNode newNode = new ListNode(add);
                    temp.next = newNode;
                    temp = newNode;
                }
                else if(carry>0){
                    add += carry;
                    if(add>=10){
                        carry = add/10;
                        ListNode newNode = new ListNode(add%10);
                        temp.next = newNode;
                        temp = newNode;
                    } else if (add<10) {
                        ListNode newNode = new ListNode(add);
                        temp.next = newNode;
                        temp = newNode;
                        carry = 0;
                    }
                }
                tempL1 = tempL1.next;
                tempL2 = tempL2.next;
            }else if(tempL1 != null){
                int add = tempL1.val;
                add += carry;
                if(add>=10){
                    carry = add/10;
                    ListNode newNode = new ListNode(add%10);
                    temp.next = newNode;
                    temp = newNode;
                } else if (add<10) {
                    ListNode newNode = new ListNode(add);
                    temp.next = newNode;
                    temp = newNode;
                    carry = 0;
                }
                tempL1 = tempL1.next;
            }else{
                int add = tempL2.val;
                add += carry;
                if(add>=10){
                    carry = add/10;
                    ListNode newNode = new ListNode(add%10);
                    temp.next = newNode;
                    temp = newNode;
                } else if (add<10) {
                    ListNode newNode = new ListNode(add);
                    temp.next = newNode;
                    temp = newNode;
                    carry = 0;
                }
                tempL2 = tempL2.next;
            }

            if (tempL1==null && tempL2 == null && carry>0){
                ListNode newNode = new ListNode(carry);
                temp.next = newNode;
                temp = newNode;
            }
        }
        return result.next;
    }
}