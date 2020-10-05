package dsalgo.datastructures.linkedlist;

/*
 * Created by : vedikagupta
 * Date : 21/09/20
 */

class ListNode {
    private int val;
    private ListNode next;

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