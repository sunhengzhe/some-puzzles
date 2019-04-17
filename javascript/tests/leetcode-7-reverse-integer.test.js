const reverse = require('../leetcode/leetcode-7-reverse-integer');

describe('#7-reverse-integer', () => {
    test('positive', function () {
        expect(reverse(123)).toBe(321);
    });

    test('negative', function () {
        expect(reverse(-123)).toBe(-321);
    });

    test('overflow', function () {
        expect(reverse(1534236469)).toBe(0);
    });
})
