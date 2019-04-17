function ListNode(val) {
    this.val = val;
    this.next = null;
}

var addTwoNumbers = function(l1, l2) {
    let head, node, isCarry;
    while (l1 || l2) {
        let sum, next;
        if (l1 && l2) {
            sum = l1.val + l2.val;
        } else if (l1) {
            sum = l1.val;
        } else {
            sum = l2.val;
        }
        
        if (isCarry) {
            sum += 1;
        }

        isCarry = sum >= 10;
        next = new ListNode(isCarry ? sum - 10 : sum);
        if (!head) {
            head = next;
            node = head;
        } else {
            node.next = next;
        }
        node = next;
        l1 = l1 && l1.next;
        l2 = l2 && l2.next;
    }

    if (isCarry) {
        node.next = new ListNode(1);
    }
    
    return head;
};

module.exports = {
    ListNode,
    addTwoNumbers
};