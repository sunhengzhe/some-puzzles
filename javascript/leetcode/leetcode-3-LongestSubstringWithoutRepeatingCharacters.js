var lengthOfLongestSubstring = function(s) {
    if (!s) {
        return 0;
    }

    let maxLength = 0;
    const map = {};
    let left = -1;
    let size = 0;
    for (let i = 0; i < s.length; i++) {
        const char = s[i];
        if (map[char] === undefined || (map[char] < left)) {
            size += 1;
        } else {
            size = i - map[char];
            left = map[char] + 1;
        }

        if (size > maxLength) {
            maxLength = size;
        }
        
        map[char] = i;
    }

    return maxLength;
};

module.exports = lengthOfLongestSubstring;