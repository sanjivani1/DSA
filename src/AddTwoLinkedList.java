public class AddTwoLinkedList {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(0);
        list1.next = new ListNode(8);
        list1.next.next = new ListNode(6);
        list1.next.next.next = new ListNode(5);
        list1.next.next.next.next = new ListNode(6);
        list1.next.next.next.next.next = new ListNode(8);
        list1.next.next.next.next.next.next = new ListNode(3);
        list1.next.next.next.next.next.next.next = new ListNode(5);
        list1.next.next.next.next.next.next.next.next = new ListNode(7);


        ListNode list2 = new ListNode(6);
        list2.next = new ListNode(7);
        list2.next.next = new ListNode(8);
        list2.next.next.next = new ListNode(0);
        list2.next.next.next.next = new ListNode(8);
        list2.next.next.next.next.next = new ListNode(5);
        list2.next.next.next.next.next.next = new ListNode(8);
        list2.next.next.next.next.next.next.next = new ListNode(9);
        list2.next.next.next.next.next.next.next.next = new ListNode(7);
//        list2.next.next.next.next.next.next.next.next.next = new ListNode(9);
//        list2.next.next.next.next.next.next.next.next.next.next = new ListNode(9);


        ListNode head = addTwoNumbers(list1 , list2);

        System.out.println("Reversed List:");
        ReverseLinkedList.printList(head);
    }
    public static long reverseNum(long n){
        long newNum = 0;
        while(n!= 0){
            newNum = newNum * 10 + (n%10);
            n /= 10;
        }
        return newNum;
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        long num1 = 0;
        long num2 = 0;
        while(l1!=null){
            num1 = num1*10+ l1.val;
            l1=l1.next;
        }
        while(l2!=null){
            num2 = num2*10+ l2.val;
            l2=l2.next;
        }
        long sum = reverseNum(num2)+reverseNum(num1);

        if(sum == 0){
            ListNode temp = new ListNode(0);
            return temp;
        }
        ListNode head = null;
        ListNode curr = null;
        while(sum!=0){

            if(head == null){
                ListNode temp = new ListNode((int) (sum%10));
                temp.next = null;
                head = temp;
                curr = head;
            }
            else{
                ListNode temp = new ListNode((int) (sum%10));
                temp.next = null;
                curr.next = temp;
                curr= curr.next;
            }
            sum = sum/10;
        }
        return head;
    }
}
