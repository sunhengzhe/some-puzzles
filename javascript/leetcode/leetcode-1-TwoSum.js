/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    const map = {};
    for (let i = 0; i < nums.length; i++) {
        const cur = nums[i];
        const remain = target - cur;

        if (map[remain] !== undefined) {
            return [map[remain], i];
        }

        map[cur] = i;
    }
};

module.exports = twoSum;