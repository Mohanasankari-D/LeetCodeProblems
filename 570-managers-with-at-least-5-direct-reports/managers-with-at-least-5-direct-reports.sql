# Write your MySQL query statement below
select s.name 
from Employee e 
join Employee s
on e.managerId=s.id
group by s.name,s.id
having count(*)>=5;