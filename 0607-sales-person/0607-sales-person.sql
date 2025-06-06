# Write your MySQL query statement below
with temp as (
    select sales_id
    from Orders o
    left join Company c
    on o.com_id = c.com_id
    where c.name = "RED"
)

select name
from SalesPerson
where sales_id not in(select sales_id from temp);