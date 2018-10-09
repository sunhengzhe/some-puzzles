/**
 * @param {number[]} nums
 * @return {number[][]}
 */
var threeSum = function(nums) {
    nums = nums.sort((a, b) => a - b);
    let left = nums[0];
    let right = nums[nums.length - 1];
    const rst = [];

    if (left * right > 0) {
        return [];
    }

    for (let k = 1; k < nums.length - 1; k++) {
        const remain = 0 - nums[k];
        let i = 0, j = nums.length - 1;
        if (nums[k] === nums[k - 1]) {
            i = k - 1;
        }

        while (i < k && k < j) {
            if (nums[i] === nums[i - 1]) {
                i++;
                continue;
            }
            if (nums[j] === nums[j + 1]) {
                j--;
                continue;
            }

            if (nums[i] + nums[j] > remain) {
                j--;
            } else if (nums[i] + nums[j] < remain) {
                i++;
            } else {
                rst.push([nums[i], nums[k], nums[j]]);
                if (i < k - 1) {
                    i++;
                } else if (j > k + 1) {
                    j--;
                } else {
                    break;
                }
            }
        }
    }

    return rst;
};

threeSum([-1,0,1,0])

module.exports = threeSum;