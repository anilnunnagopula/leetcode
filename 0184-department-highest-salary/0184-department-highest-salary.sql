# Write your MySQL query statement below

Select d.name  as Department , e.name as Employee,e.salary as Salary
FROM Employee e
left join Department as d
on e.DepartmentId=d.Id
where (d.id,e.salary) in (
    SELECT departmentId , max(salary)
    From Employee
    group by departmentId 
)
