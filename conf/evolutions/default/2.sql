# --- Sample dataset

# --- !Ups

insert into contractor_type (id,name) values (1,'Клиент');
insert into contractor_type (id,name) values (2,'Конкурент');
insert into contractor_type (id,name) values (3,'Партнер');
insert into contractor_type (id,name) values (4,'Подрядчик');
insert into contractor_type (id,name) values (5,'Поставщик');

insert into deal_phase (id,name) values (1,'Установление контакта');
insert into deal_phase (id,name) values (2,'Выявление потребностей');
insert into deal_phase (id,name) values (3,'Презентация товара');
insert into deal_phase (id,name) values (4,'Работа с возражениями');
insert into deal_phase (id,name) values (5,'Завершение сделки');

# --- !Downs

delete from contractor_type;
delete from deal_phase;
