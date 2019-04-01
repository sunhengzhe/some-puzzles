const preOrder = require('../leetcode/leetcode-144-Binary-Tree-Preorder-Traversal');

const TreeNode = function (val) {
  this.val = val;
  this.left = this.right = null;
}

describe('#Binary Tree Preorder Traversal', () => {
  test('test case 1', () => {
    // 1 4 3 2
    const root = new TreeNode(1);
    root.left = new TreeNode(4);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(2);
    expect(preOrder(root)).toEqual([1, 4, 2, 3]);
  })
});