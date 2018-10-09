/**
 * @param {number[]} A
 * @return {boolean}
 */
var isMonotonic = function(A) {
    let delta = 0;
    let prev = A[0];
    for (let i = 1; i < A.length; i++) {
        const cur = A[i];
        const diff = cur - prev;
        if (diff > 0 && delta < 0) {
            return false;
        }

        if (diff < 0 && delta > 0) {
            return false;
        }

        prev = cur;

        if (diff !== 0) {
            delta = diff;
        }
    }

    return true;
};

module.exports = isMonotonic;