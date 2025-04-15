# Write your MySQL query statement below


select player_id, min(event_date) as first_login
from Activity
group by player_id;






-- select a1.player_id,a1.event_date as first_login
-- from Activity a1
-- inner join Activity a2
-- on a1.player_id = a2.player_id and a1.event_date<a2.event_date;