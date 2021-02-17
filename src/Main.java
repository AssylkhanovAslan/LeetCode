import helpers.ListNode;

public class Main {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        head.next = second;
        second.next = third;
        third.next = fourth;
        ListNode result = RemoveNthNodeFromEndofList.removeNthFromEnd(head, 4);
        System.out.println(result);

    }

    public static void println(Object o) {
        System.out.println(o);
    }

}
