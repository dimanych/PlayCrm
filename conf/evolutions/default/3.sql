# --- Sample dataset

# --- !Ups

insert into communication (id,home_phone,mobile_phone,work_phone,skype,email,www,social_account,other) values (1,'+7(100)000-00 00','+7(200)000-00 00','+7(300)000-00 00','skype1','mail@site1.com','site1.com','socalAccount1','other1');
insert into communication (id,home_phone,mobile_phone,work_phone,skype,email,www,social_account,other) values (2,'+7(010)000-00 00','+7(020)000-00 00','+7(030)000-00 00','skype2','mail@site2.com','site2.com','socalAccount2','other2');
insert into communication (id,home_phone,mobile_phone,work_phone,skype,email,www,social_account,other) values (3,'+7(001)000-00 00','+7(002)000-00 00','+7(003)000-00 00','skype3','mail@site3.com','site3.com','socalAccount3','other3');
insert into communication (id,home_phone,mobile_phone,work_phone,skype,email,www,social_account,other) values (4,'+7(000)100-00 00','+7(000)200-00 00','+7(000)300-00 00','skype4','mail@site4.com','site4.com','socalAccount4','other4');
insert into communication (id,home_phone,mobile_phone,work_phone,skype,email,www,social_account,other) values (5,'+7(000)010-00 00','+7(000)020-00 00','+7(000)030-00 00','skype5','mail@site5.com','site5.com','socalAccount5','other5');

insert into contractor (id,name,contractor_type_id,adress,www,fax,mail,extension_phone) values (1,'Уэйн Энтерпрайзис',1,'Готэм, Башня Уэйнов','waine.com',1212,'mail@waine.com','+7(000)010-00 00');
-- insert into contractor (id,name,contractor_type_id) values (2,'Apple',2);
-- insert into contractor (id,name,contractor_type_id) values (3,'General Motors Inc',3);
-- insert into contractor (id,name,contractor_type_id) values (4,'Газпром',2);
-- insert into contractor (id,name,contractor_type_id) values (5,'Рога и копыта',4);
-- insert into contractor (id,name,contractor_type_id) values (6,'Международный банк',5);

insert into contact (id,name,contractor_id,post,communication_id,adress) values (1,'Брюс Уэйн',1,'миллиардер',1,'Готэм, поместье Уэйнов');
-- insert into contact (id,name,contractor_id,post,communication_id,adress) values (2,'Младший брат Тора',2,'сын короля',1,'Асгард, дворец Одина');
-- insert into contact (id,name,contractor_id,post,communication_id,adress) values (3,'Рон Уизли',3,'друг Поттера',1,'г.Москва, ул.Стрелецкая');
-- insert into contact (id,name,contractor_id,post,communication_id,adress) values (4,'Зеленый Гоблин',4,'злодей',1,'хз');
-- insert into contact (id,name,contractor_id,post,communication_id,adress) values (5,'Профессор Мориарти',5,'математик-злодей',1,'Лондон, Оксфорд');

insert into deal (id,name,contractor_id,deal_phase_id,start_date,end_date,budget) values (1,'Сделка1',1,2,'2014-06-06','2015-10-10',20);

insert into product (id,name,code,price,characteristic) values(1,'Сюрикен Бэтмана',212,15000,'Быстрый, резкий, сделан из кевлара');
insert into product (id,name,code,price,characteristic) values(2,'Шлем Бэтмана',213,55000,'Имеет 2 ушка, сделан из кевлара');
insert into product (id,name,code,price,characteristic) values(3,'Плащ темного рыцаря',214,155000,'Легко складывается, в полете выдерживает нагрузку до 300 кг');

insert into order_entity (id,name,number,date,contractor_id,contact_id,plan_execution_date,execution_date,amount,payment,order_state,payment_state,supply_state,deal_id) values (1,'Заказ на сюрикены',21,'2012-01-02',1,1,'2012-02-02','2012-03-02',500,600,2,2,2,1);

insert into supply_payment (id, name, supply_payment_type, plan_date, percentage, sum_plan, delay, fact_date, state, sum_fact, order_id) values (1, 'Шаг1', 0, '2015-05-05', 12, 500, 2, '2015-05-15', 0, 600, 1);
insert into supply_payment (id, name, supply_payment_type, plan_date, percentage, sum_plan, delay, fact_date, state, sum_fact, order_id) values (2, 'Шаг2', 1, '2015-05-06', 20, 120, 1, '2015-05-12', 0, 120, 1);

# --- !Downs
