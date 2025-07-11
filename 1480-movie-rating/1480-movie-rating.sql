# Write your MySQL query statement below
(
    select 
        u.name as results
    from MovieRating mr
    join Users u
    on u.user_id=mr.user_id
    group by mr.user_id
    order by count(mr.rating) desc , u.name
    limit 1
)
union all

(select m.title as results
from Movierating mr
left join Movies m
on mr.movie_id = m.movie_id
where month(mr.created_at)='2' and year(mr.created_at)='2020'
group by mr.movie_id
order by avg(mr.rating) desc,m.title
limit 1)
