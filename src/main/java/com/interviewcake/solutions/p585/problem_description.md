Here’s a clean **Markdown‑ready** version of the *Interview Cake “Balanced Binary Tree”* problem — formatted and paraphrased based on the official prompt and description: ([interviewcake.com][1])

---

## Balanced Binary Tree — Interview Cake Question

**Write a function to determine whether a binary tree is “superbalanced.”**
A tree is *superbalanced* if **the difference between the depths of any two leaf nodes is no greater than one**. ([interviewcake.com][1])

### Sample Binary Tree Node Class (Python)

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

### Problem Details

* You are given the root node of a binary tree.
* You need to **check whether the tree is “superbalanced”** — meaning:

    * No two leaves in the tree differ in depth by more than 1. ([interviewcake.com][1])
* A **leaf** is any node with no children.
* The tree may be empty or have only one node — in either case it is considered superbalanced.

---

### Clarification / Gotchas

* A naive recursive check of “left subtree is balanced and right subtree is balanced” **is not sufficient** to guarantee superbalancedness. ([Coursehunters community (Beta)][2])
* For example: if one subtree only has leaves at depths 10 and 11, and the other subtree only has leaves at depths 11 and 12, each subtree is balanced, but overall leaf depths differ by more than 1. ([Coursehunters community (Beta)][2])

---

### What to Consider

* You’ll need to find the **depth of each leaf** and compare them.
* As you traverse the tree (e.g., with a depth‑first search), keep track of the set of distinct leaf depths encountered.
* The tree is **unbalanced** if:

    * There are more than **two distinct leaf depths**, or
    * There are **two distinct depths that differ by more than 1**. ([Coursehunters community (Beta)][2])

---

### Example (in Words)

Imagine you have this tree:

```
        5
      /   \
     3     8
    /     / \
   1     7   9
```

* Leaves here are at depths 2 and 3.
* Because *max(depths) − min(depths) ≤ 1*, this tree is superbalanced.

---

## Next Steps

If you want, I can also provide:

* **Python code** for this solution
* **Java implementation**
* **Explanation of time/space complexity**

Just let me know!

[1]: https://www.interviewcake.com/question/java/balanced-binary-tree?utm_source=chatgpt.com "Balanced Binary Tree (Practice Interview Question)"
[2]: https://coursehunters.online/t/the-interview-cake-course-5-trees-and-graphs/3182?utm_source=chatgpt.com "The Interview Cake Course (5. Trees and graphs)"
