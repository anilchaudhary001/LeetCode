/**
在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个高效的函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。

示例:
现有矩阵 matrix 如下：
[
  [1,   4,  7, 11, 15],
  [2,   5,  8, 12, 19],
  [3,   6,  9, 16, 22],
  [10, 13, 14, 17, 24],
  [18, 21, 23, 26, 30]
]
给定 target = 5，返回 true。
给定 target = 20，返回 false。
*/

/**
书上的一个解析：
数组面试题：二维数组中的查找
1  2  8  9
2  4  9  12
4  7  10 13
6  8  11 15
如上列二维数组，每行每列都递增排序，如果在这个数组中查找数字7，则返回true；如果查找5，由于不存在，返回false。
解题思路：
1  2  8  |9        1  2  |8  9        1  2   8  9        1  2   8  9 
2  4  9  |12   →   2  4  |9  12   →   ———————            2  4  |9  12
4  7  10 |13       4  7  |10 13       2  4  |9  12   →   ———————     
6  8  11 |15       6  8  |11 15       4  7  |10 13       4  7  |10 13
                                      6  8  |11 15       6  8  |11 15
*/

// 通过书上这个思路写出来的代码：
class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0) { return false; }
        int col = 0, row = matrix[0].length - 1;
        while(col < matrix.length && row >= 0) {
            if(matrix[col][row] > target) {
                row--;
            } else if(matrix[col][row] < target) {
                col++;
            } else {
                return true;
            }
        }
        return false;
    }
}
