const deleteDuplicates = require('../leetcode/leetcode-83-RemoveDuplicatesfromSortedList');

function ListNode(val) {
    this.val = val;
    this.next = null;
}

describe('#83-RemoveDuplicatesfromSortedList', () => {
    test('test case', function () {
        const test1 = new ListNode(1);
        test1.next = new ListNode(1);
        test1.next.next = new ListNode(2);

        const rst1 = new ListNode(1);
        rst1.next = new ListNode(2);
        expect(deleteDuplicates(test1)).toEqual(rst1);

        const test2 = new ListNode(1);
        test2.next = new ListNode(1);
        test2.next.next = new ListNode(2);
        test2.next.next.next = new ListNode(3);
        test2.next.next.next = new ListNode(3);

        const rst2 = new ListNode(1);
        rst2.next = new ListNode(2);
        rst2.next.next = new ListNode(3);
        expect(deleteDuplicates(test2)).toEqual(rst2);

        const test3 = new ListNode(1);
        test3.next = new ListNode(1);
        test3.next.next = new ListNode(1);

        const rst3 = new ListNode(1);
        expect(deleteDuplicates(test3)).toEqual(rst3);
    });
});