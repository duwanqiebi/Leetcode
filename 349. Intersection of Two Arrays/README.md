## [344. Reverse String](https://leetcode.com/problems/reverse-string/)

>Given two arrays, write a function to compute their intersection.

>**Example:**

>Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].

>**Note:**

>- Each element in the result must be unique.

>- The result can be in any order.


先排序，在用两个指针去遍历两个数组。因为不能重复，所以结果用Set保存