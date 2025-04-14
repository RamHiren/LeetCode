# Write your MySQL query statement below
-- select email as Email
-- from Person 
-- group by email
-- having count(id)>1;


select email as Email
from (
    SELECT email AS Email, COUNT(*) AS count
    FROM Person
    GROUP BY email
) as p1
where count > 1;