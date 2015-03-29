# --- Sample dataset

# --- !Ups

insert into contractor_type (id,name) values (1,'Клиент');
insert into contractor_type (id,name) values (2,'Конкурент');
insert into contractor_type (id,name) values (3,'Партнер');
insert into contractor_type (id,name) values (4,'Подрядчик');
insert into contractor_type (id,name) values (5,'Поставщик');

insert into contractor (id,name,contractor_type_id) values (1,'Тони Старк',1);
insert into contractor (id,name,contractor_type_id) values (2,'Черная Вдова',2);
insert into contractor (id,name,contractor_type_id) values (3,'Питер Пен',3);
insert into contractor (id,name,contractor_type_id) values (4,'Питер Паркер',2);
insert into contractor (id,name,contractor_type_id) values (5,'Шерлок Холмс',4);
insert into contractor (id,name,contractor_type_id) values (6,'Вуди Харельсон',5);

insert into contact (id,name,contractor_id,post,phone,adress) values (1,'Брюс Уэйн',1,'миллиардер','+11111','Британия, поместье Бэтмена');
insert into contact (id,name,contractor_id,post,phone,adress) values (2,'Младший брат Тора',2,'сын короля','+22222','Асгард, дворец Одина');
insert into contact (id,name,contractor_id,post,phone,adress) values (3,'Рон Уизли',3,'друг Поттера','+333333','г.Москва, ул.Стрелецкая');
insert into contact (id,name,contractor_id,post,phone,adress) values (4,'Зеленый Гоблин',4,'злодей','+44444','хз');
insert into contact (id,name,contractor_id,post,phone,adress) values (5,'Профессор Мориарти',5,'математик-злодей','+555555','Лондон, Оксфорд');

# --- !Downs

delete from contractor_type;
delete from contact;
delete from contractor;
