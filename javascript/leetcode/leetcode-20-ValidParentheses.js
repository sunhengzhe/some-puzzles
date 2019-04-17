/**
 * @param {string} s
 * @return {boolean}
 */
var isValid = function(s) {
    const map = {
        ']': '[',
        '}': '{',
        ')': '('
    };
    const stack = [];
    for (const char of s) {
        if (/[\)\]\}]/.test(char)) {
            const top = stack[stack.length - 1];
            if (map[char] === top) {
                stack.pop();
            } else {
                return false;
            }
        } else {
            stack.push(char);
        }
    }

    return stack.length === 0;
};

module.exports = isValid;