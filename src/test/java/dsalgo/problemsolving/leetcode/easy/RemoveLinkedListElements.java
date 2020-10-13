package dsalgo.problemsolving.leetcode.easy;

/*
 * Created by : vedikagupta
 * Date : 30/09/20
 */
public class RemoveLinkedListElements {
    public static void main(String[] args) {

    }

    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = head;
        ListNode prev = null;

        if (head != null && head.val == val)
            return temp.next;

        while (temp.next != null && temp.val != val) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null)
            return head;

        prev.next = temp.next;
        return head;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

    }
}