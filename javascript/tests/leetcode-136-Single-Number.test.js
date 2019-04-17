const singleNumber = require('../leetcode/leetcode-136-Single-Number');

describe('#136. Single Number', () => {
  test('test case', () => {
    expect(singleNumber([2,2,1])).toBe(1);
    expect(singleNumber([4,1,2,1,2])).toBe(4);
  })
})