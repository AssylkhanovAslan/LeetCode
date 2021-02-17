import helpers.ListNode;

/**
 * https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 *
 */
public class RemoveNthNodeFromEndofList {

    private static int inferSize(ListNode head) {
        int size = 0;
        while (head != null) {
            size++;
            head = head.next;
        }

        return size;
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int size = inferSize(head);
        ListNode prev = head;
        ListNode curr = head;

        int target = size - n;

        if (target == 0) {
            return head.next;
        }


        int counter = 0;

        while (curr != null) {

            if (counter == target) {
                prev.next = curr.next;
                break;
            }
            prev = curr;
            curr = curr.next;
            counter++;
        }

        return head;
    }
}
