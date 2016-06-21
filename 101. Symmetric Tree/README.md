## [101. Symmetric Tree](https://leetcode.com/problems/symmetric-tree/)

>Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

>For example, this binary tree [1,2,2,3,4,4,3] is symmetric:

><pre>    1
   / \
  2   2
 / \ / \
3  4 4  3
</pre>

>But the following [1,2,2,null,3,null,3] is not:

><pre>    1
   / \
  2   2
   \   \
   3    3
</pre>

>**Note:**

>Bonus points if you could solve it both recursively and iteratively.

根据题目中的两个例子，我就想使用中序遍历遍历树，得出的序列如果是对称的，那就是对称的树。

但是提交后错误。原因是：

<pre>    1
   / \
  2   3
   \   \
   3    2
</pre>

的中序遍历是【2,3,1,2,3】，但是它并不是对称树。所以我使用左右子树采取相反顺序遍历来比较。

###  非递归

使用两个栈来分别遍历左子树与右子树，左子树的左子树先入栈，后子树再入栈，而右子树相反。

###  递归

与非递归思路一样。

   



