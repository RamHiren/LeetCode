# Write your MySQL query statement below
select teacher_id,count(distinct subject_id) as cnt
from Teacher t
group by teacher_id

