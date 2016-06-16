## [338. Counting Bits](https://leetcode.com/problems/counting-bits/)

>Given a non negative integer number num. For every numbers i in the range 0 ≤ i ≤ num calculate the number of 1's in their binary representation and return them as an array.

>**Example:**

>For num = 5 you should return [0,1,1,2,1,2].

>**Follow up:**

>- It is very easy to come up with a solution with run time **O(n*sizeof(integer))**. But can you do it in linear time O(n) /possibly in a single pass?
>- Space complexity should be **O(n)**.
>- Can you do it like a boss? Do it without using any builtin function like **__builtin_popcount** in c++ or in any other language.

>**Hint**
>- You should make use of what you have produced already.
>- Or does the odd/even status of the number help you in calculating the number of 1s?
>- Divide the numbers in ranges like [2-3], [4-7], [8-15] and so on. And try to generate new range from previous.

第一时间的思路就是从0到num循环，将i转换为2进制的字符串，循环字符串计算出1的个数。但是题目中又要求时间复杂度为O(n),所以只能采用动态规划的方法，利用之前计算的结果来计算后面的数。

我写个两个方法，分别对应**Hint**中的两种思路，根据奇偶计算、分段计算。

### 方法一 根据奇偶计算

利用奇偶来计算的思路就是，

- 如果当前数的二进制的最后一位为“1”，则可以直接用前一个数的结果加1. 例： 111的结果为110的结果加1.
- 如果当前数的二进制的最后一位为“0”，则说明经历了前一个数加一后的进位。所以我们要根据前一个数来计算。

   
### 方法二 分段计算

感觉这个方法特别巧妙，效率比起上一个也更高。

原理就是分段来计算。

0 ， 1 ，[2-3],[4,7],[8-15]......以此类推，每一段的结果都等于对应的之前的结果加1.例如：6的结果为2的结果加1.


