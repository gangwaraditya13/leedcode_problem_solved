public class MergeTwoSortedLists {
    public static void main(String[] args){
        SolutionMergeTwoSortedLists sortedLists = new SolutionMergeTwoSortedLists();
        LinkedList linkedList = new LinkedList();
        int[] arr = new int[]{1,2,3,4,5};
        int[] arr1 = new int[]{1,2,3,10,11};
        ListNode listNode1 = linkedList.insertionArrayToLinkedList(arr);
        ListNode listNode2 = linkedList.insertionArrayToLinkedList(arr1);
        ListNode listNode = sortedLists.mergeTwoLists(listNode1,listNode2);
        linkedList.printLinkedList(listNode);
    }
}


class ListNode {
      int val;
 ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

class SolutionMergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode head = new ListNode(0);
        ListNode corrent = head;
        ListNode corrent1 = list1;
        ListNode corrent2 = list2;

        while(corrent1!= null || corrent2 != null){

            if(list1 == null && corrent2 != null){
                int val = corrent2.val;
                ListNode newNode = new ListNode(val);
                corrent.next = newNode;
                corrent = newNode;
                corrent2 = corrent2.next;
            } else if (list2 == null && corrent1 != null) {
                int val = corrent1.val;
                ListNode newNode = new ListNode(val);
                corrent.next = newNode;
                corrent = newNode;
                corrent1 = corrent1.next;
            }else{
                if(corrent1 != null && corrent2 != null ) {
                    if (corrent1.val < corrent2.val) {
                        ListNode newNode = new ListNode(corrent1.val);
                        corrent.next = newNode;
                        corrent = newNode;
                        corrent1 = corrent1.next;
                    } else if (corrent1.val > corrent2.val) {
                        ListNode newNode = new ListNode(corrent2.val);
                        corrent.next = newNode;
                        corrent = newNode;
                        corrent2 = corrent2.next;
                    }else{
                        ListNode newNode = new ListNode(corrent1.val);
                        corrent.next = newNode;
                        corrent = newNode;
                        corrent1 = corrent1.next;

                        ListNode newNode2 = new ListNode(corrent2.val);
                        corrent.next = newNode2;
                        corrent = newNode2;
                        corrent2 = corrent2.next;
                    }
                } else if (corrent1 != null){
                    ListNode newNode = new ListNode(corrent1.val);
                    corrent.next = newNode;
                    corrent = newNode;
                    corrent1 = corrent1.next;
                }else{
                    ListNode newNode2 = new ListNode(corrent2.val);
                    corrent.next = newNode2;
                    corrent = newNode2;
                    corrent2 = corrent2.next;
                }
            }

        }

        return head.next;
    }
}

class LinkedList{
    public ListNode insertionArrayToLinkedList(int[] arr) {
        ListNode head = new ListNode(arr[0]);
        ListNode corrent = head;
        for (int i = 1; i < arr.length; i++) {
            ListNode newNode = new ListNode(arr[i]);
            corrent.next = newNode;
            corrent = newNode;
        }
        return head;
    }

    public void printLinkedList(ListNode listNode){

        ListNode corrent = listNode;
        System.out.println("====================================");
        while(corrent != null){
            System.out.println(corrent.val);
            corrent = corrent.next;
        }
    }
}


//class precLinkedList{
//
//    public static void main(String[] args){
//        int[] arr = new int[]{1,2,3,4,5};
//
//        ListNode head = new ListNode(arr[0]);
//        ListNode corrent = head;
//        for (int i = 1; i < arr.length; i++) {
//            ListNode newNode = new ListNode(arr[i]);
//            corrent.next = newNode;
//            corrent = newNode;
//            System.out.println(corrent.val);
//        }
//
//        corrent = head;
//
//        while (corrent.next != null){
//            System.out.println("node method I: "+corrent.val);
//            corrent = corrent.next;
//        }
//        System.out.println("node : "+corrent.val);
//
//        corrent = head;
//
//        while (corrent != null) {
//            System.out.println("node method II: " + corrent.val);
//            corrent = corrent.next;
//        }
//
//    }
//}