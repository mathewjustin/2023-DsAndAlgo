package com.justin.algoexpert.mediums;

/**
 * @author Justin Mathew @dev_io
 *
 * ntuition
 * We are told that the most significant digit comes first, and that each of their nodes includes a single digit. To do a basic addition of two numbers using a sum of two digits and a carry, we must start with the least significant digits (the lowest place) and work our way up to the most significant digits.
 *
 * To get the order of digits from the least significant digits to the the most significant digits, we can reverse the given lists so the least significant digits come first.
 *
 * We can then iterate over the reversed lists to perform the addition of digits at corresponding places similar to the first approach.
 */


public class AddTwoNumbersII {


    public ListNode reverseList(ListNode head) {
        ListNode prev = null, temp;
        while (head != null) {
            // Keep the next node
            temp = head.next;
            // Reverse the link
            head.next = prev;
            // Update the previous node and the current node.
            prev = head;
            head = temp;
        }
        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode r1 = reverseList(l1);
        ListNode r2 = reverseList(l2);

        int totalSum = 0, carry = 0;
        ListNode ans = new ListNode();
        while (r1 != null || r2 != null) {
            if (r1 != null) {
                totalSum += r1.val;
                r1 = r1.next;
            }
            if (r2 != null) {
                totalSum += r2.val;
                r2 = r2.next;
            }

            ans.val = totalSum % 10;
            carry = totalSum / 10;
            ListNode head = new ListNode(carry);
            head.next = ans;
            ans = head;
            totalSum = carry;
        }

        return carry == 0 ? ans.next: ans;
    }
}
