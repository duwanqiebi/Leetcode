## [103. Binary Tree Zigzag Level Order Traversal](https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/)

>Given a binary tree, return the zigzag level order traversal of its nodes' values. (ie, from left to right, then right to left for the next level and alternate between).

>For example, Given binary tree [3,9,20,null,null,15,7],

><pre>    3
   / \
  9  20
    /  \
   15   7
</pre>

>return its zigzag level order traversal as:

><pre>[
  [3],
  [20,9],
  [15,7]
]
</pre>


与102题一样，只是添加了一个状态变量，用来判断是否翻转





   



