public class LinkedListPallindrome {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);

        Boolean flag = isPalindrome(head);
        System.out.print(flag);
    }

    public static ListNode reverseList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }
        ListNode curr = head;
        ListNode prev = null;
        ListNode after = curr.next;
        head.next = null;

        while(after!=null){

            prev = curr;
            curr = after;
            after = after.next;
            curr.next = prev;
        }

        return curr;
    }
    public static boolean isPalindrome(ListNode head) {

        int num = 0;
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next!= null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode first = head;
        ListNode second = reverseList(slow.next);
        if(slow.next == null){
            if(first.val != slow.val){
                return false;
            }
        }

        while(second!=null){
            if(first.val!=second.val){
                return false;
            }
            second = second.next;
            first = first.next;
        }
        return true;
    }
}
