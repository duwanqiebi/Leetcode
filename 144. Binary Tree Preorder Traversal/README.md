## [144. Binary Tree Preorder Traversal](https://leetcode.com/problems/binary-tree-preorder-traversal/)

>Given a binary tree, return the preorder traversal of its nodes' values.

>For example:

>Given binary tree {1,#,2,3},

><pre>   1
    \
     2
    /
   3
</pre>

>return [1,2,3].


二叉树先序遍历

### 方法一 递归

读当前节点的值，然后递归遍历左子树、右子树

   
### 方法二 非递归

借助栈。先将右子树入栈，再入左子树。


