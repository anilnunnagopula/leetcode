# Write your MySQL query statement below

SELECT * FROM Patients
-- where conditions like '%DIAB1%';
where conditions REGEXP '(^| )DIAB1';
