import helpers.ListNode;

public class SwapNodesInPairs {
    public static ListNode simpleSolution(ListNode head) {
        int count = 0;
        ListNode curr = head;
        ListNode prev = null;

        while (curr != null) {
            count++;
            if (count == 2) {
                ListNode temp = curr;
                curr = prev;
                prev = temp;
                count = 0;
            }

            curr = curr.next;
        }

        return head;
    }
}
