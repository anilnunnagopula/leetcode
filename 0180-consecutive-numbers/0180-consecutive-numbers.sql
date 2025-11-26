# Write your MySQL query statement below

select distinct num as ConsecutiveNums
from (
    select num,
    LEAD(num,1,0) over(order by id) as Ld,
    LAG(num,1,0) over(order by id) as Lg
    from Logs
) t
where num=ld and num=lg;

