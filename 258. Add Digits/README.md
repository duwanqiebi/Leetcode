## [258. Add Digits](https://leetcode.com/problems/add-digits/)

>Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

>For example:

>Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.

>Follow up:
>Could you do it without any loop/recursion in O(1) runtime?

>Hint:

>- A naive implementation of the above process is trivial. Could you come up with other methods?
>- What are all the possible results?
>- How do they occur, periodically or randomly?
>- You may find this Wikipedia article useful.


数字循环相加到最后一个数字，这叫数根(digital root)。

结论：树根就是这个数对9的余数（如果是0，就是9）；

知乎上看到一个很好理解的例子：

>12,345 = 1 × (9,999 + 1) + 2 × (999 + 1) + 3 × (99 + 1) + 4 × (9 + 1) + 5.

>12,345 = (1 × 9,999 + 2 × 999 + 3 × 99 + 4 × 9) + (1 + 2 + 3 + 4 + 5).



