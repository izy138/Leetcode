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
    public ListNode rotateRight(ListNode head, int k) {
        //if list is empty or list head has nothing after it, or k rotations =0
        if(head == null || head.next == null || k == 0){
            return head;
        }

        int length = 1;
        ListNode temp = head;
        while(temp.next != null){
            temp = temp.next; // continues to traverse the list until the end
            length++; //we increment length with each iteration length 1 at head
        }

        temp.next = head; //make the list circular the last node points to the head.
        //calculate the number of rotations
        //ex k=3 and [1,2,3,4,5] = [5,1,2,3,4] = [4,5,1,2,3] = [3,4,5,1,2]
        k = k % length; //k = 3 % 5 = 3 this handles when k is larger that the length of the list. //
        k = length - k; // k = 5 - 3 = 2  // REMOVE THIS FOR LEFT ROTATION


        //to find the new end of the list you subtract k while iterating from temp which is at the the end of the list
        while(k-- > 0){ 
            temp = temp.next;
            //temp is currently at 5.
            //k = 2 temp next is 1;
            //k = 1 temp next is 2;
            //k = 0 !> 0 exits loop. temp (the new list head) is now 2.
        }
        // temp = 2 and represents the end of the list. , so temp.next (the NEW HEAD) = 3.
        head = temp.next; //head is 3.
        temp.next = null;


        return head;
    }
}