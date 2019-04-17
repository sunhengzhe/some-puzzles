const permute = require('../leetcode/leetcode-46-Permutations');

describe('#46-Permutations', () => {
    test('given array is empty', function () {
        const nums1 = [];
        expect(permute(nums1)).toEqual(
            []
        );
    });

    test('given array is not empty', function () {
        const nums1 = [1, 2, 3];
        expect(permute(nums1)).toEqual(
            [
                [1, 2, 3],
                [1, 3, 2],
                [2, 1, 3],
                [2, 3, 1],
                [3, 1, 2],
                [3, 2, 1]
            ]
        );
    });
})
