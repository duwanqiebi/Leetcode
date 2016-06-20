## [98. Validate Binary Search Tree](https://leetcode.com/problems/validate-binary-search-tree/)

>Given a binary tree, determine if it is a valid binary search tree (BST).

>Assume a BST is defined as follows:

>- The left subtree of a node contains only nodes with keys **less than** the node's key.

>- The right subtree of a node contains only nodes with keys **greater than** the node's key.

>- Both the left and right subtrees must also be binary search trees.

>**Example 1:**

><pre>    2
   / \
  1   3
</pre>

>Binary tree [2,1,3], return true.

>**Example 2:**

><pre>    1
   / \
  2   3
</pre>

>Binary tree [1,2,3], return false.


校验一个二叉树是否是一个二叉搜索树(BST)

使用中序遍历，二叉搜索树中序遍历的结果是由小到大排列的。


   



