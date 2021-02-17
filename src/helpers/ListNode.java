package helpers;

public class ListNode {
      public int val;
      public ListNode next;
      public ListNode() {}
      public ListNode(int val) { this.val = val; }
      public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

      public String toString() {
            ListNode curr = this;
            StringBuilder output = new StringBuilder();
            while (curr != null) {
                  output.append(curr.val).append("->");
                  curr = curr.next;
            }
            return output.toString();
      }
}