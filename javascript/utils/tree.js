const TreeNode = function (val) {
  this.val = val;
  this.left = this.right = null;
}

const isNil = val => val === undefined || val === null;

const createTreeByLevelArray = (arr) => {
  if (!Array.isArray(arr) || !arr.length) {
     return null;
  }

  arr.unshift(undefined);

  const root = new TreeNode(arr[1]);
  let cur = { index: 1, node: root };
  const stack = [cur];

  while (stack.length) {
    cur = stack.pop();

    const leftIndex = cur.index * 2;
    const rightIndex = cur.index * 2 + 1;
    let leftVal = arr[leftIndex];
    let rightVal = arr[rightIndex];

    if (!isNil(rightVal)) {
      cur.node.right = new TreeNode(rightVal);
      stack.push({ index: rightIndex, node: cur.node.right });
    }

    if (!isNil(leftVal)) {
      cur.node.left = new TreeNode(leftVal);
      stack.push({ index: leftIndex, node: cur.node.left });
    }
  }

  return root;
}

const printPreOrder = root => {
  if (root) {
    console.log(root.val);
    printPreOrder(root.left);
    printPreOrder(root.right);
  }
}

const printInOrder = root => {
  if (root) {
    printInOrder(root.left);
    console.log(root.val);
    printInOrder(root.right);
  }
}

const printPostOrder = root => {
  if (root) {
    printPostOrder(root.left);
    printPostOrder(root.right);
    console.log(root.val);
  }
}

module.exports = {
  createTreeByLevelArray
}