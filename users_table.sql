create table Users
(
Id int primary key identity ,
Type varchar (10) NOT NULL,
First_name varchar (40) NOT NULL,
Last_name varchar (40) NOT NULL,
User_name varchar (40) unique NOT NULL,
Email_id varchar (50) NOT NULL,
Password varchar (30) NOT NULL,
Gender varchar (6) ,
Country varchar (20) ,
City varchar (20) ,
State varchar (20) ,
Zip_code int ,
Address varchar (50) ,
Card_type varchar (20),
Card_owner varchar (20),
Card_number varchar (20),
CSC varchar (20),
Expiry date,
CNIC varchar (30),
Img varchar(max) ,

)


 alter table Users
 add constraint ck_gender
 check (Gender in ('Male', 'Female'));

 alter table Users
 add constraint ck_type
 check (Type in ('Admin', 'User'));
 
 insert into Users (Type,First_name, Last_name, User_name, Password, Email_id,Img)
 values('Admin','mohammad','uzair','hero',12345,'uzair_1309b@aptechgdn.com','C:\Users\user\Documents\NetBeansProjects\Carbon Autos\src\UserImages\pic1.jpg');
 
 
 insert into Users (Type,First_name, Last_name, User_name, Password, Email_id)
 values('User','bhawish','kumar','bhawish',12345,'bhawish_1309b@aptechgdn.com');
 
 insert into Users (Type,First_name, Last_name, User_name, Password, Email_id)
 values('User','fawad','faisal','faisal','pakistan','fawad_1309b@aptechgdn.com');
 
 insert into Users (Type,First_name, Last_name, User_name, Password, Email_id)
 values('User','rahul','kumar','rahul',12345,'rahul_1309b@aptechgdn.com');
 
 insert into Users (Type,First_name,Last_name,User_name,Email_id,Password,Gender,Country,City,State,Zip_code,Address,Card_type,Card_owner,Card_number,CSC,Expiry,CNIC)
 values('User','mohammad','owais','owais','owais@gmail.com','abc','male','pakistan','karachi','sindh',74400,'garden','visacard','bilal','1234aaa','fly234','2014-11-25',42231415275);

 insert into Users (Type,First_name,Last_name,User_name,Email_id,Password,Gender,Country,City,State,Zip_code,Address,Card_type,Card_owner,Card_number,CSC,Expiry,CNIC)
 values('User','ali','imran','imran','imran@yahoo.com','abc','male','pakistan','lahore','punjab',98760,'lalqila','AMX','mano','112133','goat','2018-05-13',62932243432);

 insert into Users (Type,First_name,Last_name,User_name,Email_id,Password,Gender,Country,City,State,Zip_code,Address,Card_type,Card_owner,Card_number,CSC,Expiry,CNIC)
 values('User','Kashif','Ali','Ali','ali@gmail.com','karachi','male','pakistan','karachi','sindh',54300,'clifton','Mastercard','person','gt5543A','cheetah','2016-12-03',98787486545);

 insert into Users (Type,First_name,Last_name,User_name,Email_id,Password,Gender,Country,City,State,Zip_code,Address,Card_type,Card_owner,Card_number,CSC,Expiry,CNIC)
 values('User','Kasshif','Aali','Aali','alis@gmail.com','karachi','male','pakistan','karachi','sindh',54300,'clifton','Mastercard','person','','cheetah','2016-12-03','');

delete from Users where User_name =  'Aali';
 select * from Users;