# Write your MySQL query statement below
select r.contest_id, round(count(r.user_id)/(SELECT COUNT(*) FROM Users)*100,2) as percentage 
from Register r
group by r.contest_id
order by count(r.user_id) desc, r.contest_id ASC
