Here’s your content properly formatted in **Markdown** with code blocks and clear structure:

---

## Check if a Binary Tree is a Valid Binary Search Tree (BST)

Write a function to check that a binary tree is a valid binary search tree (BST).

Here's a sample binary tree node class:

```python
class BinaryTreeNode(object):
    def __init__(self, value):
        self.value = value
        self.left  = None
        self.right = None

    def insert_left(self, value):
        self.left = BinaryTreeNode(value)
        return self.left

    def insert_right(self, value):
        self.right = BinaryTreeNode(value)
        return self.right
```

---

### Example Function to Validate BST

```python
def is_valid_bst(node, min_value=float('-inf'), max_value=float('inf')):
    if node is None:
        return True
    if not (min_value < node.value < max_value):
        return False
    return (is_valid_bst(node.left, min_value, node.value) and
            is_valid_bst(node.right, node.value, max_value))
```

**Usage Example:**

```python
root = BinaryTreeNode(10)
root.insert_left(5)
root.insert_right(15)
root.left.insert_left(2)
root.left.insert_right(7)

print(is_valid_bst(root))  # Output: True
```

---

This Markdown is ready to paste into a document, GitHub, or a tutorial.

If you want, I can also make a **version with ASCII diagram** showing the tree structure — it makes Markdown explanations much clearer. Do you want me to do that?
