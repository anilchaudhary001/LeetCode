/*
Table: Tweets

+----------------+---------+
| Column Name    | Type    |
+----------------+---------+
| tweet_id       | int     |
| content        | varchar |
+----------------+---------+
tweet_id is the primary key for this table.
This table contains all the tweets in a social media app.
Write an SQL query to find the IDs of the invalid tweets. The tweet is invalid if the number of characters used in the content of the tweet is strictly greater than 15.
Return the result table in any order.
The query result format is in the following example.

Example 1:

Input: 
Tweets table:
+----------+----------------------------------+
| tweet_id | content                          |
+----------+----------------------------------+
| 1        | Vote for Biden                   |
| 2        | Let us make America great again! |
+----------+----------------------------------+
Output: 
+----------+
| tweet_id |
+----------+
| 2        |
+----------+
Explanation: 
Tweet 1 has length = 14. It is a valid tweet.
Tweet 2 has length = 32. It is an invalid tweet.
*/

/*
执行用时：636 ms, 在所有 MySQL 提交中击败了49.78%的用户
内存消耗：0 B, 在所有 MySQL 提交中击败了100.00%的用户
通过测试用例：22 / 22
*/

# Write your MySQL query statement below
SELECT tweet_id
FROM Tweets
WHERE length(content) > 15