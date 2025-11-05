# Write your MySQL query statement below

SELECT u.name, COALESCE(sum(r.distance),0) as travelled_distance
from Users u
left join Rides r
on u.id=r.user_id
group by r.user_id
order by travelled_distance desc,u.name ASC