# Write your MySQL query statement below
-- Window Function
select score , dense_rank() over(order by score desc) as 'rank'
from Scores 
order by score desc;