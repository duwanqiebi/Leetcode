## [344. Reverse String](https://leetcode.com/problems/reverse-string/)

>Write a function that takes a string as input and returns the string reversed.</br></br></br>
>**Example:**</br></br>
>Given s = "hello", return "olleh".</br>

### 方法一 StringBuffer

使用stringBuffer的append的方法，从后向前遍历添加
   
### 方法二	双指针遍历

使用双指针，同时从左、右遍历，将左右指针对应的字符交换(效率高)