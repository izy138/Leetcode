
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode merged = new ListNode(0);
        //pointer to merged list
        ListNode curr = merged;

        //list 1 = [1,2,3]
        //list 2 = [1,3,4]
        // merged = 0 -> null
        while (list1 != null && list2 != null) {
            //checks if list1 value is less than or equal
            if (list1.val <= list2.val) {
                curr.next = list1;
                list1 = list1.next; //first loop, third loop
            }else{
                curr.next = list2;
                list2 = list2.next; //second loop
            }
            //pointer moves to the next node
            curr = curr.next;
        }
        // first loop
        // merged = 0 -> 1 -> null
        // list 1 = [2,3]
        // list 2 = [1,3,4]

        // second loop
        // merged = 0 -> 1 -> 1 -> null
        // list 1 = [2,3]
        // list 2 = [3,4]

        // third loop
        // merged = 0 -> 1 -> 1 -> 2 -> null
        // list 1 = [3]
        // list 2 = [3,4]

        //after exiting loop, that means one of the lists is null
        //this will append the list that still has elements to the list.
        if (list1 != null) {
            curr.next = list1;
        }else {
            curr.next = list2;
        }
        return merged.next;
    }
}
