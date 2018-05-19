create table Sales
(
Id int primary key identity ,
Date datetime,
User_id int ,
Car_id int 

)

insert into Sales values(GETDATE(),1,3);
insert into Sales values(GETDATE(),6,2);
insert into Sales values(GETDATE(),4,4);
insert into Sales values(GETDATE(),5,1);
insert into Sales values(GETDATE(),2,3);
insert into Sales values(GETDATE(),4,3);

select * from Sales





 