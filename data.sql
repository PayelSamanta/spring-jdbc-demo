create table person(
id integer not null,
name varchar(255) not null,
location varchar(225),
birth_date timestamp,
primary key(id)
);

insert into person(id,name,location,birth_date) values(1001,'Payel','Bangalore',sysdate());
insert into person(id,name,location,birth_date) values(1002,'Sona','Hyderabad',sysdate());
insert into person(id,name,location,birth_date) values(1003,'Palu','Pune',sysdate());
insert into person(id,name,location,birth_date) values(1004,'Khuku','Kolkata',sysdate());