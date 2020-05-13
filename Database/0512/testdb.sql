select grade, name, weight
from student
where (grade, weight) in  (select grade, max(weight) from student group by grade)
order by 1;

select grade, max(weight) from student group by grade;