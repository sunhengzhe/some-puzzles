const isValid = require('../leetcode/leetcode-20-ValidParentheses');

test('test case', function () {
    expect(isValid('()')).toBe(true);
    expect(isValid('()[]{}')).toBe(true);
    expect(isValid('(]')).toBe(false);
    expect(isValid('([)]')).toBe(false);
    expect(isValid('{[]}')).toBe(true);
});