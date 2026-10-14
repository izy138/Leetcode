# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def swapPairs(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        dummy = ListNode(0,head)
        prev, curr = dummy, head

        while curr and curr.next:
            nextPrevNode = curr.next.next
            nextNode = curr.next

            nextNode.next = curr
            curr.next = nextPrevNode
            prev.next = nextNode

            prev = curr
            curr = nextPrevNode

        return dummy.next

