/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} root
 * @return {TreeNode}
 */
var increasingBST = function(root) {
    let rst = null;
    let next = null;
    function inorderTraversal(node) {
        if (!node) {
            return;
        }

        inorderTraversal(node.left);
        const newNode = new TreeNode(node.val);
        if (!rst) {
            rst = newNode;
            next = rst;
        } else {
            next.right = newNode;
            next = newNode;
        }
        inorderTraversal(node.right);
    }

    inorderTraversal(root);

    return rst;
};

function TreeNode(val) {
    this.val = val;
    this.left = this.right = null;
}

module.exports = increasingBST;
