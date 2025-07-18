# Write your MySQL query statement below
select b.book_id,l.title,l.author,l.genre,l.publication_year,l.total_copies as current_borrowers
from borrowing_records b
left join library_books l
on b.book_id = l.book_id
where return_date is null
group by b.book_id
having l.total_copies = count(b.return_date is null)
order by count(b.return_date is null) desc ,l.title asc


-- b.book_id,l.title,l.author,l.genre,l.publication_year,count(b.return_date is null) as current_borrowers

-- b.book_id,b.borrow_date,b.return_date,l.total_copies,count(b.return_date is null)
