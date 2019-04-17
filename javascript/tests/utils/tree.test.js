const { createTreeByLevelArray } = require('../../utils/tree');

describe('#utils', () => {
  describe('#createTreeByLevelArray', () => {
    test('should return null if no value specified', () => {
      expect(createTreeByLevelArray([])).toBeNull();
    })

    test('should build tree related data', () => {
      const root = createTreeByLevelArray([1, 2, 3, null, 4, 5]);
      expect(root.val).toBe(1);
      expect(root.left.val).toBe(2);
      expect(root.right.val).toBe(3);
      expect(root.left.left).toBeNull();
      expect(root.left.right.val).toBe(4);
      expect(root.right.left.val).toBe(5);
      expect(root.right.right).toBeNull();
    })
  })
})
