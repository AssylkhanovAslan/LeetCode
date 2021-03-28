import helpers.ListNode;

public class Main {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        ListNode sixth = new ListNode(6);
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;

        ListNode result = SwapNodesInPairs.simpleSolution(head);

        System.out.println(result);
    }

    public static void println(Object o) {
        System.out.println(o);
    }

}
