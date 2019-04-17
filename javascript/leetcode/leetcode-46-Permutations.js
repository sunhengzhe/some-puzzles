/**
 * @param {number[]} nums
 * @return {number[][]}
 */
var permute = function(nums) {
    const rst = [];
    function atomic(leftArr, arr) {
        if (arr.length === 1) {
            return rst.push(leftArr.concat([arr[0]]));
        }

        for (let i = 0; i < arr.length; i++) {
            atomic(leftArr.concat(arr[i]), arr.filter(item => item !== arr[i]));
        }
    }

    atomic([], nums);
    return rst;
};

module.exports = permute;
