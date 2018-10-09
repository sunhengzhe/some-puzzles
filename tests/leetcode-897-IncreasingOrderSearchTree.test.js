const increasingBST = require('../leetcode/leetcode-897-IncreasingOrderSearchTree');

function TreeNode(val) {
    this.val = val;
    this.left = this.right = null;
}

test('test case', function () {
    const root = new TreeNode(5);
    root.left = new TreeNode(3);
    root.left.left = new TreeNode(2);
    root.left.right = new TreeNode(4);
    root.left.left.left = new TreeNode(1);
    root.right = new TreeNode(6);
    root.right.right = new TreeNode(8);
    root.right.right.left = new TreeNode(7);
    root.right.right.right = new TreeNode(9);

    // result
    const rst = new TreeNode(1);
    rst.right = new TreeNode(2);
    rst.right.right = new TreeNode(3);
    rst.right.right.right = new TreeNode(4);
    rst.right.right.right.right = new TreeNode(5);
    rst.right.right.right.right.right = new TreeNode(6);
    rst.right.right.right.right.right.right = new TreeNode(7);
    rst.right.right.right.right.right.right.right = new TreeNode(8);
    rst.right.right.right.right.right.right.right.right = new TreeNode(9);

    expect(increasingBST(root))
        .toEqual(rst)
});
