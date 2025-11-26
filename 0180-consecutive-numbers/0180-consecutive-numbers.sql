# Write your MySQL query statement below

with cte as(
    select num,
    LEAD(num,1,0) OVER(order by id) as ld,
    LAG(num,1,0) OVER(order by id) as lg
    from Logs
)

select distinct num ConsecutiveNums 
from cte
where num=ld and num=lg;