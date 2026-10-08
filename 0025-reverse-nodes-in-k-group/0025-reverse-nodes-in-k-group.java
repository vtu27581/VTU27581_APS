class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode current = head;

        // Check if there are at least k nodes
        int count = 0;
        while (current != null && count < k) {
            current = current.next;
            count++;
        }

        // Less than k nodes, keep them unchanged
        if (count < k) {
            return head;
        }

        // Reverse k nodes
        ListNode prev = null;
        current = head;

        for (int i = 0; i < k; i++) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        // Connect with the remaining list
        head.next = reverseKGroup(current, k);

        return prev;
    }
}