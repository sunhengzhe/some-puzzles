const threeSum = require('../leetcode/leetcode-15-3Sum');

test('test case', function () {
    expect(threeSum([-1, 0, 1, 2, -1, -4])).toEqual([
        [ -1, -1, 2 ],
        [ -1, 0, 1 ]
    ]);

    expect(threeSum([0, 0, 0, 0])).toEqual([
        [0, 0, 0],
    ]);

    expect(threeSum([3,0,-2,-1,1,2])).toEqual([
        [-2, -1 ,3],
        [-2, 0, 2],
        [-1, 0, 1]
    ]);

    expect(threeSum([-1,0,1,0])).toEqual([
        [-1,0,1]
    ]);
});