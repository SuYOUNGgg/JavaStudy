create table USERS
(
    user2    varchar2(2),
    item1   varchar2(2),
    item2   varchar2(2)
)
insert into users values('a','1','1');
insert into users values('a','1','2');
insert into users values('a','2','2');
insert into users values('a','1','3');
select * from users;

create table items
(
    item varchar2(2),
    item_name varchar2(10)
)

insert into items values('1','��ǰ1');
insert into items values('2','��ǰ2');
insert into items values('3','��ǰ3');
insert into items values('4','��ǰ4');
select (select item_name from items where item = users.item1) "item 1",
(select item_name from items where item = users.item2) "item 2"
from users;