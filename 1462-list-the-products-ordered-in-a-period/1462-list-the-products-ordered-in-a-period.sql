# Write your MySQL query statement below
SELECT p.product_name,sum(o.unit) as unit
from Products p
left join Orders o
on p.product_id=o.product_id
where month(o.order_date)=2 and Year(o.order_date)=2020
group by o.product_id
Having sum(o.unit)>=100