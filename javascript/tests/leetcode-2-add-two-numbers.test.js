const { ListNode, addTwoNumbers } = require('../leetcode/leetcode-2-add-two-numbers');

describe('#2-add-two-numbers', () => {
    test('a + a without carry', function () {
        const n = new ListNode(1);
        const n2 = new ListNode(2);

        const r = new ListNode(3);
        expect(addTwoNumbers(n, n2)).toEqual(r);
    });

    test('a + a with carry', function () {
        const n = new ListNode(4);
        const n2 = new ListNode(9);

        const r = new ListNode(3);
        r.next = new ListNode(1);
        expect(addTwoNumbers(n, n2)).toEqual(r);
    });

    test('ab + a without carry', function () {
        const n = new ListNode(4);
        n.next = new ListNode(1);
        const n2 = new ListNode(5);

        const r = new ListNode(9);
        r.next = new ListNode(1);
        expect(addTwoNumbers(n, n2)).toEqual(r);
    });

    test('ab + a with carry', function () {
        const n = new ListNode(9);
        n.next = new ListNode(1);
        const n2 = new ListNode(5);

        const r = new ListNode(4);
        r.next = new ListNode(2);
        expect(addTwoNumbers(n, n2)).toEqual(r);
    });

    test('ab + ab without carry', function () {
        const n = new ListNode(9);
        n.next = new ListNode(1);
        const n2 = new ListNode(5);
        n2.next = new ListNode(2);

        const r = new ListNode(4);
        r.next = new ListNode(4);
        expect(addTwoNumbers(n, n2)).toEqual(r);
    });

    test('ab + ab with carry', function () {
        const n = new ListNode(9);
        n.next = new ListNode(8);
        const n2 = new ListNode(5);
        n2.next = new ListNode(2);

        const r = new ListNode(4);
        r.next = new ListNode(1);
        r.next.next = new ListNode(1);
        expect(addTwoNumbers(n, n2)).toEqual(r);
    });
});
