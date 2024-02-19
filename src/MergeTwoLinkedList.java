public class MergeTwoLinkedList {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

//        System.out.println("Original List:");
//        ReverseLinkedList.printList(head);

        ListNode head = mergeTwoLists(list1 , list2);

        System.out.println("Reversed List:");
        ReverseLinkedList.printList(head);
    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode head = null;
        ListNode curr = null;

        while(list1!=null && list2!=null){
            if(list1.val <= list2.val){
                ListNode temp = new ListNode(list1.val);
                temp.next = null;
                if(head == null)
                    head = temp;
                else
                    head.next = temp;
                list1 = list1.next;
            }
            else{
                ListNode temp = new ListNode(list2.val);
                temp.next = null;
                if(head == null)
                    head = temp;
                else
                    head.next = temp;
                list2 = list2.next;
            }
        }
        return head;
    }
}
