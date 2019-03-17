const lengthOfLongestSubstring = require('../leetcode/leetcode-3-LongestSubstringWithoutRepeatingCharacters');

describe('#3-LongestSubstringWithoutRepeatingCharacters', () => {
    test('should works as expected', function () {
        expect(lengthOfLongestSubstring('abcabcbb')).toBe(3);
        expect(lengthOfLongestSubstring('bbbbb')).toBe(1);
        expect(lengthOfLongestSubstring('pwwkew')).toBe(3);
        expect(lengthOfLongestSubstring('')).toBe(0);
        expect(lengthOfLongestSubstring('a')).toBe(1);
        expect(lengthOfLongestSubstring('ab')).toBe(2);
        expect(lengthOfLongestSubstring('abc')).toBe(3);
        expect(lengthOfLongestSubstring('abba')).toBe(2);
    });
})
