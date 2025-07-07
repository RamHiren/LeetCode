-- # Write your MySQL query statement below
-- (select
--     distinct id,
--     "Root" as type
-- from Tree
-- where p_id is null)

-- union 

-- (select distinct t1.id, "Inner" as type
-- from Tree t1
-- left join Tree t2
-- on t2.p_id=t1.id
-- where t1.p_id is not null and t2.p_id is not null)

-- union

-- (select distinct t1.id , "Leaf" as type
-- from Tree t1
-- left join Tree t2
-- on t2.p_id=t1.id
-- where t2.id is null and t2.p_id is null)


select id,
    case
        when 
            p_id is null
            then "Root"
        when
            id in (select distinct p_id from Tree)
            then "Inner"
        else
            "Leaf"
    end as type
from Tree