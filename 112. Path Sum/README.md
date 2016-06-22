## [112. Path Sum](https://leetcode.com/problems/path-sum/)

>Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.

>For example:

>Given the below binary tree and sum = 22,

><pre>              5
             / \
            4   8
           /   / \
          11  13  4
         /  \      \
        7    2      1
</pre>

>return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.

后序遍历二叉树，当栈顶节点为叶子节点时，当前栈中的总和即为这条路径的和。







   



