select department, max(salary), avg(salary) from employees
group by department
having count(*) > 1