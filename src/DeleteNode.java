public class DeleteNode {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        deleteNode(head.next);

        System.out.println("Reversed List:");
        ReverseLinkedList.printList(head);
    }
    public static void deleteNode(ListNode node) {

        int delVal = node.val;
        int val2 = node.next.val;
        node.val = val2;
        node.next.val = delVal;

        ListNode curr = node;
        node = node.next.next;
        curr.next = node;
    }
}
