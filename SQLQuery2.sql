
select ContactName Adi,CompanyName Sirketadi,City Sehir from Customers

select * from Customers where City='Berlin'
select * from Products where CategoryID=1 or CategoryID=3
select * from Products where CategoryID=1 and UnitPrice>=10
select * from Products where CategoryID=1 order by UnitPrice desc
select count(*) Adet from Products
select categoryID, count(*) from Products where UnitPrice>20  group by CategoryID having count(*)<10
select Products.ProductID,Products.ProductName,Products.UnitPrice,Categories.CategoryName from Products inner join Categories on Products.CategoryID=Categories.CategoryID where Products.UnitPrice>10
select * from Products left join [Order Details] on Products.ProductID=[Order Details].ProductID inner join Orders on Orders.OrderID=[Order Details].OrderID
select * from Customers c left join Orders o on c.CustomerID=o.CustomerID where o.CustomerID is null