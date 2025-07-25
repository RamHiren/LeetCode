# Write your MySQL query statement below
select requester_id as id,count(*) as num
from (
    select requester_id 
    from RequestAccepted 

    union all

    select accepter_id  
    from RequestAccepted 
) as m_table
group by requester_id
order by num desc
limit 1