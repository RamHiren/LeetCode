with S as (
    select p.patient_id, DATEDIFF(MIN(n.test_date),MIN(p.test_date)) as rdate
    from covid_tests p
    join covid_tests n
    on  p.patient_id = n.patient_id and  p.test_date < n.test_date  
    where p.result="Positive" and n.result="Negative"
    group by p.patient_id
)

select p.patient_id,p.patient_name,p.age,s.rdate as recovery_time 
from patients p
join S s
on p.patient_id =s.patient_id 
order by s.rdate,p.age