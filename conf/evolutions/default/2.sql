# --- Sample dataset

# --- !Ups

insert into contractor_type (id,name) values (1,'Клиент');
insert into contractor_type (id,name) values (2,'Конкурент');
insert into contractor_type (id,name) values (3,'Партнер');
insert into contractor_type (id,name) values (4,'Подрядчик');
insert into contractor_type (id,name) values (5,'Поставщик');

insert into sale_phase (id,name) values (1,'Установление контакта');
insert into sale_phase (id,name) values (2,'Выявление потребностей');
insert into sale_phase (id,name) values (3,'Презентация товара');
insert into sale_phase (id,name) values (4,'Работа с возражениями');
insert into sale_phase (id,name) values (5,'Завершение сделки');

insert into communication (id,home_phone,mobile_phone,work_phone,skype,email,www,social_account,other) values (1,'+1','+2','+3','skype','email','www','socalAccount','other');

insert into contractor (id,name,contractor_type_id) values (1,'Тони Старк',1);
insert into contractor (id,name,contractor_type_id) values (2,'Черная Вдова',2);
insert into contractor (id,name,contractor_type_id) values (3,'Питер Пен',3);
insert into contractor (id,name,contractor_type_id) values (4,'Питер Паркер',2);
insert into contractor (id,name,contractor_type_id) values (5,'Шерлок Холмс',4);
insert into contractor (id,name,contractor_type_id) values (6,'Вуди Харельсон',5);

insert into sale (id,name,contractor_id,sale_phase_id) values (1,'Альфабизнес Продажа услуг',1,3);
insert into sale (id,name,contractor_id,sale_phase_id) values (2,'Бетабизнес Продажа услуг',2,4);
insert into sale (id,name,contractor_id,sale_phase_id) values (3,'Альфабизнес23 Продажа услуг',3,1);
insert into sale (id,name,contractor_id,sale_phase_id) values (4,'Альфанес342 Продажа услуг',4,2);

insert into contact (id,name,contractor_id,post,communication_id,adress) values (1,'Брюс Уэйн',1,'миллиардер',1,'Британия, поместье Бэтмена');
insert into contact (id,name,contractor_id,post,communication_id,adress) values (2,'Младший брат Тора',2,'сын короля',1,'Асгард, дворец Одина');
insert into contact (id,name,contractor_id,post,communication_id,adress) values (3,'Рон Уизли',3,'друг Поттера',1,'г.Москва, ул.Стрелецкая');
insert into contact (id,name,contractor_id,post,communication_id,adress) values (4,'Зеленый Гоблин',4,'злодей',1,'хз');
insert into contact (id,name,contractor_id,post,communication_id,adress) values (5,'Профессор Мориарти',5,'математик-злодей',1,'Лондон, Оксфорд');

# --- !Downs

delete from contractor_type;
delete from sale_phase;
delete from communication;
delete from sale;
delete from contact;
delete from contractor;