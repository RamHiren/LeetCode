# Write your MySQL query statement below
select contest_id,
    round(count(contest_id)*100/(select  count(distinct user_id) from Users),2)as percentage 
from Register r
group by contest_id
order by count(contest_id) desc,contest_id
