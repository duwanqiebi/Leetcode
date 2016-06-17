## [104. Maximum Depth of Binary Tree](https://leetcode.com/problems/maximum-depth-of-binary-tree/)

>Given a binary tree, find its maximum depth.

>The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.


求二叉树的深度，我使用了两种方法：递归和非递归

### 方法一 递归

递归求左子树和右子树的值并取最大值，即树的深度

   
### 方法二 非递归

非递归方法借助了一个队列来保存每一层的节点，按层遍历，遍历一层深度就加1.


