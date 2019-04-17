const intToRoman = require('../leetcode/leetcode-12-Integer-to-Roman')

describe('#12-Integer-to-Roman', () => {
  test('should Integer transfer to roman as expected', () => {
    expect(intToRoman(1)).toBe('I')
    expect(intToRoman(3)).toBe('III')
    expect(intToRoman(4)).toBe('IV')
    expect(intToRoman(9)).toBe('IX')
    expect(intToRoman(58)).toBe('LVIII')
    expect(intToRoman(1994)).toBe('MCMXCIV')
  })
})