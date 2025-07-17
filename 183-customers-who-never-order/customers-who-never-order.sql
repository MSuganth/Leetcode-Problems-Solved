# Write your MySQL query statement below
select n.name as Customers from Customers n where id not in (select o.customerId from Orders o);