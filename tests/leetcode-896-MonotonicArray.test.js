const isMonotonic = require('../leetcode/leetcode-896-MonotonicArray');

test('test case', function () {
    expect(isMonotonic([1,2,2,3])).toBe(true);
    expect(isMonotonic([6,5,4,4])).toBe(true);
    expect(isMonotonic([1, 3, 2])).toBe(false);
    expect(isMonotonic([1,1,1])).toBe(true);
    expect(isMonotonic([11,11,9,4,3,3,3,1,-1,-1,3,3,3,5,5,5])).toBe(false);
});
