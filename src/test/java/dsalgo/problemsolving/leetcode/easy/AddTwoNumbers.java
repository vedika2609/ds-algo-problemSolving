package dsalgo.problemsolving.leetcode.easy;

import dsalgo.datastructures.linkedlist.singlylinkedlist.Node;

/*
 * Created by : vedikagupta
 * Date : 21/09/20
 */
public class AddTwoNumbers {

//    public LinkedList addTwoNumbers(ListNode l1, ListNode l2) {
//        System.out.println(l1);
//    }

    private int getListSize(Node head) {
        int size = 0;
        while (head != null) {
            size++;
            head = head.next;
        }
        return size;
    }

}