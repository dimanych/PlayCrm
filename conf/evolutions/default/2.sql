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

insert into communication (id,home_phone,mobile_phone,work_phone,skype,email,www,social_account,other) values (1,'(323) 323-432','(233) 222-122','(212) 959-988','skypeNick','email@site.com','www.ololo.cpm,','socalAccoun2','other');
insert into communication (id,home_phone,mobile_phone,work_phone,skype,email,www,social_account,other) values (2,'(363) 343-734','(733) 242-172','(414) 141-921','skyIrom','jo@jack.com','yandex.ru','socalAccount1','other');

insert into contractor (id,name,contractor_type_id,adress) values (1,'Ололо-Софт',1,'Москва');
insert into contractor (id,name,contractor_type_id,adress) values (2,'Apple',2,'New York');
insert into contractor (id,name,contractor_type_id,adress) values (3,'General Motors Inc',3,'Mexico');
insert into contractor (id,name,contractor_type_id,adress) values (4,'Газпром',2,'Antarctica');
insert into contractor (id,name,contractor_type_id,adress) values (5,'Рога и копыта',4,'Atlantida');
insert into contractor (id,name,contractor_type_id,adress) values (6,'Международный банк',5,'Урюпинск');

insert into deal (id,name,contractor_id,deal_phase_id,start_date,end_date,budget) values (1,'Альфабизнес Продажа услуг',1,3,'03.04.2015','06.04.2015',3213);
insert into deal (id,name,contractor_id,deal_phase_id,start_date,end_date,budget) values (2,'Бетабизнес Продажа услуг',2,4,'03.04.2015','06.04.2015',12356);
insert into deal (id,name,contractor_id,deal_phase_id,start_date,end_date,budget) values (3,'Альфабизнес23 Продажа услуг',3,1,'03.04.2015','06.04.2015',35445);
insert into deal (id,name,contractor_id,deal_phase_id,start_date,end_date,budget) values (4,'Альфанес342 Продажа услуг',4,2,'03.04.2015','06.04.2015',9534);

insert into contact (id,name,contractor_id,post,communication_id,adress) values (1,'Брюс Уэйн',1,'миллиардер',1,'Британия, поместье Бэтмена');
insert into contact (id,name,contractor_id,post,communication_id,adress) values (2,'Младший брат Тора',2,'сын короля',2,'Асгард, дворец Одина');
insert into contact (id,name,contractor_id,post,communication_id,adress) values (3,'Рон Уизли',3,'друг Поттера',1,'г.Москва, ул.Стрелецкая');
insert into contact (id,name,contractor_id,post,communication_id,adress) values (4,'Зеленый Гоблин',4,'злодей',2,'хз');
insert into contact (id,name,contractor_id,post,communication_id,adress) values (5,'Профессор Мориарти',5,'математик-злодей',1,'Лондон, Оксфорд');

# --- !Downs

delete from contractor_type;
delete from deal_phase;
delete from communication;
delete from deal;
delete from contact;
delete from contractor;