/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} root
 * @return {number[]}
 */
var preorderTraversal = function(root) {
  const stack = [root];
  const result =[];

  while (stack.length) {
      const top = stack.pop();
      if (top !== null) {
          result.push(top.val);
          stack.push(top.right);
          stack.push(top.left);
      }
  }

  return result;
};

module.exports = preorderTraversal