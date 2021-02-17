import helpers.ListNode;

import java.util.ArrayList;

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

    public static ListNode removeNthFromEndSingleFollowUp(ListNode head, int n) {
        ArrayList<ListNode> nodes = new ArrayList<>();

        int size = 0;
        ListNode curr = head;
        while (curr != null) {
            nodes.add(curr);
            curr = curr.next;
            size++;
        }

        int targetIndex = size - n;
        ListNode nodeToRemove = nodes.get(targetIndex);
        if (targetIndex == 0) {
            return nodeToRemove.next;
        }

        ListNode prev = nodes.get(targetIndex - 1);
        prev.next = nodeToRemove.next;

        return head;
    }
}
