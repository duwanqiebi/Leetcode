## [102. Binary Tree Level Order Traversal](https://leetcode.com/problems/binary-tree-level-order-traversal/)

>Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

>For example, Given binary tree [3,9,20,null,null,15,7],

><pre>    3
   / \
  9  20
    /  \
   15   7
</pre>

>return its level order traversal as:

><pre>[
  [3],
  [9,20],
  [15,7]
]
</pre>



二叉树按层次遍历。借助队列。但是又要题目对输出的格式有要求，刚开始我没想出来简便的方法去判断何时“换行”，所以用了两个队列互相交换。

AC了之后看讨论区，看到了一个使用一个队列的方法(方法二)

###  方法一 两个队列



###  方法二 一个队列



   



