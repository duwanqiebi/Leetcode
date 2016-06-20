## [96. Unique Binary Search Trees](https://leetcode.com/problems/unique-binary-search-trees/)

>Given n, how many structurally unique BST's (binary search trees) that store values 1...n?

>For example:

>Given n = 3, there are a total of 5 unique BST's.

><pre>   1         3     3      2      1
    \       /     /      / \      \
     3     2     1      1   3      2
    /     /       \                 \
   2     1         2                 3
</pre>

动态规划，重要的是要找到迭代的公式。设参数为n时，二叉搜索树的数量为f(n)。 

先放几个显而易见的结论：

- **结论1.** 固定根节点，树的总数 = 左子树数量 * 右子树数量
- **结论2.**相同数量的二叉搜索树的数量是相同的。例如 以1,2,3为节点的树 与 以2,3,4位节点的树 的数量是相同的。

现在我们可以以4为例子去寻找公式，我们以根节点从1到4来寻找：

- 1.当根节点为1时，左子树为空,即为f(0)。右子树为以2,3,4位节点的二叉搜索树，根据结论2，即为f(3)。所以根节点为1的数量为 **f(0) * f(3)**;
- 2.当根节点为2时，左子树为以1为节点的树，即f(1)。右子树为以3,4为节点的树,即f(2)。所以根节点为2的数量为 **f(1) * f(2)**;
- 3.当根节点为3时，左子树为以1,2为节点的树，即f(2)。右子树为以4为节点的树,即f(1)。所以根节点为2的数量为 **f(2) * f(1)**;
- 4.当根节点为4时，左子树为以1,2,3为节点的树，即f(3)。右子树为空,即f(0)。所以根节点为2的数量为 **f(3) * f(0)**;

所以 <img src="http://latex.codecogs.com/gif.latex?\dpi{120}&space;\fn_jvn&space;\small&space;f(4)=f(0)*f(3)&plus;f(1)*f(2)&plus;f(2)*f(1)&plus;f(3)*f(0)=\sum_{i=0}^{n-1}f(i)*f(n-1-i)" title="\small f(4)=f(0)*f(3)+f(1)*f(2)+f(2)*f(1)+f(3)*f(0)=\sum_{i=0}^{n-1}f(i)*f(n-1-i)" />

最后可以得到公式:<img src="http://latex.codecogs.com/gif.latex?\dpi{120}&space;\fn_jvn&space;\small&space;f(n)=\left\{\begin{matrix}&space;n=0,&space;&1&space;\\&space;n=1,&space;&1&space;\\&space;n>1,&space;&\sum_{i=0}^{n-1}f(i)*f(n-i-i)&space;\end{matrix}\right." title="\small f(n)=\left\{\begin{matrix} n=0, &1 \\ n=1, &1 \\ n>1, &\sum_{i=0}^{n-1}f(i)*f(n-i-i) \end{matrix}\right." />








   



