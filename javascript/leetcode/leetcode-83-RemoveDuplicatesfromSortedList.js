/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var deleteDuplicates = function(head) {
    let pre = null;
    let node = head;

    while (node) {
        if (pre && node.val === pre.val) {
            pre.next = node.next;
        } else {
            pre = node;
        }

        node = node.next;
    }

    return head;
};

module.exports = deleteDuplicates;
