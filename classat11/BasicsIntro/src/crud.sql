create database jdbcpractice;
use kcc;
drop database jdbcpractice;
use jdbcpractice;
create table student (
id int,
fName varchar(50),
lName varchar(50),
email varchar(80)
);
drop table if exists student;
create table student (
id int primary key auto_increment,
fName varchar(50),
lName varchar(50),
email varchar(80)
);
insert into jdbcpractice.student values(1, "Pratyush", "Rajbhandari", "Pratyush@gmail.com");
insert into student(fName, lName, email) values("rajesh", "Maskey", "rajesh@gmail.com");
insert into student(fName, lName) values("Prakash", "Bista");
select * from student;
select * from student where id<3;
update student set email='prakash@gmail.com' where id = 3;
delete from student where id = 3;
select * from books;