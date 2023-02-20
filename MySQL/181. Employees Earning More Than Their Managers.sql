/*
Table: Employee

+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| id          | int     |
| name        | varchar |
| salary      | int     |
| managerId   | int     |
+-------------+---------+
id is the primary key column for this table.
Each row of this table indicates the ID of an employee, their name, salary, and the ID of their manager.

Write an SQL query to find the employees who earn more than their managers.
Return the result table in any order.
The query result format is in the following example.

Example 1:

Input: 
Employee table:
+----+-------+--------+-----------+
| id | name  | salary | managerId |
+----+-------+--------+-----------+
| 1  | Joe   | 70000  | 3         |
| 2  | Henry | 80000  | 4         |
| 3  | Sam   | 60000  | Null      |
| 4  | Max   | 90000  | Null      |
+----+-------+--------+-----------+
Output: 
+----------+
| Employee |
+----------+
| Joe      |
+----------+
Explanation: Joe is the only employee who earns more than his manager.
*/

/*
solution 1
执行用时：364 ms, 在所有 MySQL 提交中击败了82.18%的用户
内存消耗：0 B, 在所有 MySQL 提交中击败了100.00%的用户
通过测试用例：14 / 14
*/

# Write your MySQL query statement below
SELECT a.name AS 'Employee'
FROM Employee a, Employee b
WHERE 
    a.managerId = b.id
    AND a.salary > b.salary
